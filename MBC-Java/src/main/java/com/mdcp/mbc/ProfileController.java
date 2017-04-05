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

import com.mdcp.mbc.model.City;
import com.mdcp.mbc.model.Profile;

import com.mdcp.mbc.model.Speciality;
import com.mdcp.mbc.model.State;
import com.mdcp.mbc.service.ProfileService;
import com.mdcp.mbc.service.SpecialityService;
import com.mdcp.mbc.service.StateService;
import com.mdcp.mbc.service.CityService;
@Controller
public class ProfileController {
	 
	private SpecialityService specialityService;
	private StateService stateService;
	private CityService cityService;
	private static String UPLOADED_FOLDER = "D:\\";

	private ProfileService ProfileService;
	
	@Autowired(required=true)
	@Qualifier(value="ProfileService")
	public void setProfileService(ProfileService ps){
		this.ProfileService = ps;
	}
	
	
//////////////////////////////
@RequestMapping(value= "/Profile/upload", method = RequestMethod.POST)
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

@RequestMapping(value= "/Profile/pdfupload", method = RequestMethod.POST)
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

//many to many start
@Autowired(required=true)	
@Qualifier(value="stateService")
public void setStateService(StateService ps){
	this.stateService = ps;
}

//many to many start
@Autowired(required=true)	
@Qualifier(value="cityService")
public void setCityService(CityService ps){
	this.cityService = ps;
}








	
	@RequestMapping(value = "/Profile", method = RequestMethod.GET)
	public String listPersons(Model model ) {
		model.addAttribute("Profile", new Profile());
		model.addAttribute("listProfiles", this.ProfileService.listProfiles());
		return "Profile";
	}
	////////////////////////////////
	
	
	
	@RequestMapping(value = "/Profile/getProfile", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getAll(String userName, HttpServletRequest request) {
	Map<String, Object> result = new HashMap<String, Object>();
	int page = request.getParameter("page") == null ? 1 : Integer
	.parseInt(request.getParameter("page"));
	int rows = request.getParameter("rows") == null ? 10 : Integer
	.parseInt(request.getParameter("rows"));
	
	// Use the spring BeanUtils tool, copy attribute to u.
	// BeanUtils.copyProperties(this, user);
	List<Profile> list = this.ProfileService.listProfiles();
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
	
	@RequestMapping(value= "/Profile/add", method = RequestMethod.POST)
	//old before relation 
	//public @ResponseBody Profile addProfile(@RequestBody Profile p){
	public ResponseEntity<String> addProfile(@RequestBody Profile p,@RequestParam String specialityId,String stateId,String cityId ){
		
		if(p.getId() == 0){
			
			
			Speciality st =specialityService.getSpecialityById(Integer.parseInt(specialityId));
			State sta =stateService.getStateById(Integer.parseInt(stateId));
			City cit =cityService.getCityById(Integer.parseInt(cityId));
			
	
			p.setSpeciality(st);
			p.setCity(cit);
			p.setState(sta);
			
		this.ProfileService.addProfile(p);
		return new ResponseEntity<String>("Profile Added SuccessFully!",HttpStatus.OK);
		
		}else{
			
			this.ProfileService.updateProfile(p);
			return new ResponseEntity<String>("Profile  Updated SuccessFully!",HttpStatus.OK);
		}
		
		
		
	}
	

	
	
	@RequestMapping("/Profile/remove/{id}")
   public String removeProfile(@PathVariable("id") int id){
		
       this.ProfileService.removeProfile(id);
       return "redirect:/Profiles";
   }

   @RequestMapping("Profile/edit/{id}")
   public String editPerson(@PathVariable("id") int id, Model model){
       model.addAttribute("person", this.ProfileService.getProfileById(id));
       model.addAttribute("listPersons", this.ProfileService.listProfiles());
       return "Profile";
   }
	
}
