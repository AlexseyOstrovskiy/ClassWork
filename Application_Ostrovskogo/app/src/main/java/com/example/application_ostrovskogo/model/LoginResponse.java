package com.example.application_ostrovskogo.model;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("result")
    public boolean result;
    @SerializedName("error")
    public String error;
    @SerializedName("token")
    public  String token;// строка с зашифрованной информацией о вас
}