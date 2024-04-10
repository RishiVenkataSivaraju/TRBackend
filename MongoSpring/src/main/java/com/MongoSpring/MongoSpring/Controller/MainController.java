package com.MongoSpring.MongoSpring.Controller;
import com.MongoSpring.MongoSpring.Model.ProfileDetails;
import com.MongoSpring.MongoSpring.Model.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.MongoSpring.MongoSpring.Service.HandleCall;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api")
public class MainController {

    private final HandleCall Service;

    public MainController( com.MongoSpring.MongoSpring.Service.HandleCall Service) {
        this.Service = Service;
    }

    @PostMapping("/registration")
    public String postUserDetails(@RequestBody UserDetails userDetails){
        Service.postUserDetails(userDetails);
        return "POSTED UserDetails SUCCESSFULLY";
    }
    @PostMapping("/user/profile")
    public String postProfileDetails(@RequestBody ProfileDetails profileDetails){
        Service.postProfileDetails(profileDetails);
        return "POSTED ProfileDetails SUCCESSFULLY";
    }
    @GetMapping("/profile/mobile/{number}")
    public ProfileDetails getProfileDetails(@PathVariable long number){return Service.getProfileDetails(number);}
    @GetMapping("/registration/{username}")
    public UserDetails getUserDetails(@PathVariable  String username){
        return Service.getUserDetails(username);
    }
    @GetMapping("/registration/id/{id}")
    public UserDetails getUserDetailsbyid(@PathVariable String id){
        return Service.getUserDetailsbyid(id);
}

}
