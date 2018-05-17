package com.twu.model;

public class User {
    public String name;
    public String libraryNumber;
    public String userType;
    public String password;
    public String email;
    public String phoneNumber;

    public User(String name, String libraryNumber, String userType, String password, String email, String phoneNumber) {
        this.name = name;
        this.libraryNumber = libraryNumber;
        this.userType = userType;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
