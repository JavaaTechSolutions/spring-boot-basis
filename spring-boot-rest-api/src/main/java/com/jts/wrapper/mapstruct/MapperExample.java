package com.jts.wrapper.mapstruct;

public class MapperExample {

	public static void main(String[] args) {
		UserDTO userdto = new UserDTO();
		userdto.setDescription("Test");
		userdto.setName("John");
		
		User user = UserMapper.USER_INSTANCE.userDTOToUser(userdto);
		UserDTO user1 = UserMapper.USER_INSTANCE.userToUserDTO(user);
		System.out.println(user);
		System.out.println(user1);
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmployeeId(1);
		dto.setEmployeeName("John");
		
		dto.setAddress(new AddressDTO("Address1", "Address2"));
		
		EmployeeMapper instance = EmployeeMapper.INSTANCE;
		Employee emp = instance.employeeDTOtoEmployee(dto);
		EmployeeDTO convertedDTO =  instance.employeeToEmployeeDTO(emp);
		
		System.out.println(emp);
		System.out.println(convertedDTO);
	}

}
