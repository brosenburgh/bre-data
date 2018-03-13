package org.bre.data.entity;

import org.bre.data.enumeration.DeviceStatus;
import org.bre.data.enumeration.DeviceType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Device extends AbstractEntity {

	@Id
	private String id;
	private String identifier;
	private String name;
	private DeviceStatus status;
	private DeviceType type;
	private Object accountId;

	public Device() {}
	
	public Device(String id, String identifier, String name, DeviceStatus status, DeviceType type, Object accountId) {
		super();
		this.id = id;
		this.identifier = identifier;
		this.name = name;
		this.status = status;
		this.type = type;
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return String.format("Device[id=%s, name='%s', identifier='%s', status='%s', type='%s', accountId='%s']", id, name, identifier, status, type, accountId);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DeviceStatus getStatus() {
		return status;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(DeviceStatus status) {
		this.status = status;
	}

	public Object getAccountId() {
		return accountId;
	}

	public void setAccountId(Object accountId) {
		this.accountId = accountId;
	}

	public DeviceType getType() {
		return type;
	}

	public void setType(DeviceType type) {
		this.type = type;
	}

}
