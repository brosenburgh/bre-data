package org.bre.data.entity;

import org.bre.data.enumeration.AccountStatus;
import org.springframework.data.annotation.Id;

public class Account extends AbstractEntity {

	@Id
	private String id;
	private Profile profile;
	private User user;
	private AccountStatus status;

	public Account() {}
	public Account(String firstName, String lastName, String email, String username, String password) {
		this.profile = new Profile(firstName, lastName, email);
		this.user = new User(username, password);
	}
	
	@Override
	public String toString() {
		return String.format("Account[id=%s, status='%s', profile=%s, user=%s]", id, status, profile, user);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Profile getProfile() {
		return profile;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
