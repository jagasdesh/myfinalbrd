package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.demo.entity.Customer;
import com.demo.entity.User;
import com.demo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {	
	
		List<Customer> theCustomers = customerService.getCustomers();
				
	
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		
		Customer theCustomer = new Customer();
	
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") @Validated Customer theCustomer, BindingResult bindingResult,HttpServletRequest request) {
		

		
		 if (bindingResult.hasErrors()) {
	         return "customer-form";
	      }
		 else {
				String username = (String) request.getSession(false).getAttribute("username");
		 customerService.saveCustomer(theCustomer,username);
		return "redirect:/customer/list";
	}
		
	}
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customercode") int customercode)
	{

		customerService.deleteCustomer(customercode);
		return "redirect:/customer/list";
	}
	@GetMapping("/ShowFormForUpdate")
	public String updateCustomer(@RequestParam("customercode") int customercode,Model themodel,@ModelAttribute("customer") Customer theCustomer)
	{
		Customer theCustomers =customerService.getCustomer(customercode,theCustomer);
		themodel.addAttribute("customer",theCustomers);
		return "customer-form";
	}
	
}


