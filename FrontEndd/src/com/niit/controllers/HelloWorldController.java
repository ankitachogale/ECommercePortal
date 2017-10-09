package com.niit.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {	
	@RequestMapping("/")
	public String showPage()
	{
		return ("hello");
	}
	/*@GetMapping("/hello/modelmaptest")
	public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name) 
	{
		System.out.println("in controller");
		ModelAndView mv = new ModelAndView("helloworld");
		return mv;
	}
	@GetMapping("/product/productview")
	public ModelAndView showProduct(@ModelAttribute("prdct"), required = false, defaultValue = "product") String name) {
		System.out.println("in controller");
		ModelAndView mv = new ModelAndView("displayproduct");
		return mv;
	}*/
}
    
	

