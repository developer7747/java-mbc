package com.mdcp.mbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mdcp.mbc.model.Speciality;
import com.mdcp.mbc.service.SpecialityService;

@Controller
public class SpecialityController {

	 
	

	private SpecialityService SpecialityService;
	
	@Autowired(required=true)
	@Qualifier(value="SpecialityService")
	public void setSpecialityService(SpecialityService ps){
		this.SpecialityService = ps;
	}
	
	@RequestMapping(value = "/speciality", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("Speciality", new Speciality());
		model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
		return "Speciality";
	}
	////////////////////////////////
	
	
	
	@RequestMapping(value = "/speciality/getSpeciality", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getAll(String userName, HttpServletRequest request) {
	Map<String, Object> result = new HashMap<String, Object>();
	int page = request.getParameter("page") == null ? 1 : Integer
	.parseInt(request.getParameter("page"));
	int rows = request.getParameter("rows") == null ? 10 : Integer
	.parseInt(request.getParameter("rows"));
	
	// Use the spring BeanUtils tool, copy attribute to u.
	// BeanUtils.copyProperties(this, user);
	List<Speciality> list = this.SpecialityService.listSpecialitys();
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
	
	@RequestMapping(value= "/speciality/add", method = RequestMethod.POST)
	public @ResponseBody Speciality addSpeciality(@RequestBody Speciality p){
		
		if(p.getId() == 0){
			//new person, add it
			this.SpecialityService.addSpeciality(p);
			return p;
		}else{
			//existing person, call update
			this.SpecialityService.updateSpeciality(p);
			return p;
		}
		
		//return "redirect:/Specialitys";
		
	}
	
	@RequestMapping("/speciality/remove/{id}")
    public String removeSpeciality(@PathVariable("id") int id){
		
        this.SpecialityService.removeSpeciality(id);
        return "redirect:/Specialitys";
    }
 
    @RequestMapping("Speciality/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", this.SpecialityService.getSpecialityById(id));
        model.addAttribute("listPersons", this.SpecialityService.listSpecialitys());
        return "Speciality";
    }
	
	
	
	
	
	
	
}
