package com.example.clonemessenger.Models;

import com.google.firebase.Timestamp;
import com.google.firebase.database.ServerValue;

public class User {
    private String email, name, userID, userPhoto, userBackground;
    private Object TIMESTAMP;

    public User(String email, String name, String userID, String userPhoto, String userBackground) {
        this.email = email;
        this.name = name;
        this.userID = userID;
        this.userPhoto = userPhoto;
        this.userBackground = userBackground;
        this.TIMESTAMP = ServerValue.TIMESTAMP;
    }

    public User() {
    }

    public User(User user)
    {
        this.email = user.email;
        this.name = user.name;
        this.userID = user.userID;
        this.userPhoto = user.userPhoto;
        this.userBackground = user.userBackground;
        this.TIMESTAMP = user.TIMESTAMP;

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserBackground() {
        return userBackground;
    }

    public void setUserBackground(String userBackground) {
        this.userBackground = userBackground;
    }

    public Object getTIMESTAMP() {
        return TIMESTAMP;
    }

    public void setTIMESTAMP(Object TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }
}
