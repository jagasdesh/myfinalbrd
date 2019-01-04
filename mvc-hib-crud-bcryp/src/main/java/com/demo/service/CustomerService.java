package com.demo.service;

import java.util.List;

import org.springframework.ui.Model;

import com.demo.entity.Customer;
import com.demo.entity.User;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer,String username);
	public void deleteCustomer(int customercode);
	public Customer getCustomer(int customercode,Customer theCustomer);


}
