package com.example.application_ostrovskogo.model;


import com.google.gson.annotations.SerializedName;

public class LoginRequest {
    @SerializedName("email")
    public String Email;
    @SerializedName("password")
    public String Password;
}
