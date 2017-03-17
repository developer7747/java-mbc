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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mdcp.mbc.model.State;
import com.mdcp.mbc.service.StateService;

@Controller(value = "/states")
public class StateController {
	
	private StateService stateService;
	
	@Autowired(required=true)
	@Qualifier(value="stateService")
	public void setPersonService(StateService ps){
		this.stateService = ps;
	}
	
	@RequestMapping(value = "/states", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("state", new State());
		model.addAttribute("listStates", this.stateService.listStates());
		return "state";
	}
	////////////////////////////////
	
	@RequestMapping("studentttt")
	 public @ResponseBody
	 Object getStudentList() {
		Object jsonData;
		Object response = new Object();
		//response.(this.personService.listPersons());
	return this.stateService.listStates();
	 }
	
	@RequestMapping(value = "/higgg", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getAll(String userName, HttpServletRequest request) {
	Map<String, Object> result = new HashMap<String, Object>();
	int page = request.getParameter("page") == null ? 1 : Integer
	.parseInt(request.getParameter("page"));
	int rows = request.getParameter("rows") == null ? 10 : Integer
	.parseInt(request.getParameter("rows"));
	
	// Use the spring BeanUtils tool, copy attribute to u.
	// BeanUtils.copyProperties(this, user);
	List<State> list = this.stateService.listStates();
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
	
//	//For add and update person both
//	@RequestMapping(value= "/person/add", method = RequestMethod.POST)
//	public String addPerson(@ModelAttribute("person") Person p){
//		
//		if(p.getId() == 0){
//			//new person, add it
//			this.personService.addPerson(p);
//		}else{
//			//existing person, call update
//			this.personService.updatePerson(p);
//		}
//		
//		return "redirect:/persons";
//		
//	}
//	
//	@RequestMapping("/remove/{id}")
//    public String removePerson(@PathVariable("id") int id){
//		
//        this.personService.removePerson(id);
//        return "redirect:/persons";
//    }
// 
//    @RequestMapping("/edit/{id}")
//    public String editPerson(@PathVariable("id") int id, Model model){
//        model.addAttribute("person", this.personService.getPersonById(id));
//        model.addAttribute("listPersons", this.personService.listPersons());
//        return "person";
//    }
	
}
