package com.example.mapping;

import com.example.mapping.user.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public @interface TransactionalService {


}
