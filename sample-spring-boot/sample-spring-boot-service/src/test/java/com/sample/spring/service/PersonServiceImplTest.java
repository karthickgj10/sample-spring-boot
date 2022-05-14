package com.sample.spring.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PersonServiceImplTest {
	
	@MockBean
	PersonService personService;

//    @Before
//    public void initializeService() {
//    	this.personService = new PersonServiceImpl();
//	}
	
	@Before
	public void initialize() {
		Mockito.when(personService.calculate(5)).thenReturn(5);
	}

	
	@Test
	public void testCalculate() {
		//PersonServiceImpl impl = new PersonServiceImpl();
		assertEquals(5, personService.calculate(5));  
	}
}
