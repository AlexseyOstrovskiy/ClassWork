package com.example.application_ostrovskogo.model;

import com.google.gson.annotations.SerializedName;

// то что приходит с сервера
public class ConfirnResponse {
    @SerializedName("result")
    public boolean result;
    @SerializedName("error")
    public String error;
    @SerializedName("token")
    public String token;
}
