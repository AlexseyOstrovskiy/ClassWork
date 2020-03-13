package com.example.application_ostrovskogo.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class APIService {
    private Retrofit mRetrofit;
    //Паттерн Singleton
    private static APIService instance;
    public static APIService getInstance (){
        if (instance == null) {
            instance = new APIService();//инициализация instance
            //Паттерн FabricBuilder
            instance.mRetrofit = new Retrofit.Builder()
                    .baseUrl("https://212f349f.ngrok.io")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;
    }

    public MyFamily getAPI(){
        return mRetrofit.create(MyFamily.class);
    }
}
