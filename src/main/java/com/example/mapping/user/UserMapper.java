package com.example.mapping.user;

import com.example.mapping.EntityMapper;
import com.example.mapping.order.OrderMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(uses = OrderMapper.class)
public interface UserMapper extends EntityMapper<User,UserDto> {
    UserMapper MAP = Mappers.getMapper(UserMapper.class);

    @Override
    @Mapping(target = "orders", ignore = true)
    User toEntity(UserDto dto);

    @Override
    @Mapping(target = "orders", ignore = true)
    UserDto toDto(User entity);
}
