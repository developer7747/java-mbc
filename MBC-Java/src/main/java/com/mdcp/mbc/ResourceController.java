package com.mdcp.mbc;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mdcp.mbc.service.SpecialityService;
import com.mdcp.mbc.service.CategoryService;
import com.mdcp.mbc.service.StateService;
import com.mdcp.mbc.model.Speciality;
import com.mdcp.mbc.model.State;
import com.mdcp.mbc.model.infograph;
import com.mdcp.mbc.service.ArticleService;
import com.mdcp.mbc.service.InfographService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
@Controller
public class ResourceController {
	// @Autowired(required = true)
//	private SpecialityService SpecialityService;
	
    
    @Autowired(required = true)   
    @Qualifier(value = "SpecialityService")
   	private SpecialityService SpecialityService; 
    
    @Autowired(required = true)   
    @Qualifier(value = "CategoryService")
   	private CategoryService CategoryService; 
    
    
    @Autowired(required = true)   
    @Qualifier(value = "ArticleService")
   	private ArticleService ArticleService; 
    
    
    
    @Autowired(required = true)   
    @Qualifier(value = "InfographService")
   	private InfographService InfographService; 
    
    
    
    
    @Autowired(required = true)
	 @Qualifier(value = "stateService")
		private StateService StateService;
    
    
//    
    @RequestMapping(value = "/resource", method = RequestMethod.GET)
   	public String listPersonssss(Model model)  {
 		
//   		model.addAttribute("listStatebyName", this.StateService.listStatebyName(param1));
//   		model.addAttribute("listSpecialitybyName", this.SpecialityService.listSpecialitybyName(param2));
//   		model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
//   		model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param2));
   		return "UI/Main-Article";
   	}

    


    
    
    
    @RequestMapping(value = "/resources/articles/{param2}", method=RequestMethod.GET)
   	public String catespec(Model model,@PathVariable("param2") String param2)  {
   	
    	model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param2));
   		
   		return "UI/Main-Article";
   	}
    
    
    
    
    
    
    
    
    
    
    
    
    


    
}