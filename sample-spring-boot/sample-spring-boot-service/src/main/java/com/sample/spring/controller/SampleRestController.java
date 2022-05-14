package com.sample.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.spring.dto.Person;
import com.sample.spring.service.PersonService;

@RestController
public class SampleRestController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping(value = "/test/{tenant}/getPersonDetail", produces = "application/json")
	public String get(@PathVariable("tenant") String tenant, @RequestParam(name = "id", required = true) String id) {
		return "Success";
	}
	
	@PostMapping(value = "/test/update", consumes = "application/json", produces = "application/json")
	public Person post(@RequestBody Person person) {
		personService.calculate(5);
		return person;
	}

}
