package com.kadiraksoy.SpringBootMongoDb.repository;

import com.kadiraksoy.SpringBootMongoDb.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface StudentRepository extends MongoRepository<Student, String> {
}
