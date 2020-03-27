package com.example.myapplication.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIService {
    // Паттерн Singleton
    private Retrofit mRetrofit;
    private static APIService instance;
    public static APIService getInstance() {
        if (instance == null) {
            // инициализация instance
            instance = new APIService();
            // паттерн FabricBuilder
            instance.mRetrofit = new Retrofit.Builder()
                    .baseUrl("https://1e6868a8.ngrok.io")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;
    }

    public MyFamily getAPI() {
        return mRetrofit.create(MyFamily.class);
    }

}
