package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.NIITBackEnd.Dao.CategoryDao;
import com.niit.NIITBackEnd.model.Category;
import com.niit.NIITBackEnd.model.Product;

@Controller
public class CategoryController {
@Autowired
private CategoryDao categorydao;

@ RequestMapping(value = "/category", method = RequestMethod.GET)
public String list(Model model) {
	model.addAttribute("category", new Category());
	model.addAttribute("categoryList",
	this.categorydao.list());
	return "category";
}
@RequestMapping(value = "/category/add", method = RequestMethod.POST)
public String insertCategory(@ModelAttribute("category") Category category) {
	this.categorydao.insertCategory(category);
	return "redirect:/category";
}
@RequestMapping(value = "/category/update", method = RequestMethod.POST)
public String updateCategory(@ModelAttribute("category") Category category) {
	this.categorydao.updateCategory(category);
	return "redirect:/category";
}
@RequestMapping(value = "/deleteCategory/{Cid}")
public String deleteCategory(@PathVariable("Cid") int Cid) {
	Category category = null;
	this.categorydao.deleteCategory(category);
	return "redirect:/category";
}
@RequestMapping(value = "/", method = RequestMethod.GET)
public String retrieve(Model model) {
	model.addAttribute("category", new Category());
	model.addAttribute("categorylist",
			this.categorydao.list());
	return "category";
}

}
