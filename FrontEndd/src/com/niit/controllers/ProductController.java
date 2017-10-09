package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.NIITBackEnd.Dao.ProductDao;
import com.niit.NIITBackEnd.model.Product;

@Controller
public class ProductController {
@Autowired
private ProductDao productdao;
@RequestMapping(value = "/product", method = RequestMethod.GET)
public String list(Model model) {
	model.addAttribute("product", new Product());
	model.addAttribute("productList",
	this.productdao.list());
	return "product";
}
@RequestMapping(value = "/product/add", method = RequestMethod.POST)
public String insertProduct(@ModelAttribute("product") Product product) {
	this.productdao.insertProduct(product);
	return "redirect:/product";
}
@RequestMapping(value = "/product/update", method = RequestMethod.POST)
public String updateProduct(@ModelAttribute("product") Product product) {
	this.productdao.updateProduct(product);
	return "redirect:/employees";
}
@RequestMapping(value = "/deleteProduct/{Pid}")
public String deleteProduct(@PathVariable("Pid") int Pid) {
	Product product = null;
	this.productdao.deleteProduct(product);
	return "redirect:/product";
}
@RequestMapping(value = "/", method = RequestMethod.GET)
public String retrieve(Model model) {
	model.addAttribute("product", new Product());
	model.addAttribute("productlist",
			this.productdao.list());
	return "product";
}
}