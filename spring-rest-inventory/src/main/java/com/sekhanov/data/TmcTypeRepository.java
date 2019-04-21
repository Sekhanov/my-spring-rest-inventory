package com.sekhanov.data;

import org.springframework.data.repository.CrudRepository;

import com.sekhanov.domain.TmcType;

public interface TmcTypeRepository extends CrudRepository<TmcType, Integer>{	
	TmcType findByName(String Name);
}
