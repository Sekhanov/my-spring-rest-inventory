package com.sekhanov.data;

import org.springframework.data.repository.CrudRepository;

import com.sekhanov.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
		
	Person findByNameAndSurname(String name, String surname);
}
