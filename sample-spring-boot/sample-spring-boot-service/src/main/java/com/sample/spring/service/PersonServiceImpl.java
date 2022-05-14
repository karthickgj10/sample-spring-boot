package com.sample.spring.service;

import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService{

	@Override
	public Integer calculate(Integer id) {
		return 5;
	}

}
