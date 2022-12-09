package com.example.mapping.order;

import com.example.mapping.EntityMapper;
import com.example.mapping.item.ItemMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = ItemMapper.class)
public interface OrderMapper extends EntityMapper<Order, OrderDto> {
    OrderMapper MAP = Mappers.getMapper(OrderMapper.class);


    @Override
    @Mapping(target = "user", ignore = true)
    Order toEntity(OrderDto dto);

    @Override
    @Mapping(target = "user", ignore = true)
    OrderDto toDto(Order entity);


}
