package org.bre.data.to;

import org.bre.data.enumeration.DeviceStatus;
import org.bre.data.enumeration.DeviceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceTO {
	private String id;
	private String identifier;
	private String name;
	private DeviceStatus status;
	private DeviceType type;
	private Object accountId;
}
