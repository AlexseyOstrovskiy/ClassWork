package com.example.myapplication.utils;

import android.content.Context;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

import com.example.myapplication.R;

public class Dialog {
    public static void showErrorDialog(Context ctx, String error) {
        // создаем всплывающий диалог
        AlertDialog.Builder alert = new AlertDialog.Builder(ctx);
        alert.setMessage(error);
        alert.setTitle("Ошибка");
        alert.setCancelable(true);
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
       // alert.setIcon(R.drawable.kotface);// добавляем картинку к диалоговому окну
        alert.create().show();
    }

    public static void showDialog(Context ctx, String message) {
        // создаем всплывающий диалог
        AlertDialog.Builder alert = new AlertDialog.Builder(ctx);
        alert.setMessage(message);
        alert.setCancelable(true);
        alert.create().show();
    }

    public static void showCalendarDialog(Context ctx) {
        // создаем всплывающий диалог
        AlertDialog.Builder alert = new AlertDialog.Builder(ctx);
        alert.setView(R.layout.calendar_layout);
        alert.setCancelable(true);
        alert.create().show();
    }
}
