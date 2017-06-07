package com.mdcp.mbc;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.jboss.logging.annotations.Message;
import org.junit.runner.Request;
//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mdcp.mbc.service.SpecialityService;
import com.mdcp.mbc.service.CategoryService;
import com.mdcp.mbc.service.StateService;
import com.mdcp.mbc.model.Speciality;
import com.mdcp.mbc.model.State;
import com.mdcp.mbc.model.crm_lead_master;
import com.mdcp.mbc.model.infograph;
import com.mdcp.mbc.service.ArticleService;
import com.mdcp.mbc.service.PressReleaseService;
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
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mdcp.mbc.model.VerifyRecaptcha;
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
import com.mdcp.mbc.service.PressReleaseService;
import com.mdcp.mbc.service.InfographService;
import com.mdcp.mbc.service.MbcGuidelineService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
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
    @Qualifier(value = "LeadMasterService")
   	private LeadMasterService LeadMasterService; 
    
    @Autowired(required = true)   
    @Qualifier(value = "PressReleaseService")
   	private PressReleaseService PressReleaseService; 
    
    
    
    
    @Autowired(required = true)
	 @Qualifier(value = "stateService")
		private StateService StateService;
    
    
    
    @Autowired(required = true)
	 @Qualifier(value = "MbcGuidelineService")
		private MbcGuidelineService mbcGuidelineService;
    
    @RequestMapping(value = "/contact-us",method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model1,Model model, @ModelAttribute("userForm") crm_lead_master user) {
    	
    	model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
    	model.addAttribute("listStates", this.StateService.listStates());
    	crm_lead_master userForm = new crm_lead_master();    
        model1.put("userForm", userForm);
        return "common/main-contact-form2";
    }
    
    
    
    
  
    @RequestMapping(value = "contacttest",method = RequestMethod.POST)
    public void processRegistration() {
    	System.out.println("HHHHH");
    }
    
    
    
    
    @RequestMapping(value = "contact-us",method = RequestMethod.POST)
    public String processRegistration( @ModelAttribute("userForm")  crm_lead_master user,HttpServletResponse httpServletResponse ,Model model, BindingResult result,  Map<String, Object> model1, @RequestParam("g-recaptcha-response") String gRecaptchaResponse, HttpServletRequest request) {
         
    	
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date date = new Date();
    String s=	dateFormat.format(date);
    model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
	model.addAttribute("listStates", this.StateService.listStates());
	   
    			System.out.println(gRecaptchaResponse);
    			boolean verify;
				try {
					
					verify = VerifyRecaptcha.verify(gRecaptchaResponse);
					
					if (verify) {
						
//						System.out.println(verify);
//						System.out.println(s + user.getCreateDate());						
//
//				    	System.out.println("Contact_Name:" + user.getContact_Name());
//				        System.out.println("Email_ID:" + user.getEmail_ID());
//
//				        System.out.println("Specia.id:" + user.getStateId());
//				        
//				        System.out.println("Specialityies.id:" + user.getCateId());
//				        
//				        System.out.println(s + user.getSourceURL());
//				        
//				        System.out.println("Contact_No: " + user.getContact_No());
//				       
//				        System.out.println("Requirement: " + user.getRequirement());
//				        
//				        System.out.println("LeadCategory: " + user.getLeadCategory());
//				        if (chkPreference.SelectedValue.Equals("Billing services"))
//		                    email_obj.stremailtypeBrian = "brian";
//			use this when want to email 	        
						
				        this.LeadMasterService.addcrm_lead_master(user);
				    	if (result.hasErrors()) {
				    	    
				    		//return "common/contact-form";
				       

				        	model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
				        	model.addAttribute("listStates", this.StateService.listStates());
				        	crm_lead_master userForm = new crm_lead_master();    
				            model1.put("userForm", userForm);
				    		
				    		
				    		return"common/main-contact-form";
				    	}
					

				    	else
				    	{

			    		return "state";
				    }
				    	
						
	    				//	out.println("<font color=red>Either user name or password is wrong.</font>");
	    				} else {
	    					//return "common/contact-form";
	    					//httpServletResponse.setHeader("Location", projectUrl);
	    					
	    					//httpServletResponse.sendRedirect("/contact-us");
	    					return"resources/articles/contactar";
	    				}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

 
		    		return "speciality";

    	
    }
    
    
//    public ReloadableResourceBundleMessageSource messageSource() {
//      ReloadableResourceBundleMessageSource messageBundle = new ReloadableResourceBundleMessageSource();
//      messageBundle.setBasename("classpath:messages/messages");
//      messageBundle.setDefaultEncoding("UTF-8");
//      return messageBundle;
//    }
//    
    
    
//    
//    @RequestMapping(value = "Admin/state/add", method = RequestMethod.POST)
//	public @ResponseBody State addState(@RequestBody State p) {
//
//		if (p.getId() == 0) {
//			// new person, add it
//			this.stateService.addState(p);
//			return p;
//		} else {
//			// existing person, call update
//			this.stateService.updateState(p);
//			return p;
//		}
//
//		// return "redirect:/states";
//
//	}
//    
    
    
    

//    @RequestMapping(value = "/medical-billing-service/{param1}/{param2}", method = RequestMethod.GET)
//   	public String listPersonssss(Model model,@PathVariable("param1") String param1,@PathVariable("param2") String param2)  {
//   	//	model.addAttribute("Speciality", new Speciality());.
//     	
//   		//model.addAttribute("listStates", this.StateService.listStates());
// 		
//   		model.addAttribute("listStatebyName", this.StateService.listStatebyName(param1));
//   		model.addAttribute("listSpecialitybyName", this.SpecialityService.listSpecialitybyName(param2));
//   		model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
//   		model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param2));
//  
//   		//	model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param1));
//   		//model.addAttribute("message",param1);
//   		return "UI/State-SpecialityDynamicpage";
//   	}
//  

    
}