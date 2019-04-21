package com.sekhanov.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sekhanov.domain.TmcCategory;

@RepositoryRestResource
public interface TmcCategoryRepository extends CrudRepository<TmcCategory, Integer> {

	TmcCategory findByName(String name);
}
