package com.taskme.gv.service;

import com.taskme.gv.entity.PersonalInstance;
import com.taskme.gv.entity.User;
import com.taskme.gv.repository.PersonalInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalInstanceService {
    @Autowired
    private PersonalInstanceRepository repository;

    public PersonalInstance save(PersonalInstance novainstanciapessoal){
        return repository.save(novainstanciapessoal);
    }

}
