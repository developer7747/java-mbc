package com.mdcp.mbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mdcp.mbc.model.Category;
import com.mdcp.mbc.model.Speciality;
import com.mdcp.mbc.service.ArticleService;
import com.mdcp.mbc.service.SpecialityService;
import com.mdcp.mbc.service.CategoryService;
import com.mdcp.mbc.service.StateService;
@Controller
public class StateController {

	 @Autowired(required = true)
		private SpecialityService SpecialityService;
	 
	 
	 @Autowired(required = true)
		private CategoryService CategoryService;
	 
	 @Autowired(required = true)
	 @Qualifier(value = "stateService")
		private StateService StateService;
	 
	 @Autowired(required = true)	
	 private ArticleService ArticleService;
	 
	 @Autowired(required = true)
		@Qualifier(value = "ArticleService")
		public void setArticleService(ArticleService ps) {
			this.ArticleService = ps;
		}

	 

	 @Autowired(required = true)
		@Qualifier(value = "CategoryService")
		public void setCategoryService(CategoryService ps) {
			this.CategoryService = ps;
		}

	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

 //working  medical-Billing-Service
    
    @RequestMapping(value = "/medical-billing", method = RequestMethod.GET)
	public String listPersonsss(Model model) {
//		model.addAttribute("Speciality", new Speciality());
//		model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
		model.addAttribute("State", new Speciality());
		model.addAttribute("listStates", this.StateService.listStates());
		
		return "UI/State";
		//return "UI/Common/side-content/we-excel-state";
		
	}
    
    //specialitey/{param1}
    
    
    @RequestMapping(value = "/medical-billing/{param1}", method = RequestMethod.GET)
  	public String listPersonssss(Model model,@PathVariable("param1") String param1) {

  		model.addAttribute("listStatebyName", this.StateService.listStatebyName(param1));

//  		model.addAttribute("Speciality", new Speciality());
//		model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys()); 
//  	for speciality	
	
	
	
	model.addAttribute("Speciality", new Speciality());
	//model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
	//model.addAttribute("Category", new Category());
	//model.addAttribute("listCategorys", this.CategoryService.listCategorys());
	//model.addAttribute("listSpecialityby", this.SpecialityService.listSpecialityby());
	//model.addAttribute("listCategoryby", this.CategoryService.listCategoryby());
	//model.addAttribute("Speciality", new Speciality());
	model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
  		return "UI/StateDynamicpage";
  	}
    //working
    
    

    
    
    
    
    
    
	
}
