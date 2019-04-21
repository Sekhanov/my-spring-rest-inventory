package com.sekhanov.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sekhanov.domain.Person;


@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends CrudRepository<Person, Integer> {
	Person findByNameAndSurname(String name, String surname);
}
