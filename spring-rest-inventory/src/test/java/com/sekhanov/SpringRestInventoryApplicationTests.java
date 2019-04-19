package com.sekhanov;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sekhanov.data.PersonRepository;
import com.sekhanov.domain.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRestInventoryApplicationTests {

	@Autowired
	private PersonRepository personRepository;
	
	@Test
	public void personPersist() {
		Person person = new Person("Ivan", "Petrov");
		personRepository.save(person);
		Person person2 = personRepository.findByNameAndSurname("Ivan", "Petrov");
		assertEquals(person.getName(), person2.getName());
		personRepository.delete(person2);
	}

}
