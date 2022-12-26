package com.springboot.restAPIwithDataJPAandH2.entity;

import javax.persistence.*;

@Entity
@Table(name="PERSON")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name="PERSON_NAME")
    private String name;

    @Column(name="PERSON_DATEOFBIRTH")
    private Integer dateOfBirth;

    @Column(name="PERSON_SURNAME")
    private String surname;

    public Person() {
    }

    public Person(Long id, String name, Integer dateOfBirth, String surname) {
        Id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.surname = surname;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return 2022-dateOfBirth;
    }

    public void setAge(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
