package org.bre.data.to;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String address1;
	private String address2;
	private String city;
	private String stateProvince;
	private String postalCode;
	private String country;
}
