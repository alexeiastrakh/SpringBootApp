package com.springboot.restAPIwithDataJPAandH2;

import com.springboot.restAPIwithDataJPAandH2.entity.Person;
import com.springboot.restAPIwithDataJPAandH2.service.impl.PersonServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RestApIwithDataJpAandH2Application.class)
@WebAppConfiguration
public class PersonServiceUnitTest {




    @Autowired
    private PersonServiceImpl personService;


    @Test
    public void persisting_getPerson() {

        personService.getPerson(1L);

        Assert.assertNotNull(personService);
    }

    @Test
    public void persisting_newEmployee() {

       Person person1 = new Person();
       person1=personService.getPerson(1L);
       Person person2 = new Person();
       person2=personService.getPerson(2L);

       Integer expectedAge = 208;


        Assert.assertEquals("Franko",person1.getSurname());
        Assert.assertEquals("Taras ",person2.getName());
        Assert.assertEquals(expectedAge,person2.getAge());

    }

}