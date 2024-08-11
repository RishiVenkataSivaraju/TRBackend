package com.MongoSpring.MongoSpring.Controller;

import com.MongoSpring.MongoSpring.Model.Trquestions;
import com.MongoSpring.MongoSpring.Service.Trservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@CrossOrigin(origins = {"http://localhost:8081/", "http://localhost:5173/", "http://192.168.0.123:8080/", "http://192.168.0.123:8081/","http://192.168.0.123:8082"})
@RequestMapping("/trquestions")
public class Trcontroller {
    private final Trservice Service;
    @Autowired
    public Trcontroller(Trservice service) {
        Service = service;
    }
    @GetMapping("/get")
    public Collection<Trquestions> getquestions(){
        return Service.getquestions();
    };
    @PostMapping("/post")
    public void postquestions(@RequestBody Trquestions questions){
        Service.postquestions(questions);

    };

}
