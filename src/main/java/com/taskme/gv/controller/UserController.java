package com.taskme.gv.controller;

import com.taskme.gv.entity.User;
import com.taskme.gv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cadastrar")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User save (@RequestBody User novoUsuario){
        return service.save(novoUsuario);
    }
}
