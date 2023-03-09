package com.uax.accesodatos.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.uax.accesodatos.dto.PruebaDto;


@Repository
public interface PruebaImdbRepository extends MongoRepository<PruebaDto,String>{

	
	Optional<PruebaDto> findBynombre(String nombre);
	
	
}
