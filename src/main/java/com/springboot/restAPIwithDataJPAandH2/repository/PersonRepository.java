package com.springboot.restAPIwithDataJPAandH2.repository;


import com.springboot.restAPIwithDataJPAandH2.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
