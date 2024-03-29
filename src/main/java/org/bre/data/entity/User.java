package org.bre.data.entity;

import org.springframework.data.annotation.Id;

public class User extends AbstractEntity {

	@Id
	private String id;
	private String username;
	private String password;

	public User() {}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("User[id=%s, username='%s', password='%s']", id, username, (password != null ? "********": "<NO PASSWORD>"));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
