package com.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "customer")
public class Customer {


	@Id
	@Column(name = "customercode")
	private int customercode;
	@NotEmpty( message = "Please Enter Customername")
	@Column(name = "customername")
	private String customername;
	
	@NotEmpty( message = "Please Enter customeraddress")
	@Column(name = "customeraddress")
	private String customeraddress;
	
	@NotEmpty( message = "Please Enter customerpincode")
	@Column(name = "customerpincode")
	private String customerpincode;
	
	@NotEmpty( message = "Please Enter customeremail")
	@Column(name = "customeremail")
	private String customeremail;

	@NotEmpty( message = "Please Enter contactnumber")
	@Column(name = "contactnumber")
	private String contactnumber;
	
	@CreationTimestamp

    @Column(name = "registrationdate")
	private Date registrationdate;

	@Column(name = "  createdby")
	private String createdby;
	
	@UpdateTimestamp
	@Column(name = "  modifieddate")
	private Date modifieddate;

	public Customer() {

	}



	public int getCustomercode() {
		return customercode;
	}

	public void setCustomercode(int customercode) {
		this.customercode = customercode;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomerpincode() {
		return customerpincode;
	}

	public void setCustomerpincode(String customerpincode) {
		this.customerpincode = customerpincode;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public Date getRegistrationdate() {
		return registrationdate;
	}

	public void setRegistrationdate(Date registrationdate) {
		this.registrationdate = registrationdate;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(java.sql.Date modifiedDate) {
		this.modifieddate = modifiedDate;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	@Override
	public String toString() {
		return "Customer [customercode=" + customercode + ", customername=" + customername + ", customeraddress="
				+ customeraddress + ", customerpincode=" + customerpincode + ", customeremail=" + customeremail
				+ ", contactnumber=" + contactnumber + ", registrationdate=" + registrationdate + ", createdby="
				+ createdby + ", modifieddate=" + modifieddate + "]";
	}




}
