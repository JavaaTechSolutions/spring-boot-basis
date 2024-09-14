package com.jts.wrapper.mapstruct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDTO {

	private int employeeId;

	private String employeeName;
	
	private AddressDTO address;
}
