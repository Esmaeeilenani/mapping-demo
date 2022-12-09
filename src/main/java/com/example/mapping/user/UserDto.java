package com.example.mapping.user;

import com.example.mapping.order.OrderDto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link User} entity
 */
public class UserDto implements Serializable {
    private Long id;
    private String username;
    private List<OrderDto> orders;

    public UserDto() {
    }

    public UserDto(Long id, String username, List<OrderDto> orders) {
        this.id = id;
        this.username = username;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto entity = (UserDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.username, entity.username) &&
                Objects.equals(this.orders, entity.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, orders);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "username = " + username + ", " +
                "orders = " + orders + ")";
    }
}