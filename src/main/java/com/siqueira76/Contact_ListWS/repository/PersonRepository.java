package com.siqueira76.Contact_ListWS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siqueira76.Contact_ListWS.model.Person;

public interface PersonRepository extends JpaRepository<Person, String> {

}
