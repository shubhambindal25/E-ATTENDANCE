package com.minor.attendance.Models;
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class student {
    public String name;
    public String email;
    public String studentype;

    public student() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public student(String name, String email,String UserType) {
        this.name = name;
        this.email = email;
        this.studentype=UserType;

    }
}
