package com.MongoSpring.MongoSpring.Repository;

import com.MongoSpring.MongoSpring.Model.MntoringRegister;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentoringRepository extends MongoRepository<MntoringRegister, String> {
    // Custom query methods can be added here if needed
}

