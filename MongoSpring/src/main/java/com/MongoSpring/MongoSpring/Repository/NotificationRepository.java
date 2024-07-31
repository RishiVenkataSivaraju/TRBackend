package com.MongoSpring.MongoSpring.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.MongoSpring.MongoSpring.Model.Notification;


public interface NotificationRepository extends MongoRepository<Notification, String> {
}
