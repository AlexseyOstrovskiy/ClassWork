package com.example.application_ostrovskogo.API;


import com.example.application_ostrovskogo.model.LoginRequest;
import com.example.application_ostrovskogo.model.LoginResponse;
import com.example.application_ostrovskogo.model.RegistrationRequest;
import com.example.application_ostrovskogo.model.RegistrationResponse;

import com.example.application_ostrovskogo.model.ConfirnRequest;
import com.example.application_ostrovskogo.model.ConfirnResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MyFamily {
    @POST("/login")
    Call<LoginResponse> login(@Body LoginRequest r);

    @POST("/register")//создали вызов по адресу
    Call<RegistrationResponse> registration(@Body RegistrationRequest r);

    @POST("/submit")//создали вызов по адресу
    Call<ConfirnResponse> confirm(@Body ConfirnRequest r);}



