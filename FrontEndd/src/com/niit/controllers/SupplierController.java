package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.NIITBackEnd.Dao.SupplierDao;
import com.niit.NIITBackEnd.model.Category;
import com.niit.NIITBackEnd.model.Supplier;

@Controller
public class SupplierController {
@Autowired
private SupplierDao supplierdao;
@ RequestMapping(value = "/supplier", method = RequestMethod.GET)
public String list(Model model) {
	model.addAttribute("supplier", new Supplier());
	model.addAttribute("supplierList",
	this.supplierdao.list());
	return "supplier";
}
@RequestMapping(value = "/supplier/add", method = RequestMethod.POST)
public String insertSupplier(@ModelAttribute("supplier") Supplier supplier) {
	this.supplierdao.insertSupplier(supplier);
	return "redirect:/supplier";
}
@RequestMapping(value = "/supplier/update", method = RequestMethod.POST)
public String updateSupplier(@ModelAttribute("supplier") Supplier supplier) {
	this.supplierdao.updateSupplier(supplier);
	return "redirect:/supplier";
}
@RequestMapping(value = "/deleteSupplier/{Cid}")
public String deleteSupplier(@PathVariable("Sid") int Sid) {
	Supplier supplier = null;
	boolean deleteSupplier = this.supplierdao.deleteSupplier(supplier);
	return "redirect:/supplier";
}
@RequestMapping(value = "/", method = RequestMethod.GET)
public String retrieve(Model model) {
	model.addAttribute("supplier", new Supplier());
	model.addAttribute("supplierlist",
			this.supplierdao.list());
	return "supplier";
}
}
