package com.jts.wrapper.conversion;

import org.modelmapper.ModelMapper;

public class ModelWraperExample {

	public static void main(String[] args) {
//		CustomerDTO dto = toDto(new Customer("John"));
//		System.out.println(dto.getName());
		
		User user = new User("John", 30);
		
		Address add = new Address();
		add.setAdd1("Test");
		add.setAdd2("Address");
		
		user.setAdd(add);
		
		ModelMapper mapper = new ModelMapper();
		UserDTO userDTO = mapper.map(user, UserDTO.class);
		
		System.out.println(userDTO.getName());
		System.out.println(userDTO.getAge());
		System.out.println(userDTO.getAdd1()); 
		System.out.println(userDTO.getAdd2()); 
	}
	
	private static CustomerDTO toDto(Customer cust) {
		CustomerDTO dto = new CustomerDTO();
		dto.setName(cust.getName());
		
		return dto;
		
	}
}
