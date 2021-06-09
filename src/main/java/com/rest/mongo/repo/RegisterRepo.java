package com.rest.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rest.mongo.models.Register;

@Repository
public interface RegisterRepo extends MongoRepository<Register,String>{
	

}
