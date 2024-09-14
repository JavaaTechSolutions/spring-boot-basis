package com.jts.wrapper.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
	UserMapper USER_INSTANCE = Mappers.getMapper(UserMapper.class);
	
	User userDTOToUser(UserDTO source);

	UserDTO userToUserDTO(User destination);
}
