package com.springboot.restAPIwithDataJPAandH2.service.impl;


import com.springboot.restAPIwithDataJPAandH2.entity.Person;


import com.springboot.restAPIwithDataJPAandH2.repository.PersonRepository;
import com.springboot.restAPIwithDataJPAandH2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }



    public Person getPerson(Long personId) {

        Optional<Person> optPer = Optional.ofNullable(personRepository.findOne(personId));
        return optPer.get();
    }


}
