package com.example.mapping;

import com.example.mapping.item.Item;
import com.example.mapping.item.ItemRepository;
import com.example.mapping.order.Order;
import com.example.mapping.order.OrderRepository;
import com.example.mapping.user.User;
import com.example.mapping.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class MappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MappingApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(UserRepository userRepository, OrderRepository orderRepository, ItemRepository itemRepository)
            throws Exception {

        return args -> {
            User user = new User();
            user.setUsername("saad");
            userRepository.save(user);

            Order order1 = new Order();
            order1.setNumber(UUID.randomUUID().toString());
            order1.setUser(user);
            orderRepository.save(order1);

            Item item1_order1 = new Item();
            item1_order1.setName("Iphone5");
            item1_order1.setPrice(1500d);
            item1_order1.setOrder(order1);
            itemRepository.save(item1_order1);

            Item item2_order1 = new Item();
            item2_order1.setName("Iphone6");
            item2_order1.setPrice(2000d);
            item2_order1.setOrder(order1);
            itemRepository.save(item2_order1);

            Item item3_order1 = new Item();
            item3_order1.setName("samsung s3");
            item3_order1.setPrice(2000d);
            item3_order1.setOrder(order1);
            itemRepository.save(item3_order1);
            //----------------- order 1-------------------

            Order order2 = new Order();
            order2.setNumber(UUID.randomUUID().toString());
            order2.setUser(user);
            orderRepository.save(order2);


            Item item1_order2 = new Item();
            item1_order2.setName("keyboard");
            item1_order2.setPrice(500d);
            item1_order2.setOrder(order2);
            itemRepository.save(item1_order2);

            Item item2_order2 = new Item();
            item2_order2.setName("monitor");
            item2_order2.setPrice(5000d);
            item2_order2.setOrder(order2);
            itemRepository.save(item2_order2);

            Item item3_order2 = new Item();
            item3_order2.setName("Ipad 10 Pro");
            item3_order2.setPrice(6000d);
            item3_order2.setOrder(order2);
            itemRepository.save(item3_order2);






        };
    }

}
