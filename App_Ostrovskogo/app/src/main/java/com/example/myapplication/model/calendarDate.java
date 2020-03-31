package com.example.myapplication.model;

public class calendarDate {
    public int year;
    public  int month;
    public int day;


    public boolean isEmpty(){
        return  this.day ==0 && this.month == 0 && this.year == 0;
    }
}
