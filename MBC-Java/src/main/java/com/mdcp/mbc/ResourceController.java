package com.mdcp.mbc;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mdcp.mbc.service.SpecialityService;
import com.mdcp.mbc.service.CategoryService;
import com.mdcp.mbc.service.StateService;
import com.mdcp.mbc.model.Speciality;
import com.mdcp.mbc.model.State;
import com.mdcp.mbc.model.VerifyRecaptcha;
import com.mdcp.mbc.model.crm_lead_master;
import com.mdcp.mbc.model.infograph;
import com.mdcp.mbc.service.ArticleService;
import com.mdcp.mbc.service.InfographService;
import com.mdcp.mbc.service.LeadMasterService;
import com.mdcp.mbc.service.MbcGuidelineService;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
   	public String catespesc(Model model,@PathVariable("param2") String param2, RedirectAttributes redirectAttributes)  {
    	
    	String param3 =	param2.replace('-', ' ');
    
    	model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param2));
    	
    	String message= "medical";
    	
    	  redirectAttributes.addFlashAttribute("message", "My property is: " + param2);
    
   		return "UI/Main-Article";
   	}
    
    

    
    
//    @RequestMapping(value = "/resources/articles/{param2}", method=RequestMethod.GET)
//   	public String articlepdf(Model model,@PathVariable("param2") String param2)  {
//    	
//    	String param3 =	param2.replace('-', ' ');
//    
//    	model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param2));
//    	
//
//   		
//   		return "UI/Main-Article";
//   	}
//    
    
    @Autowired(required = true)   
    @Qualifier(value = "LeadMasterService")
   	private LeadMasterService LeadMasterService; 
    
    
    
    
    
    @RequestMapping(value = "/resources/articl/{param2}",method = RequestMethod.POST)
    public String processarticepdf( @ModelAttribute("userForm")  crm_lead_master user ,Model model, BindingResult result,  Map<String, Object> model1, @RequestParam("g-recaptcha-response") String gRecaptchaResponse, HttpServletRequest request) {
         

				       
				        	  this.LeadMasterService.addcrm_lead_master(user);

//				        	crm_lead_master userForm = new crm_lead_master();    

			        	return "UI/Main-Article";
    }
    
    
    
 
    
    
    
    
    @RequestMapping(value = "resources/articles/contactar",method=RequestMethod.POST)
    public ModelAndView  processRegi( @RequestParam("newfield") String paid, @ModelAttribute("userForm")  crm_lead_master user,HttpServletRequest request ) {
this.LeadMasterService.addcrm_lead_master(user);

String url = request.getRequestURL().toString();

return new ModelAndView("redirect:/resources/pdf/"+paid+".pdf");

}
    
    
    
    
    //infograph
    @RequestMapping(value = "resources/infograph/contactar",method=RequestMethod.POST)
    public ModelAndView  processinfographsd( @RequestParam("newfield") String paid, @ModelAttribute("userForm")  crm_lead_master user,HttpServletRequest request ) {
     this.LeadMasterService.addcrm_lead_master(user);

String url = request.getRequestURL().toString();

return new ModelAndView("redirect:/resources/pdf/"+paid+".pdf");
 
}
    
    
    
    
    @RequestMapping(value = "/resources/infograph/{param2}", method=RequestMethod.GET)
   	public String cainfograph(Model model,@PathVariable("param2") String param2, RedirectAttributes redirectAttributes)  {
    	
    	String param3 =	param2.replace('-', ' ');
    
    	//model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param2));
    	
    	model.addAttribute("listinfographbyName", this.InfographService.listinfographbyName(param2));
    	
    	
    	String message= "medical";
    	
    	  redirectAttributes.addFlashAttribute("message", "My property is: " + param2);
    
   		return "UI/Main-infograph";
   	}
    
    //infograph

    
    
    
    

//    //guideline

    
    @Autowired(required = true)
	 @Qualifier(value = "MbcGuidelineService")
		private MbcGuidelineService mbcGuidelineService;
    
    
    
    @RequestMapping(value = "resources/guideline/contactar",method=RequestMethod.POST)
    public ModelAndView  processguideline( @RequestParam("newfield") String paid, @ModelAttribute("userForm")  crm_lead_master user,HttpServletRequest request ) {
     this.LeadMasterService.addcrm_lead_master(user);

String url = request.getRequestURL().toString();

return new ModelAndView("redirect:/resources/pdf/"+paid+".pdf");
 
}
    
  
    
    
    
    
    
    
    @RequestMapping(value = "/resources/guideline/{param2}", method=RequestMethod.GET)
   	public String caguideline(Model model,@PathVariable("param2") String param2, RedirectAttributes redirectAttributes)  {
    	
    	String param3 =	param2.replace('-', ' ');
    	
    	//model.addAttribute("listmbcGuidelines", this.mbcGuidelineService.listmbcGuidelines());
    	
    	model.addAttribute("listmbcGuidelinebyName", this.mbcGuidelineService.listmbcGuidelinebyName(param3));
    	String message= "medical";
    	
    	  redirectAttributes.addFlashAttribute("message", "My property is: " + param2);
    
   		return "UI/Main-Guideline";
   	}
    
    
    
//  //guideline
    
    
    
    
    @RequestMapping(value = "/resources/case-study/{param2}", method=RequestMethod.GET)
   	public String cacasestudy(Model model,@PathVariable("param2") String param2, RedirectAttributes redirectAttributes)  {
    	
    	String param3 =	param2.replace('-', ' ');

    	String message= "medical";
    	
    	  redirectAttributes.addFlashAttribute("message", "My property is: " + param2);
    
    	  
    	  if(param2=="param2"){
    		  
    		  
    		  return "UI/Main-CaseStudy-InternalMedicine";
        	  
        	  
    		  
    	  }
    	  
   		
    	  else
    	  {
    		  
    		  return "UI/Main-CaseStudy-Optometry";
        	  
        	  
    		  
    		  
    	  }
   	}
    
    
    
    @RequestMapping(value = "resources/case-study/contactar",method=RequestMethod.POST)
    public ModelAndView  processcasestudy( @RequestParam("newfield") String paid, @ModelAttribute("userForm")  crm_lead_master user,HttpServletRequest request ) {
     this.LeadMasterService.addcrm_lead_master(user);

String url = request.getRequestURL().toString();

return new ModelAndView("redirect:/resources/pdf/"+paid+".pdf");
 
}
    
    
    

    
    

    //casestudy
    
    
    
}
    
    
    
    


    
