package com.mdcp.mbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mdcp.mbc.service.ArticleService;
@Controller
public class ArticleController {

	  @Autowired(required = true)
		private ArticleService ArticleService;
	 
		@Autowired(required = true)
		@Qualifier(value = "ArticleService")
		public void setArticleService(ArticleService ps) {
			this.ArticleService = ps;
		}
	 
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

 //working
    
//    @RequestMapping(value = "/specialite", method = RequestMethod.GET)
//	public String listPersons(Model model) {
//		//model.addAttribute("Speciality", new Speciality());
//		//model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
//		
//    	model.addAttribute("listArticles", this.ArticleService.listArticles());
//    	return "UI/Common/Article";
//	}
    
    
    @RequestMapping(value = "/special/{param1}", method = RequestMethod.GET)
  	public String listPersonss(Model model,@PathVariable("param1") String param1) {
  	
    	
  		//model.addAttribute("listSpecialitys", this.SpecialityService.listSpecialitys());
  		//model.addAttribute("listSpecialitybyName", this.SpecialityService.listSpecialitybyName(param1));
    	model.addAttribute("listArticlesbyNameThree", this.ArticleService.listArticlesbyNameThree(param1));
  		return "UI/Common/combination/Article";
  	}
    //working
    
	
}
