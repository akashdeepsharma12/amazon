package com.spring.amazon.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "customer_contact_number")
	private long customeContactNumber;
	@Column(name = "customer_email")
	private String customerEmail;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomeContactNumber() {
		return customeContactNumber;
	}

	public void setCustomeContactNumber(long customeContactNumber) {
		this.customeContactNumber = customeContactNumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Customer() {

	}

	public Customer(long id, String customerName, long customeContactNumber, String customerEmail) {
		this.id = id;
		this.customerName = customerName;
		this.customeContactNumber = customeContactNumber;
		this.customerEmail = customerEmail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Long.valueOf(customeContactNumber), customerEmail, customerName, Long.valueOf(id));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customeContactNumber == other.customeContactNumber && Objects.equals(customerEmail, other.customerEmail)
				&& Objects.equals(customerName, other.customerName) && id == other.id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", customeContactNumber="
				+ customeContactNumber + ", customerEmail=" + customerEmail + "]";
	}
}