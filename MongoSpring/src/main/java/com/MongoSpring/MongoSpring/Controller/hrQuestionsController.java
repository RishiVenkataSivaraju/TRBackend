package com.MongoSpring.MongoSpring.Controller;


import com.MongoSpring.MongoSpring.Model.hrQuestions;
import com.MongoSpring.MongoSpring.Service.hrQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:8081", "http://localhost:5173", "http://192.168.0.123:8080", "http://192.168.0.123:80801","http://192.168.0.123:8082"})
@RequestMapping("/api/hrQuestions")
 // Add this line
public class hrQuestionsController {
    private final hrQuestionsService hrQuestionService;

    @Autowired
    public hrQuestionsController(hrQuestionsService hrQuestionService) {
        this.hrQuestionService = hrQuestionService;
    }

    @PostMapping("/send")
    public ResponseEntity<hrQuestions> sendQuestions(@RequestBody hrQuestions hrQuestions) {
        hrQuestions savedQuestion = hrQuestionService.sendQuestions(hrQuestions);
        return new ResponseEntity<>(savedQuestion, HttpStatus.CREATED);
    }
    @GetMapping("/getHrQuestions")
    public ResponseEntity<List<hrQuestions>> getHrQuestions() {
        List<hrQuestions> questions= hrQuestionService.getAllQuestions();
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }
}
