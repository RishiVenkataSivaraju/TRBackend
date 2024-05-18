package com.MongoSpring.MongoSpring.Controller;
import com.MongoSpring.MongoSpring.Model.AdminDetails;
import com.MongoSpring.MongoSpring.Model.McqCredentails;
import com.MongoSpring.MongoSpring.Model.ProfileDetails;
import com.MongoSpring.MongoSpring.Model.UserDetails;
import com.MongoSpring.MongoSpring.Repository.AdminRepo;
import com.MongoSpring.MongoSpring.Repository.MCQRepo;
import com.MongoSpring.MongoSpring.Service.HandleCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = { "http://localhost:8081", "http://localhost:3000", "http://localhost:5173" })
@RequestMapping("/api")
public class MainController {

    private final HandleCall service;
    private final MCQRepo mcqRepo;

    @Autowired
    public MainController(HandleCall service, MCQRepo mcqRepo) {
        this.service = service;
        this.mcqRepo = mcqRepo;
    }

    @PostMapping("/registration")
    public String postUserDetails(@RequestBody UserDetails userDetails) {
        service.postUserDetails(userDetails);
        return "POSTED UserDetails SUCCESSFULLY";
    }

    @PostMapping("/user/profile")
    public String postProfileDetails(@RequestBody ProfileDetails profileDetails) {
        service.postProfileDetails(profileDetails);
        return "POSTED ProfileDetails SUCCESSFULLY";
    }

    @PostMapping("/admin/mcq")
    public String postMCQcredentials(@RequestBody McqCredentails mcqCredentails) {
        service.postMCQcredentials(mcqCredentails);
        return "posted";
    }

    @PostMapping("/create/admin")
    public String postAdminDetails(@RequestBody AdminDetails adminDetails) {
        service.postAdminDetails(adminDetails);
        return "POSTED AdminDetails SUCCESSFULLY";
    }

    @GetMapping("/profile/mobile/{number}")
    public ProfileDetails getProfileDetails(@PathVariable long number) {
        return service.getProfileDetails(number);
    }

    @GetMapping("/mcq/questions")
    public List<McqCredentails> getAllMcqCredentails() {
        return mcqRepo.findAll();
    }

    @PostMapping("/login")
    public AdminDetails login(@RequestBody AdminDetails adminDetails) {
        String username = adminDetails.getUsername();
        String password = adminDetails.getPassword();

        AdminDetails admin = service.getAdminDetails(username);

        if (admin == null) {
            return new AdminDetails("User not found", 0);
        }

        if (!admin.getPassword().equals(password)) {
            return new AdminDetails("Incorrect password", 0);
        }

        return new AdminDetails("Login Successful", admin.getMobile());
    }

    @GetMapping("/registration/{username}")
    public UserDetails getUserDetails(@PathVariable String username) {
        return service.getUserDetails(username);
    }

    @GetMapping("/registration/id/{id}")
    public UserDetails getUserDetailsbyid(@PathVariable String id) {
        return service.getUserDetailsbyid(id);
    }

    @GetMapping("/admin/verify/{username}")
    public AdminDetails getAdminDetails(@PathVariable String username) {
        return service.getAdminDetails(username);
    }

    @PostMapping("/chat")
    public String handleChatMessage(@RequestBody String message) {
        // Your chat message handling logic here
        return "Handled message: " + message;
    }
}
