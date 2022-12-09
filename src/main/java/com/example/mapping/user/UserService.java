package com.example.mapping.user;

import com.example.mapping.TransactionalService;
import com.example.mapping.order.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto saveUser(UserDto userDto) {

        User newUser = UserMapper.MAP.toEntity(userDto);
        userRepository.save(newUser);
        return UserMapper.MAP.toDto(newUser);
    }

    public UserDto getUserById(Long id) {
        return userRepository
                .findById(id)
                .map(user -> {
                    UserDto userDto = UserMapper.MAP.toDto(user);

                    userDto.setOrders(OrderMapper.MAP.toDto(user.getOrders()));


                    return userDto;
                })
                .orElseThrow((RuntimeException::new));
    }
}
