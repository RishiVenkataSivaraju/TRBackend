package com.MongoSpring.MongoSpring.Controller;

import com.MongoSpring.MongoSpring.Service.SubjectService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.MongoSpring.MongoSpring.Model.Subject;
import java.util.List;
@RestController
@CrossOrigin(origins = {"http://localhost:8081/", "http://localhost:5173/", "http://192.168.29.123:8080/", "http://192.168.29.130:8081/","http://192.168.29.123:8082"})
@RequestMapping("/api/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping("/add")
    public String createSubject(@RequestParam String subjectName, @RequestParam("subjectIcon") MultipartFile subjectIcon) {
        return subjectService.createSubject(subjectName, subjectIcon);
    }

    @GetMapping("/getsubjects")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }
    
}
