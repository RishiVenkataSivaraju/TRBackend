package com.MongoSpring.MongoSpring.Model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profile")
public class ProfileDetails {
    private String name;

    private String photosrc;

    private long mobile;

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhotosrc() {
        return photosrc;
    }

    public void setPhotosrc(String photosrc) {
        this.photosrc = photosrc;
    }
}
