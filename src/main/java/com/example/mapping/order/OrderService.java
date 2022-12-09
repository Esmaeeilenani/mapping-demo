package com.example.mapping.order;


import com.example.mapping.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderDto getOrderById(Long id){
        Order order = orderRepository.findById(id).orElseThrow(RuntimeException::new);

        OrderDto orderDto = OrderMapper.MAP.toDto(order);

        orderDto.setUser(UserMapper.MAP.toDto(order.getUser()));



        return  orderDto;
    }

}
