package com.gontuseries.studentadmissioncontroller;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Address {
	
	@NotEmpty(message="Country field should not be empty")
	private String country;
	
	@NotEmpty(message="City field should not be empty")
	private String city;
	
	@NotEmpty(message="Street field should not be empty")
	private String street;
	
	@NotEmpty(message="Pincode field should not be empty")
	private String pincode;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
