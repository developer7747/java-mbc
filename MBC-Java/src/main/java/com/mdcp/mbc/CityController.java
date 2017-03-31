package com.mdcp.mbc;

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

import com.mdcp.mbc.model.City;
import com.mdcp.mbc.model.State;
import com.mdcp.mbc.service.CityService;
import com.mdcp.mbc.service.StateService;


@Controller
public class CityController {
	
	private CityService cityService;
	private StateService stateService;
	
	@Autowired(required=true)
	@Qualifier(value="cityService")
	
	public void setcityService(CityService ps){
		this.cityService = ps;
	}
	
	@Autowired(required=true)	
	@Qualifier(value="stateService")
	public void setStateService(StateService ps){
		this.stateService = ps;
	}
	
	
	@RequestMapping(value = "/citys", method = RequestMethod.GET)
	public String listCitys(Model model) {
		return "city";
	}
	////////////////////////////////
	
	@RequestMapping("city/student12")
	 public @ResponseBody
	 Object getStudentList() {
		Object jsonData;
		Object response = new Object();
		//response.(this.personService.listPersons());
	return this.cityService.listCitys();
	 }
	
	@RequestMapping(value = "/city/getcity", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getAll(String userName, HttpServletRequest request) {
	Map<String, Object> result = new HashMap<String, Object>();
	int page = request.getParameter("page") == null ? 1 : Integer
	.parseInt(request.getParameter("page"));
	int rows = request.getParameter("rows") == null ? 10 : Integer
	.parseInt(request.getParameter("rows"));
	
	// Use the spring BeanUtils tool, copy attribute to u.
	// BeanUtils.copyProperties(this, user);
	List<City> list = this.cityService.listCitys();
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
	
	@RequestMapping(value= "/city/add", method = RequestMethod.POST)
	public ResponseEntity<String> addCity(@RequestBody City c,@RequestParam String stateId){
		
		
		if(c.getid() == 0){
			State st =  stateService.getStateById(Integer.parseInt(stateId) );		       
			c.setState(st);
			//c.setCityName("rrrrrrrrr");
			//c.getState().setId(1);
			//new person, add it
//			model.addAttribute("personId", personId);
//			model.addAttribute("personId", personId);
			this.cityService.addCity(c);
			
			 return new ResponseEntity<String>("City Added Successfully!", HttpStatus.OK);
		}else{
			//existing person, call update
			this.cityService.updateCity(c);
			return new ResponseEntity<String>("City Updated Successfully!", HttpStatus.OK);
		}
		
		//return "redirect:/citys";
		
	}
	
	@RequestMapping("/city/remove/{id}")
    public String removecity(@PathVariable("id") int id){
		
        this.cityService.removeCity(id);
        return "redirect:/citys";
    }
 
    @RequestMapping("city/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", this.cityService.getCityById(id));
        model.addAttribute("listPersons", this.cityService.listCitys());
        return "City";
    }
	
}
