package com.example.application_ostrovskogo.API;


import com.example.application_ostrovskogo.model.LoginRequest;
import com.example.application_ostrovskogo.model.LoginResponse;
import com.example.application_ostrovskogo.model.RegistrationRequest;
import com.example.application_ostrovskogo.model.RegistrationResponse;
<<<<<<< HEAD
import com.example.application_ostrovskogo.model.ConfirnRequest;
import com.example.application_ostrovskogo.model.ConfirnResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MyFamily {
    @POST("/login")
    Call<LoginResponse> login(@Body LoginRequest r);

    @POST("/registration")//создали вызов по адресу
    Call<RegistrationResponse> registration(@Body RegistrationRequest r);

    @POST("/confirm")//создали вызов по адресу
    Call<ConfirnResponse> confirm(@Body ConfirnRequest r);

=======

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface MyFamily {
    @GET("/login")
    Call<LoginResponse> login(@Body LoginRequest r);

    @GET("/registration")
    Call<RegistrationResponse> registration(@Body RegistrationRequest r);
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8
}

