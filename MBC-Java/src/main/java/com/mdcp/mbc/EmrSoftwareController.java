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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mdcp.mbc.model.EmrSoftware;
import com.mdcp.mbc.service.EmrSoftwareService;
@Controller
public class EmrSoftwareController {
	 
		private static String UPLOADED_FOLDER = "C:/Users/sumit/Desktop/LatesMbc2/java-mbc/MBC-Java/src/main/webapp/resources/images/admin";

		private EmrSoftwareService EmrSoftwareService;
		
		@Autowired(required=true)
		@Qualifier(value="EmrSoftwareService")
		public void setEmrSoftwareService(EmrSoftwareService ps){
			this.EmrSoftwareService = ps;
		}
		
		
	//////////////////////////////
	@RequestMapping(value= "/EmrSoftware/upload", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> upload(@RequestParam("uploadImage") MultipartFile file) {

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
		
		@RequestMapping(value = "/EmrSoftware", method = RequestMethod.GET)
		public String listPersons(Model model) {
			model.addAttribute("EmrSoftware", new EmrSoftware());
			model.addAttribute("listEmrSoftwares", this.EmrSoftwareService.listEmrSoftwares());
			return "EmrSoftware";
		}
		////////////////////////////////
		
		
		
		@RequestMapping(value = "/EmrSoftware/getEmrSoftware", method = RequestMethod.GET)
		public @ResponseBody
		Map<String, Object> getAll(String userName, HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
		int page = request.getParameter("page") == null ? 1 : Integer
		.parseInt(request.getParameter("page"));
		int rows = request.getParameter("rows") == null ? 10 : Integer
		.parseInt(request.getParameter("rows"));
		
		// Use the spring BeanUtils tool, copy attribute to u.
		// BeanUtils.copyProperties(this, user);
		List<EmrSoftware> list = this.EmrSoftwareService.listEmrSoftwares();
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
		
		@RequestMapping(value= "/EmrSoftware/add", method = RequestMethod.POST)
		public @ResponseBody EmrSoftware addEmrSoftware(@RequestBody EmrSoftware p){
			
			if(p.getId() == 0){
				//new person, add it
				this.EmrSoftwareService.addEmrSoftware(p);
				return p;
			}else{
				//existing person, call update
				this.EmrSoftwareService.updateEmrSoftware(p);
				return p;
			}
			
			//return "redirect:/EmrSoftwares";
			
		}
		
		@RequestMapping("/EmrSoftware/remove/{id}")
	    public String removeEmrSoftware(@PathVariable("id") int id){
			
	        this.EmrSoftwareService.removeEmrSoftware(id);
	        return "redirect:/EmrSoftwares";
	    }
	 
	    @RequestMapping("EmrSoftware/edit/{id}")
	    public String editPerson(@PathVariable("id") int id, Model model){
	        model.addAttribute("person", this.EmrSoftwareService.getEmrSoftwareById(id));
	        model.addAttribute("listPersons", this.EmrSoftwareService.listEmrSoftwares());
	        return "EmrSoftware";
	    }
		
		
		
}
