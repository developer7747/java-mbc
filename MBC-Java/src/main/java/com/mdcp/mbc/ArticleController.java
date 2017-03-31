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

import com.mdcp.mbc.model.Article;

import com.mdcp.mbc.model.Speciality;

import com.mdcp.mbc.service.ArticleService;
import com.mdcp.mbc.service.SpecialityService;

@Controller
public class ArticleController {
	 
	private SpecialityService specialityService;
	private static String UPLOADED_FOLDER = "D:\\";

	private ArticleService ArticleService;
	
	@Autowired(required=true)
	@Qualifier(value="ArticleService")
	public void setArticleService(ArticleService ps){
		this.ArticleService = ps;
	}
	
	
//////////////////////////////
@RequestMapping(value= "/Article/upload", method = RequestMethod.POST)
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

@RequestMapping(value= "/Article/pdfupload", method = RequestMethod.POST)
public @ResponseBody Map<String, Object> pdfupload(@RequestParam("pdfupload") MultipartFile file) {

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

//many to many start
@Autowired(required=true)	
@Qualifier(value="SpecialityService")
public void setSpecialityService(SpecialityService ps){
	this.specialityService = ps;
}


	
	@RequestMapping(value = "/Article", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("Article", new Article());
		model.addAttribute("listArticles", this.ArticleService.listArticles());
		return "Article";
	}
	////////////////////////////////
	
	
	
	@RequestMapping(value = "/Article/getArticle", method = RequestMethod.GET)
	public @ResponseBody
	Map<String, Object> getAll(String userName, HttpServletRequest request) {
	Map<String, Object> result = new HashMap<String, Object>();
	int page = request.getParameter("page") == null ? 1 : Integer
	.parseInt(request.getParameter("page"));
	int rows = request.getParameter("rows") == null ? 10 : Integer
	.parseInt(request.getParameter("rows"));
	
	// Use the spring BeanUtils tool, copy attribute to u.
	// BeanUtils.copyProperties(this, user);
	List<Article> list = this.ArticleService.listArticles();
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
	
	@RequestMapping(value= "/Article/add", method = RequestMethod.POST)
	//old before relation 
	//public @ResponseBody Article addArticle(@RequestBody Article p){
	public ResponseEntity<String> addArticle(@RequestBody Article p,@RequestParam String specialityId ){
		
		if(p.getId() == 0){
			
			
			Speciality st =specialityService.getSpecialityById(Integer.parseInt(specialityId));
			//old
			//this.ArticleService.addArticle(p);
			//return p;
	
			p.setSpeciality(st);
		this.ArticleService.addArticle(p);
		return new ResponseEntity<String>("Article Added SuccessFully!",HttpStatus.OK);
		
		}else{
			
			this.ArticleService.updateArticle(p);
			return new ResponseEntity<String>("Article  Updated SuccessFully!",HttpStatus.OK);
		}
		
		
		
	}
	

	
	
	@RequestMapping("/Article/remove/{id}")
   public String removeArticle(@PathVariable("id") int id){
		
       this.ArticleService.removeArticle(id);
       return "redirect:/Articles";
   }

   @RequestMapping("Article/edit/{id}")
   public String editPerson(@PathVariable("id") int id, Model model){
       model.addAttribute("person", this.ArticleService.getArticleById(id));
       model.addAttribute("listPersons", this.ArticleService.listArticles());
       return "Article";
   }
	
}
