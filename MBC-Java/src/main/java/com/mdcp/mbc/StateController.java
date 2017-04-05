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

import com.mdcp.mbc.model.State;
import com.mdcp.mbc.service.StateService;
import com.mdcp.mbc.service.GenericService;


@Controller
public class StateController<E, K> {
//yuvi	private static String UPLOADED_FOLDER = "G://";
	
	private static String UPLOADED_FOLDER = "D:\\";
	private StateService stateService;
	private GenericService<State, K> gen;
	
	@Autowired(required=true)
	@Qualifier(value="stateService")
	public void setStateService(StateService ps){
		this.stateService = ps;
	}
	
	@RequestMapping(value = "/states", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("state", new State());
		model.addAttribute("listStates", this.stateService.listStates());
		return "state";
	}
	////////////////////////////////
	
	@RequestMapping(value = "/state/getState1", method = RequestMethod.GET)
	public @ResponseBody
	List<State> getStateList() {
	return this.stateService.listStates();
	} 
	
	@RequestMapping(value = "/state/getState", method = RequestMethod.GET)
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
	//List<State> list = gen.getAll();
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
	
	
	
	
	////////////yuvi//////////////////
//	@RequestMapping(value= "/state/upload", method = RequestMethod.POST)
//	public @ResponseBody Map<String, Object> upload(@RequestParam("myimage") MultipartFile file) {
//	    
//		  try {
//        	  
//	            byte[] bytes = file.getBytes();
//	            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
//	            Files.write(path, bytes);
//		  } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//		//rest of the code goes here...
//		return null;
//	}
//	
	
	@RequestMapping(value= "/state/upload", method = RequestMethod.POST)
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	//For add and update person both
	
	@RequestMapping(value= "/state/add", method = RequestMethod.POST)
	public @ResponseBody State addState(@RequestBody State p){
		
		if(p.getId() == 0){
			//new person, add it
			this.stateService.addState(p);
			return p;
		}else{
			//existing person, call update
			this.stateService.updateState(p);
			return p;
		}
		
		//return "redirect:/states";
		
	}
	
	@RequestMapping("/state/remove/{id}")
    public String removeState(@PathVariable("id") int id){
		
        this.stateService.removeState(id);
        return "redirect:/states";
    }
 
    @RequestMapping("state/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", this.stateService.getStateById(id));
        model.addAttribute("listPersons", this.stateService.listStates());
        return "state";
    }
	
}
