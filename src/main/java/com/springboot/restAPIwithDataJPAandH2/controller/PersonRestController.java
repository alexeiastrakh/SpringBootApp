package com.springboot.restAPIwithDataJPAandH2.controller;


import com.springboot.restAPIwithDataJPAandH2.entity.Person;

import com.springboot.restAPIwithDataJPAandH2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonRestController {

    @Autowired
    private PersonService personService;

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/persons/{personId}")
    public Person getPerson(@PathVariable(name="personId")Long personId) {
        return personService.getPerson(personId);
    }



    }

