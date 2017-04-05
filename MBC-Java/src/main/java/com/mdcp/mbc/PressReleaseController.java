package com.mdcp.mbc;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mdcp.mbc.model.PressRelease;

import com.mdcp.mbc.model.Speciality;

import com.mdcp.mbc.service.PressReleaseService;
import com.mdcp.mbc.service.SpecialityService;

@Controller
public class PressReleaseController {
	 
	private SpecialityService specialityService;
	private static String UPLOADED_FOLDER = "D:\\";

	private PressReleaseService PressReleaseService;
	
	@Autowired(required=true)
	@Qualifier(value="PressReleaseService")
	public void setPressReleaseService(PressReleaseService ps){
		this.PressReleaseService = ps;
	}
	
	
//////////////////////////////
@RequestMapping(value= "/PressRelease/upload", method = RequestMethod.POST)
public ResponseEntity <String> upload(@RequestParam("uploadImage") MultipartFile file) {

try {

byte[] bytes = file.getBytes();
Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
Files.write(path, bytes);
} catch (IOException e) {
e.printStackTrace();
}
//rest of the code goes here...
return new ResponseEntity<String>(file.getOriginalFilename(), HttpStatus.OK);
}

@RequestMapping(value= "/PressRelease/pdfupload", method = RequestMethod.POST)
public @ResponseBody Map<String, Object> pdfupload(@RequestParam("pdfupload") MultipartFile file) {

try {

byte[] bytes = file.getBytes();
Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
Files.write(path, bytes);
} catch (IOException e) {
e.printStackTrace();
}
//rest of the code goes here...
return null;
}

//many to many start
@Autowired(required=true)	
@Qualifier(value="SpecialityService")
public void setSpecialityService(SpecialityService ps){
	this.specialityService = ps;
}


	
	@RequestMapping(value = "/PressRelease", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("PressRelease", new PressRelease());
		model.addAttribute("listPressReleases", this.PressReleaseService.listPressReleases());
		return "PressRelease";
	}
	////////////////////////////////
	
	
	
	@RequestMapping(value = "/PressRelease/getPressRelease", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getAll(String userName, HttpServletRequest request) {
	Map<String, Object> result = new HashMap<String, Object>();
	int page = request.getParameter("page") == null ? 1 : Integer
	.parseInt(request.getParameter("page"));
	int rows = request.getParameter("rows") == null ? 10 : Integer
	.parseInt(request.getParameter("rows"));
	
	// Use the spring BeanUtils tool, copy attribute to u.
	// BeanUtils.copyProperties(this, user);
	List<PressRelease> list = this.PressReleaseService.listPressReleases();
	int total = list.size();
	if(list==null||list.size()==0){
	result.put("records", 10);//
	}else{
	result.put("rows", list);
	}
	result.put("records", 10);
	result.put("total", total);
	result.put("page", 1);
	return result;
	} 
	
	
	
	
	//////////////////////////////
	
	//For add and update person both
	
	@RequestMapping(value= "/PressRelease/add", method = RequestMethod.POST)
	//old before relation 
	//public @ResponseBody PressRelease addPressRelease(@RequestBody PressRelease p){
	public ResponseEntity<String> addPressRelease(@RequestBody PressRelease p,@RequestParam String specialityId ){
		
		if(p.getId() == 0){
			
			
			Speciality st =specialityService.getSpecialityById(Integer.parseInt(specialityId));
			//old
			//this.PressReleaseService.addPressRelease(p);
			//return p;
	
			p.setSpeciality(st);
		this.PressReleaseService.addPressRelease(p);
		return new ResponseEntity<String>("PressRelease Added SuccessFully!",HttpStatus.OK);
		
		}else{
			
			this.PressReleaseService.updatePressRelease(p);
			return new ResponseEntity<String>("PressRelease  Updated SuccessFully!",HttpStatus.OK);
		}
		
		
		
	}
	

	
	
	@RequestMapping("/PressRelease/remove/{id}")
   public String removePressRelease(@PathVariable("id") int id){
		
       this.PressReleaseService.removePressRelease(id);
       return "redirect:/PressReleases";
   }

   @RequestMapping("PressRelease/edit/{id}")
   public String editPerson(@PathVariable("id") int id, Model model){
       model.addAttribute("person", this.PressReleaseService.getPressReleaseById(id));
       model.addAttribute("listPersons", this.PressReleaseService.listPressReleases());
       return "PressRelease";
   }
	
}
