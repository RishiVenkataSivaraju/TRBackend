package com.MongoSpring.MongoSpring.Service;

import com.MongoSpring.MongoSpring.Model.AdminDetails;
import com.MongoSpring.MongoSpring.Model.ProfileDetails;
import com.MongoSpring.MongoSpring.Model.UserDetails;
import com.MongoSpring.MongoSpring.Repository.AdminRepo;
import com.MongoSpring.MongoSpring.Repository.UserRepo;
import com.MongoSpring.MongoSpring.Repository.ProfileRepo;
import org.springframework.stereotype.Service;

@Service
public class HandleCall {
    private final UserRepo repository;
    private final ProfileRepo repository1;

    private final AdminRepo repository2;

    public HandleCall(UserRepo repository, ProfileRepo repository1, AdminRepo repository2) {
        this.repository = repository;
        this.repository1 = repository1;
        this.repository2 = repository2;
    }

    public UserDetails getUserDetails(String user){
        UserDetails Requser = repository.findByusername(user);
        return Requser;
    }
    public UserDetails getUserDetailsbyid(String user){
        UserDetails Requser = repository.findByid(user);
        return Requser;
    }
    public void postUserDetails(UserDetails userDetails){
        repository.insert(userDetails);

    }
    public void postProfileDetails(ProfileDetails profileDetails){
        repository1.insert(profileDetails);
    }
    public ProfileDetails getProfileDetails(long user){
        ProfileDetails requser= repository1.findBymobile(user);
        return requser;
    }
    public void postAdminDetails(AdminDetails adminDetails){
        repository2.insert(adminDetails);
    }

    public AdminDetails getAdminDetails(String username) {
        AdminDetails reqAdmin=repository2.findByusername(username);
        return reqAdmin;
    }
}
