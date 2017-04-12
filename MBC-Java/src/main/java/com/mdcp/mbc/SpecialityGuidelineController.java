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

import com.mdcp.mbc.model.SpecialityGuideline;
import com.mdcp.mbc.model.State;
import com.mdcp.mbc.service.SpecialityGuidelineService;

@Controller
public class SpecialityGuidelineController {

	private static String UPLOADED_FOLDER = "D:\\";
	@RequestMapping(value= "/specialityguideline/upload", method = RequestMethod.POST)
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

	private SpecialityGuidelineService SpecialityGuidelineService;
	
	@Autowired(required=true)
	@Qualifier(value="SpecialityGuidelineService")
	public void setSpecialityGuidelineService(SpecialityGuidelineService ps){
		this.SpecialityGuidelineService = ps;
	}
	
	@RequestMapping(value = "/SpecialityGuideline", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("SpecialityGuideline", new SpecialityGuideline());
		model.addAttribute("listSpecialityGuidelines", this.SpecialityGuidelineService.listSpecialityGuidelines());
		return "SpecialityGuideline";
	}
	////////////////////////////////
	

	@RequestMapping(value = "/SpecialityGuideline/getSpecialityGuideline1", method = RequestMethod.GET)
	public @ResponseBody
	List<SpecialityGuideline> getSpecialityGuidelineList() {
	return this.SpecialityGuidelineService.listSpecialityGuidelines();
	} 
	
	@RequestMapping(value = "/SpecialityGuideline/getSpecialityGuideline", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getAll(String userName, HttpServletRequest request) {
	Map<String, Object> result = new HashMap<String, Object>();
	int page = request.getParameter("page") == null ? 1 : Integer
	.parseInt(request.getParameter("page"));
	int rows = request.getParameter("rows") == null ? 10 : Integer
	.parseInt(request.getParameter("rows"));
	
	// Use the spring BeanUtils tool, copy attribute to u.
	// BeanUtils.copyProperties(this, user);
	List<SpecialityGuideline> list = this.SpecialityGuidelineService.listSpecialityGuidelines();
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
	
	@RequestMapping(value= "/specialityguideline/add", method = RequestMethod.POST)
	public @ResponseBody SpecialityGuideline addSpecialityGuideline(@RequestBody SpecialityGuideline p){
		
		if(p.getId() == 0){
			//new person, add it
			this.SpecialityGuidelineService.addSpecialityGuideline(p);
			return p;
		}else{
			//existing person, call update
			this.SpecialityGuidelineService.updateSpecialityGuideline(p);
			return p;
		}
		
		//return "redirect:/SpecialityGuidelines";
		
	}
	
	@RequestMapping("/SpecialityGuideline/remove/{id}")
    public String removeSpecialityGuideline(@PathVariable("id") int id){
		
        this.SpecialityGuidelineService.removeSpecialityGuideline(id);
        return "redirect:/SpecialityGuidelines";
    }
 
    @RequestMapping("SpecialityGuideline/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", this.SpecialityGuidelineService.getSpecialityGuidelineById(id));
        model.addAttribute("listPersons", this.SpecialityGuidelineService.listSpecialityGuidelines());
        return "SpecialityGuideline";
    }
	
	
	
	
	
	
	
}
