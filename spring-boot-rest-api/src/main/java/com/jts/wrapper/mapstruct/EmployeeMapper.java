package com.jts.wrapper.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
	
	@Mapping(target = "employeeId", source = "entity.id")
	@Mapping(target = "employeeName", source = "entity.name")
	EmployeeDTO employeeToEmployeeDTO(Employee entity);
	
	@Mapping(target = "id", source = "dto.employeeId")
	@Mapping(target = "name", source = "dto.employeeName")
	Employee employeeDTOtoEmployee(EmployeeDTO dto);
	
	AddressDTO addressToAddressDTO(Address entity);
	
	Address addressDTOtoAddress(AddressDTO dto);
}
