package com.MongoSpring.MongoSpring.Service;

import com.MongoSpring.MongoSpring.Model.ProfileDetails;
import com.MongoSpring.MongoSpring.Model.UserDetails;
import com.MongoSpring.MongoSpring.Repository.UserRepo;
import com.MongoSpring.MongoSpring.Repository.ProfileRepo;
import org.springframework.stereotype.Service;

@Service
public class HandleCall {
    private final UserRepo repository;
    private final ProfileRepo repositorys;

    public HandleCall(UserRepo repository,ProfileRepo repositorys1) {
        this.repository = repository;
        this.repositorys = repositorys1;
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
        repositorys.insert(profileDetails);
    }
    public ProfileDetails getProfileDetails(long user){
        ProfileDetails requser= repositorys.findBymobile(user);
        return requser;
    }


}
