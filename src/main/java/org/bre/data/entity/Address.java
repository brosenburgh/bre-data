package org.bre.data.entity;

import org.springframework.data.annotation.Id;

public class Address extends AbstractEntity {
	@Id
	private String id;
	private String address1;
	private String address2;
	private String city;
	private String stateProvince;
	private String postalCode;
	private String country;

	public Address() {
	}

	public Address(String address1, String address2, String city, String stateProvince, String postalCode,
	    String country) {
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.stateProvince = stateProvince;
		this.postalCode = postalCode;
		this.country = country;
	}

	@Override
	public String toString() {
		return String.format("Address[id=%s, address1='%s', address2=%s, city='%s', stateProvince='%s', postalCode='%s', country='%s']", id,
		    address1, address2, city, stateProvince, postalCode, country);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
