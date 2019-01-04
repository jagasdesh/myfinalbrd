package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Customer> getCustomers() {

		Session currentSession = sessionFactory.getCurrentSession();

	
		Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);
       System.out.println(theQuery);
		
		List<Customer> customers = theQuery.getResultList();

	
		return customers;
	}

	@Override

	public void saveCustomer(Customer theCustomer) {

	
		Session currentSession = sessionFactory.getCurrentSession();


		currentSession.saveOrUpdate(theCustomer);
	}

	
	
	public void deleteCustomer(int customercode) {

		Session currentSession = sessionFactory.getCurrentSession();
		Query thequery = currentSession.createQuery("delete from Customer where customercode=:customercode");
		thequery.setParameter("customercode", customercode);
		thequery.executeUpdate();

	}

	@Override

	public Customer getCustomer(int customercode) {
	
				Session currentSession = sessionFactory.getCurrentSession();
				Customer theCustomer = currentSession.get(Customer.class,customercode);
				return theCustomer;

	}
	
	


}
