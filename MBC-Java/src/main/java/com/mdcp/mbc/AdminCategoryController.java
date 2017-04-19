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

import com.mdcp.mbc.model.Category;

import com.mdcp.mbc.model.Speciality;

import com.mdcp.mbc.service.CategoryService;
import com.mdcp.mbc.service.SpecialityService;

@Controller
public class AdminCategoryController {

	private static String UPLOADED_FOLDER = "D:\\";

	private CategoryService CategoryService;

	@Autowired(required = true)
	@Qualifier(value = "CategoryService")
	public void setCategoryService(CategoryService ps) {
		this.CategoryService = ps;
	}

	//////////////////////////////
	@RequestMapping(value = "Admin/Category/upload", method = RequestMethod.POST)
	public ResponseEntity<String> upload(@RequestParam("uploadImage") MultipartFile file) {

		try {

			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// rest of the code goes here...
		return new ResponseEntity<String>(file.getOriginalFilename(), HttpStatus.OK);
	}

	@RequestMapping(value = "Admin/Category/pdfupload", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> pdfupload(@RequestParam("pdfupload") MultipartFile file) {

		try {

			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// rest of the code goes here...
		return null;
	}

	// many to many start

	@RequestMapping(value = "Admin/Category/getCategory1", method = RequestMethod.GET)
	public @ResponseBody List<Category> getCategoryList() {
		return this.CategoryService.listCategorys();
	}

	@RequestMapping(value = "Admin/Category", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("Category", new Category());
		model.addAttribute("listCategorys", this.CategoryService.listCategorys());
		return "Category";
	}
	////////////////////////////////

	@RequestMapping(value = "Admin/Category/getCategory", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getAll(String userName, HttpServletRequest request) {
		Map<String, Object> result = new HashMap<String, Object>();
		int page = request.getParameter("page") == null ? 1 : Integer.parseInt(request.getParameter("page"));
		int rows = request.getParameter("rows") == null ? 10 : Integer.parseInt(request.getParameter("rows"));

		// Use the spring BeanUtils tool, copy attribute to u.
		// BeanUtils.copyProperties(this, user);
		List<Category> list = this.CategoryService.listCategorys();
		int total = list.size();
		if (list == null || list.size() == 0) {
			result.put("records", 10);//
		} else {
			result.put("rows", list);
		}
		result.put("records", 10);
		result.put("total", total);
		result.put("page", 1);
		return result;
	}

	//////////////////////////////

	// For add and update person both

	@RequestMapping(value = "Admin/category/add", method = RequestMethod.POST)
	public @ResponseBody Category addCategory(@RequestBody Category p) {

		if (p.getId() == 0) {
			// new person, add it
			this.CategoryService.addCategory(p);
			return p;
		} else {
			// existing person, call update
			this.CategoryService.updateCategory(p);
			return p;
		}

		// return "redirect:/Specialitys";

	}

	@RequestMapping("Admin/Category/remove/{id}")
	public String removeCategory(@PathVariable("id") int id) {

		this.CategoryService.removeCategory(id);
		return "redirect:/Categorys";
	}

	@RequestMapping("Admin/Category/edit/{id}")
	public String editPerson(@PathVariable("id") int id, Model model) {
		model.addAttribute("person", this.CategoryService.getCategoryById(id));
		model.addAttribute("listPersons", this.CategoryService.listCategorys());
		return "Category";
	}

}
