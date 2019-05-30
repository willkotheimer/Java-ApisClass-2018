package com.cooksys.ftd.ormdemo.mapper;

import com.cooksys.ftd.ormdemo.dto.UserDto;
import com.cooksys.ftd.ormdemo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(target = "empId", source = "employeeId")
    })
    UserDto entityToDto(User entity);

    @Mappings({
            @Mapping(target = "employeeId", source = "empId")
    })
    User dtoToEntity(UserDto dto);

}
