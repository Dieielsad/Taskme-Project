package com.taskme.gv.service;

import com.taskme.gv.entity.User;
import com.taskme.gv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User save(User novoUsuario){
        return repository.save(novoUsuario);
    }

}
