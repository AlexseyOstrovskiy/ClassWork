package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("result")
    public boolean result;
    @SerializedName("error")
    public String error;
    @SerializedName("token") //строка, в которой зашифрована информация о нас
    public String token;
}
