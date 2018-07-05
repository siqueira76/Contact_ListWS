package com.siqueira76.Contact_ListWS.resources;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.siqueira76.Contact_ListWS.model.Person;
import com.siqueira76.Contact_ListWS.repository.PersonRepository;

@RestController
@RequestMapping("/ContactList")
public class PersonResource {

	@Autowired
	PersonRepository pr;

	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Person> toPesonList() {
		Iterable<Person> PersonList = pr.findAll();
		return PersonList;
	}

	@GetMapping("/{id}")
	public Person getPerson(@PathVariable("id") int id) {
		Person p = null;
		List<Person> PersonList = new ArrayList<>();
		PersonList = pr.findAll();
		for (Person pe : PersonList) {
			if (pe.getId() == id)
				p = pe;
			return p;
		}
		return p;
	}

	@PostMapping()
	public Person savePerson(@RequestBody @Valid Person person) {
		return pr.save(person);
	}
	
	@PutMapping()
	public Person updatePerson(@RequestBody @Valid Person person) {
		return pr.save(person);
	}

	@DeleteMapping()
	public Person delitePerson(@RequestBody Person person) {
		pr.delete(person);
		return person;
	}

	@DeleteMapping("/{id}")
	public Person deletPerson(@PathVariable("id") int id) {
		Person p = null;
		List<Person> PersonList = new ArrayList<>();
		PersonList = pr.findAll();
		for (Person pe : PersonList) {
			if (pe.getId() == id)
				p = pe;
			return p;
		}
		pr.delete(p);
		return p;
	}

}
