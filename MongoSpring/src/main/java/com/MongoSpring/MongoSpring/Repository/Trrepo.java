package com.MongoSpring.MongoSpring.Repository;


import com.MongoSpring.MongoSpring.Model.Trquestions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Trrepo extends MongoRepository<Trquestions,Long> {
}

