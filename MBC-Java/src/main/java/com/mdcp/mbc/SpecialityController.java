package com.mdcp.mbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mdcp.mbc.model.Speciality;
import com.mdcp.mbc.service.ArticleService;
import com.mdcp.mbc.service.SpecialityService;
import com.mdcp.mbc.service.StateService;
@Controller
public class SpecialityController {

	 @Autowired(required = true)
		private SpecialityService SpecialityService;
	 @Autowired(required = true)	
	 private ArticleService ArticleService;
	 
	 @Autowired(required = true)
		@Qualifier(value = "ArticleService")
		public void setArticleService(ArticleService ps) {
			this.ArticleService = ps;
		}

	 @Autowired(required = true)
	 @Qualifier(value = "stateService")
		private StateService StateService;
	 
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

 //working  medical-Billing-Service
    
    @RequestMapping(value = "/medical-billing-service", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("Speciality", new Speciality());
		model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
		return "UI/Specialty";
	}
    
    //specialitey/{param1}
    
    @RequestMapping(value = "/medical-billing-service/{param1}", method = RequestMethod.GET)
  	public String listPersonss(Model model,@PathVariable("param1") String param1) {
  	//	model.addAttribute("Speciality", new Speciality());.
    	
  		model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
  		model.addAttribute("listSpecialitybyName", this.SpecialityService.listSpecialitybyName(param1));
  		model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param1));
  		model.addAttribute("listStates", this.StateService.listStates());
  		model.addAttribute("message",param1);
  		return "UI/SpecialityDynamicpage";
  	}
    //working
    
	
    
    
	@RequestMapping(value = "Admin/Speciality2", method = RequestMethod.GET)
	public String listCat(Model model) {
		model.addAttribute("Speciality", new Speciality());
		model.addAttribute("listSpecialityby", this.SpecialityService.listSpecialityby());
		return "UI/Common/side-content/we-excel";
	}
	
	
	
	@RequestMapping(value = "admin1/s", method = RequestMethod.GET)
	public String lists(Model model) {
	
		model.addAttribute("listSpecialitybyString", this.SpecialityService.listSpecialitybyString());
		return "UI/Common/side-content/we-excel";
	}
	
    
    
    
    
    
}
