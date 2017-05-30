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
public class HomeController {
	// @Autowired(required = true)
//	private SpecialityService SpecialityService;
	
    @RequestMapping("/")
    public String visitHome() {
 
        // do something before returning view name
 
        return "/UI/home";
    }
    
    @RequestMapping("/ContactUs")
    public String visitcontact() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/Contact";
    }
    
    
    @RequestMapping("/healthcare-analytics-solutions")
    public String visithealthcare() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/healthcare-analytics-solutions";
    }
    
    
    
    @RequestMapping("/physician-group")
    public String visitphysician() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/physician-group";
    }
    
    
    @RequestMapping("/revenue-management-services")
    public String visitrcm() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/rcm";
    }
    @RequestMapping("/medical-transcription")
    public String visitmedical() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/medical-transcription";
    }
    
    
    
    @RequestMapping("/medical-billing-consultancy")
    public String visitmedicalbilling() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/medical-billing-consultancy";
    }
    
    @RequestMapping("/medical-coding")
    public String visitmedicalcoding() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/medical-coding";
    }
    
    
    @RequestMapping("/hospital-billing")
    public String visithospitalbilling() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/hospital-billing";
    }
   
    @RequestMapping("/medical-billing-outsourcing")
    public String visitoutsourcing() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/medical-billing-outsourcing";
    }
    
    @RequestMapping("/medical-billing-services")
    public String visitmedicalbillingservices() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/medical-billing-services";
    }
    
    
    
    
    
  
    
    @RequestMapping("/howItwork")
    public String visithowItwork() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/howItwork";
    }
    
    
    
    
    @RequestMapping("/expert-panel")
    public String visitexpert() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/expert-panel";
    }
    
    
    @RequestMapping("/about-us")
    public String visitabout() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/about";
    }
    
    @RequestMapping("/privacy-policy")
    public String visitprivacy() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/privacy";
    }
    
    
    @RequestMapping("/testimonial")
    public String visittestimonial() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/testimonial";
    }
    
    
    @RequestMapping("/faq")
    public String visitfaq() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/Faq";
    }
    
    @RequestMapping("/hippa")
    public String visithippa() {
 
        // do something before returning view name
 
        return "/UI/Static-Pages/hippa";
    }
    
    
    
    
	// many to many start
//	@Autowired(required = true)
//	@Qualifier(value = "SpecialityService")
//	public void setSpecialityService(SpecialityService ps) {
//		this.SpecialityService = ps;
//	}
    
    
    
//    @RequestMapping("/Specialty")
//    public String visitSpecialty(Model model) {
// 
//        // do something before returning view name
//   	List<Speciality> Speciality = SpecialityService.listSpecialitys();
//      model.addAttribute("listSpecialitys", Speciality);
//        return "UI/Specialty";
//    }
//  
//    @RequestMapping("/Specialtys")
//   	public @ResponseBody String getSpecialityList(Model model){
//    	
//    	String mes = "Here I am";
//        model.addAttribute("message",mes);
//   //		model.addAttribute("Speciality", new Speciality());
//	//	model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
//		
//   	List<Speciality> Speciality = SpecialityService.listSpecialitys();
//       model.addAttribute("listSpecialitys", Speciality);
//		
//		
//        return "UI/Specialty";
//    }
    
    

    
    
//    @RequestMapping("/Specialtyss")
//    public List<Speciality> listPersons(Model model) {
//    	List<Speciality> Speciality = SpecialityService.listSpecialitys();
//    	model.addAttribute("Speciality", new Speciality());
//		model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
//		model.addAttribute("Speciality", Speciality);
//		return Speciality;
//	}
    
    
    
    //Combination  State and Speciality 
    
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
    @RequestMapping(value = "/medical-billing-service/{param1}/{param2}", method = RequestMethod.GET)
   	public String listPersonssss(Model model,@PathVariable("param1") String param1,@PathVariable("param2") String param2)  {
   	//	model.addAttribute("Speciality", new Speciality());.
     	
   		//model.addAttribute("listStates", this.StateService.listStates());
 		
   		model.addAttribute("listStatebyName", this.StateService.listStatebyName(param1));
   		model.addAttribute("listSpecialitybyName", this.SpecialityService.listSpecialitybyName(param2));
   		model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
   		model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param2));
  
   		//	model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param1));
   		//model.addAttribute("message",param1);
   		return "UI/State-SpecialityDynamicpage";
   	}
  
    
    @RequestMapping(value = "/medi/{param1}-{param2}", method = RequestMethod.GET)
   	public String catespec(Model model,@PathVariable("param1") String param1,@PathVariable("param2") String param2)  {
   		model.addAttribute("listStatebyName", this.StateService.listStatebyName(param1));
   		//model.addAttribute("listSpecialitybyName", this.SpecialityService.listSpecialitybyName(param2));
   		model.addAttribute("listCategorybyName", this.CategoryService.listCategorybyName(param2));
   		
   		
   		
   		
   		return "UI/State-SpecialityDynamicpage";
   	}
  
    
    
    @RequestMapping(value = "/medical-billing-bytes", method=RequestMethod.GET)
   	public String catespec(Model model)  {
   	
   		
    	model.addAttribute("listinfographs", this.InfographService.listinfographs());

   		
   		return "UI/Static-Pages/medical-billing-byte";
   	}
    
    

//    @RequestMapping(value = "/medical-billing-bytes", method=RequestMethod.GET)
//   	public String catespec(@RequestParam(value = "page", required = false) Long page,Model model)  {
//   		//model.addAttribute("listStatebyName", this.StateService.listStatebyName(param1));
//   		//model.addAttribute("listSpecialitybyName", this.SpecialityService.listSpecialitybyName(param2));
//   	//	model.addAttribute("listCategorybyName", this.CategoryService.listCategorybyName(param2));
//   		
//
//    	int startpage = (int) (page - 5 > 0?page - 5:1);
//        int endpage = startpage + 5;
//    	model.addAttribute("listinfo", this.InfographService.listinfog(page));
//
//        model.addAttribute("startpage",startpage);
//        model.addAttribute("endpage",endpage);
//   		
//   		return "UI/Static-Pages/medical-billing-byte";
//   	}
//  
//    RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String getEmployees(@RequestParam(value = "page", required = false) Long page, ModelMap model) {
//        //now page is available.
//
//        int startpage = (int) (page - 5 > 0?page - 5:1);
//        int endpage = startpage + 10;
//
//        model.addAttribute("employees", this.employeeService.getEmployees(page));
//
//        model.addAttribute("startpage",startpage);
//        model.addAttribute("endpage",endpage);
//
//        return "listing";
//    }
//    
    
    
    
    
    
    
    
    
    
    
//    @RequestMapping(value = "Admin/Category2", method = RequestMethod.GET)
//	public String listCat(Model model) {
//		
//		model.addAttribute("listCategoryby", this.CategoryService.listCategoryby());
//		return "UI/Common/side-content/we-excel";
//	}
//	
	
    
    
    
    
    
    @RequestMapping(value = "/medical-billing-ser/{param1}/{param2}", method = RequestMethod.GET)
   	public String catspec(Model model,@PathVariable("param1") String param1,@PathVariable("param2") String param2)  {
   		model.addAttribute("listStatebyName", this.StateService.listStatebyName(param1));
   		//model.addAttribute("listSpecialitybyName", this.SpecialityService.listSpecialitybyName(param2));
   		model.addAttribute("listCategorybyName", this.CategoryService.listCategorybyName(param2));
   		model.addAttribute("listArticlesbyName", this.ArticleService.listArticlesbyName(param2));

		return "UI/State-SpecialityDynamicpage";
   		//return "footer.jsp";
   	}
  
 
  

    
}