package com.niit.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.NIITBackEnd.Dao.*;
import com.niit.NIITBackEnd.model.User;
@Controller
@RequestMapping("login.html")
public class UserController {
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = { "/register"}, method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("register");
		return model;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value = "error",required = false) String error,
	@RequestParam(value = "signup",	required = false) String signup) {
		
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
		}

		if (signup != null) {
			model.addObject("message", "Logged out from page successfully.");
		}

		model.setViewName("login");
		return model;
	}

}

/*@Autowired
public UserDao userdao;
@RequestMapping(method = RequestMethod.GET)
public String showForm(Map model) {
	User user = new User();
	model.put("login", user);
	return "user";
}

@RequestMapping(method = RequestMethod.POST)
public String processForm(@Validated User loginForm, BindingResult result,
		Map model) {

	
	if (result.hasErrors()) {
		return "signup";
	}
	
	
	boolean userExists = UserDao.loginUser(User.getUsername(),
            User.getPassword());
	if(userExists){
		model.put("User", user);
		return "register";
	}else{
		result.rejectValue("Username","invaliduser");
		return "signup";
	}

}


	
}	
	*/
	
	
/*
String userName = "UserName";
String password = "password";
loginForm = (LoginForm) model.get("loginForm");
if (!loginForm.getUserName().equals(userName)
		|| !loginForm.getPassword().equals(password)) {
	return "loginform";
}
*/
	
	
	
	
	
	
/*@Autowired 
private UserDao userdao;
@RequestMapping("/saveUser")  
public String saveUserData(@ModelAttribute("user") User user,  
        BindingResult result) {  

    userdao.saveUser(user);  
    System.out.println("Save User Data");  
    return new ModelAndView("redirect:/userList.html"); 
    */
	


/*@RequestMapping("/userList")  
public ModelAndView getUserList() {  

    Map<String, Object> model = new HashMap<String, Object>();  
    model.put("user", userdao.getUser());  
    return new ModelAndView("UserDetails", model);  

*/

