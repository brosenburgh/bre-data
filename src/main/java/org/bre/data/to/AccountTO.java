package org.bre.data.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bre.data.enumeration.AccountStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object id;
	private AccountStatus status;
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private List<DeviceTO> devices = new ArrayList<>();
	private AddressTO address;
	private Date created;
	private Date modified;

	public AccountTO() {
	}

	public AccountTO(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format(
		    "AccountDTO[id=%s, status='%s', username='%s', password='%s', email='%s', firstName='%s', lastName='%s', address='%s', created='%s', modified='%s']", id,
		    status, username, (password != null ? "********" : "<NO PASSWORD>"), email, firstName, lastName, address, created, modified);
	}

}
