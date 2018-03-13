package org.bre.data.entity;

import org.springframework.data.annotation.Id;

public class Profile extends AbstractEntity {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private Address address;
	private String mobilePhone;
	
	public Profile() {
	}

	public Profile(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("Profile[id=%s, firstName='%s', lastName='%s', email='%s', mobilePhone='%s', address=%s]",
		    id, firstName, lastName, email, mobilePhone, address);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

}
