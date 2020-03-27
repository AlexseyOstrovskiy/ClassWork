package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class addFinanceRequest {
    @SerializedName("date")
    public  String date;
    @SerializedName("sum")
    public float sum;
    @SerializedName("creditLable")
    public  String creditLable;
}
