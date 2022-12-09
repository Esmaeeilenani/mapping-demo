package com.example.mapping.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserResource {


    @Autowired
    private UserService userService;


    @GetMapping("{id}")
    public ResponseEntity<UserDto>getUserById(@PathVariable Long id){
        return ResponseEntity.ok(userService.getUserById(id));
    }



}
