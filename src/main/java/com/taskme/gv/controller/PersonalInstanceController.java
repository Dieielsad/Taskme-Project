package com.taskme.gv.controller;

import com.taskme.gv.entity.User;
import com.taskme.gv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoal")
public class PersonalInstanceController {

    @Autowired
    private PersonalInstanceService service;

    @PostMapping
    public PersonalInstance save (@RequestBody PersonalInstance novainstanciapessoal){
        return service.save(novainstanciapessoal);
    }
}
