package com.example.mapping.item;

import com.example.mapping.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ItemMapper extends EntityMapper<Item,ItemDto> {
    ItemMapper MAP = Mappers.getMapper(ItemMapper.class);

    @Override
    @Mapping(target = "order" ,ignore = true)
    Item toEntity(ItemDto dot);

    @Override
    @Mapping(target = "order" ,ignore = true)
    ItemDto toDto(Item entity);


}
