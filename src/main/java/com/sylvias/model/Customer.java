package com.sylvias.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Customers")
public class Customer implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	private String cust_first_name;
	private String cust_last_name;
	private String cust_email;
	private String cust_phone;
	private String cust_street_address;
	private String cust_city;
	private String cust_state;
	private int cust_zipcode;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCust_first_name() {
		return cust_first_name;
	}
	public void setCust_first_name(String cust_first_name) {
		this.cust_first_name = cust_first_name;
	}
	public String getCust_last_name() {
		return cust_last_name;
	}
	public void setCust_last_name(String cust_last_name) {
		this.cust_last_name = cust_last_name;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_street_address() {
		return cust_street_address;
	}
	public void setCust_street_address(String cust_street_address) {
		this.cust_street_address = cust_street_address;
	}
	public String getCust_city() {
		return cust_city;
	}
	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}
	public String getCust_state() {
		return cust_state;
	}
	public void setCust_state(String cust_state) {
		this.cust_state = cust_state;
	}
	public int getCust_zipcode() {
		return cust_zipcode;
	}
	public void setCust_zipcode(int cust_zipcode) {
		this.cust_zipcode = cust_zipcode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cust_city, cust_email, cust_first_name, cust_last_name, cust_phone, cust_state,
				cust_street_address, cust_zipcode, customerId);
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
		return Objects.equals(cust_city, other.cust_city) && Objects.equals(cust_email, other.cust_email)
				&& Objects.equals(cust_first_name, other.cust_first_name)
				&& Objects.equals(cust_last_name, other.cust_last_name) && Objects.equals(cust_phone, other.cust_phone)
				&& Objects.equals(cust_state, other.cust_state)
				&& Objects.equals(cust_street_address, other.cust_street_address) && cust_zipcode == other.cust_zipcode
				&& customerId == other.customerId;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cust_first_name=" + cust_first_name + ", cust_last_name="
				+ cust_last_name + ", cust_email=" + cust_email + ", cust_phone=" + cust_phone
				+ ", cust_street_address=" + cust_street_address + ", cust_city=" + cust_city + ", cust_state="
				+ cust_state + ", cust_zipcode=" + cust_zipcode + "]";
	}
	public Customer(int customerId, String cust_first_name, String cust_last_name, String cust_email, String cust_phone,
			String cust_street_address, String cust_city, String cust_state, int cust_zipcode) {
		super();
		this.customerId = customerId;
		this.cust_first_name = cust_first_name;
		this.cust_last_name = cust_last_name;
		this.cust_email = cust_email;
		this.cust_phone = cust_phone;
		this.cust_street_address = cust_street_address;
		this.cust_city = cust_city;
		this.cust_state = cust_state;
		this.cust_zipcode = cust_zipcode;
	}
	
	

}
