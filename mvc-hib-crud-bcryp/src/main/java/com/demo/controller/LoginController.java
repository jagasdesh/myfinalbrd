package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.entity.User;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")

public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/newuser")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		User theUser = new User();

		theModel.addAttribute("user", theUser);

		return "new-user-form";
	}

	@PostMapping("/saveUser")

	public String saveCustomer(@ModelAttribute("theUser") User theUser,HttpServletRequest request) {

		// save the customer using our service
		String role = "ROLE_USER";
		request.getSession(true).setAttribute("role", role);
		request.getSession(true).setAttribute("model", theUser);
		System.out.println(role);
		if (theUser.getRole().equalsIgnoreCase("ROLE_ADMIN")) {
			return "redirect:/login/newuser";
		} else if (theUser.getRole().equalsIgnoreCase("ROLE_USER")) {

			return "redirect:/login/validateUser";
		}
		return "redirect:/login/dashboard";
	}

	@PostMapping("/Save")
	public String save(@ModelAttribute("theUser") User theUser,HttpServletRequest request) {
		loginService.saveUser(theUser,request);
		return "redirect:/login/dashboard";
	}

	@GetMapping("/loginform")
	public String showLoginForm(Model theModel) {

		// create model attribute to bind form data
		User theUser = new User();

		theModel.addAttribute("user", theUser);

		return "login-form";
	}

	@GetMapping("/validateUser")

	public String validateUser(@ModelAttribute("theUser") User theUser, HttpServletRequest request) {

		// save the customer using our service
//		String role=(String) request.getSession(false).getAttribute("model");
		if (loginService.validateUser(theUser) != null) {
			String username = theUser.getUserName();
			request.getSession(true).setAttribute("username", username);

			return "redirect:/customer/list";
		}
		return "login-error";
	}

	@GetMapping("/dashboard")
	public String dashboard(Model theModel) {
		User theUser = new User();
		theModel.addAttribute("user", theUser);
		return "Main";
	}

}
