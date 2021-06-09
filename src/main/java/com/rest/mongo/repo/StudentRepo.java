package com.rest.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.rest.mongo.models.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student,String>{

}
