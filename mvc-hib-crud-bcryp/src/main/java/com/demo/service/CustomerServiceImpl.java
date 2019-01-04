package com.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.demo.dao.CustomerDAO;
import com.demo.entity.Customer;
import com.demo.entity.User;

@Service
public class CustomerServiceImpl implements CustomerService {
	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer, String username) {
		Date utilDate = new Date();
		java.sql.Date registrationdate = new java.sql.Date(utilDate.getTime());
		theCustomer.setRegistrationdate(registrationdate);
	
		java.sql.Date ModifiedDate = new java.sql.Date(utilDate.getTime());
		theCustomer.setModifieddate(ModifiedDate);
		
		

		System.out.println("username");
		theCustomer.setCreatedby(username);

		customerDAO.saveCustomer(theCustomer);

	}

	@Override
	@Transactional
	public void deleteCustomer(int customercode) {
		customerDAO.deleteCustomer(customercode);
	}

	@Override
	@Transactional
	public Customer getCustomer(int customercode, Customer theCustomer) {
		

		return customerDAO.getCustomer(customercode);
	}

}
