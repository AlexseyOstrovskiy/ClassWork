package com.example.myapplication.api;

import com.example.myapplication.model.ConfirmRequest;
import com.example.myapplication.model.ConfirmResponse;
import com.example.myapplication.model.FinanceResponse;
import com.example.myapplication.model.JoinRequest;
import com.example.myapplication.model.JoinResponse;
import com.example.myapplication.model.LoginRequest;
import com.example.myapplication.model.LoginResponse;
import com.example.myapplication.model.RegistrationRequest;
import com.example.myapplication.model.RegistrationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MyFamily {
    @POST("/login")
    Call<LoginResponse> login(@Body LoginRequest r);

    @POST("/register")
    Call<RegistrationResponse> registration(@Body RegistrationRequest r);

    @POST("/submit")
    Call<ConfirmResponse> confirm(@Body ConfirmRequest r);

    @POST("/join")
    Call<JoinResponse> join(@Body JoinRequest r);

    @GET("/finance")
    Call<FinanceResponse> getFinance(@Query("startAt") String start, @Query("endAt") String end);
    //дополнительные параметны в запросе GET передаются в Query(часть адреса, расположенная после знака вопроса )
    //Параметры задаются в виде key=value
    //между собой параметры разделяются знаком &
    //чтобы задать query параметр в ретрофит, необходимо использовать директиву @Query("key"), где key - название параметра
    //ретрофит автоматически задаст параметр значения, указанное в аргументе, следующим за директивой
    // <server>/finance?startAt=01-01-2020&endAt=31-01-2020
}
