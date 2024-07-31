package com.MongoSpring.MongoSpring.Repository;

import com.MongoSpring.MongoSpring.Model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepo extends MongoRepository<Subject,String> {
}
