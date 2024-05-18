package com.MongoSpring.MongoSpring.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.MongoSpring.MongoSpring.Model.McqCredentails;

public interface MCQRepo extends MongoRepository<McqCredentails,String>{

    McqCredentails  findBySubject(String subject);
    
}
