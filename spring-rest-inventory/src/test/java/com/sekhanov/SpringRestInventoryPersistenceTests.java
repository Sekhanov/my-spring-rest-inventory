package com.sekhanov;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sekhanov.data.PersonRepository;
import com.sekhanov.data.TmcCategoryRepository;
import com.sekhanov.data.TmcNameRepository;
import com.sekhanov.data.TmcRepository;
import com.sekhanov.data.TmcTypeRepository;
import com.sekhanov.domain.Person;
import com.sekhanov.domain.Tmc;
import com.sekhanov.domain.TmcCategory;
import com.sekhanov.domain.TmcName;
import com.sekhanov.domain.TmcType;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRestInventoryPersistenceTests {

	@Autowired	
	private PersonRepository personRepository;
	@Autowired
	private TmcCategoryRepository tmcCategoryRepository;
	@Autowired
	private TmcTypeRepository tmcTypeRepository;
	@Autowired
	private TmcNameRepository tmcNameRepository;
	@Autowired
	private TmcRepository tmcrepository;
	
	@Test
	public void personPersist() {
		Person person = new Person("John", "Smith");
		assertTrue(person.getId() == 0);
		personRepository.save(person);		
		Optional<Person> person2 = personRepository.findById(person.getId());
		assertEquals(person.getName(), person2.get().getName());	
		personRepository.delete(person);
	}
	
	@Test
	@Ignore
	public void tmcCategoryPersist() {
		TmcCategory tmcCategory = new TmcCategory("someCategory");
		tmcCategoryRepository.save(tmcCategory);
		TmcCategory tmcCategory2 = tmcCategoryRepository.findByName("someCategory");
		assertEquals(tmcCategory.getName(), tmcCategory2.getName());
		tmcCategoryRepository.delete(tmcCategory2);
	}
	
	@Test
	@Ignore
	public void tmcTypePersist() {
		TmcType tmcType = new TmcType("Some Type");
		tmcTypeRepository.save(tmcType);
		TmcType tmcType2 = tmcTypeRepository.findByName("Some Type");
		assertEquals(tmcType.getName(), tmcType2.getName());
		tmcTypeRepository.delete(tmcType2);
	}
	
	@Test
	@Ignore
	public void tmcNamePersist() {
		Iterable<TmcName> tmcNames = tmcNameRepository.findAll();
		tmcNames.forEach(e -> System.out.println(e));
	}
	
	@Test
	public void tmcPersist() {
		Iterable<Tmc> tmcs = tmcrepository.findAll();
		tmcs.forEach(e -> System.out.println(e));
	}

}
