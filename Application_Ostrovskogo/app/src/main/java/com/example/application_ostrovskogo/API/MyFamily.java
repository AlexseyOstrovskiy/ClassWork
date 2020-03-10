package com.example.application_ostrovskogo.API;


import com.example.application_ostrovskogo.model.LoginRequest;
import com.example.application_ostrovskogo.model.LoginResponse;
import com.example.application_ostrovskogo.model.RegistrationRequest;
import com.example.application_ostrovskogo.model.RegistrationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface MyFamily {
    @GET("/login")
    Call<LoginResponse> login(@Body LoginRequest r);

    @GET("/registration")
    Call<RegistrationResponse> registration(@Body RegistrationRequest r);
}

