package com.example.mapping.item;

import com.example.mapping.order.OrderDto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link Item} entity
 */
public class ItemDto implements Serializable {
    private Long id;
    private String name;
    private Double price;
    private OrderDto order;

    public ItemDto() {
    }

    public ItemDto(Long id, String name, Double price, OrderDto order) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderDto getOrder() {
        return order;
    }

    public void setOrder(OrderDto order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemDto entity = (ItemDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.price, entity.price) &&
                Objects.equals(this.order, entity.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, order);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "price = " + price + ", " +
                "order = " + order + ")";
    }
}