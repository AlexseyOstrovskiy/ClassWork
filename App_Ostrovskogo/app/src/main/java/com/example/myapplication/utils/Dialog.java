package com.example.myapplication.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import com.example.myapplication.R;
import com.example.myapplication.model.calendarDate;

public class Dialog {
    public interface onDateChangeListener{
      void  onDateChange(int year, int month, int day);
    }

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

    public static void showCalendarDialog(Context ctx, final onDateChangeListener listener) {
        // создаем всплывающий диалог
        AlertDialog.Builder alert = new AlertDialog.Builder(ctx);
        alert.setView(R.layout.calendar_layout);
        alert.setCancelable(true);
        final calendarDate date = new calendarDate();
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(!date.isEmpty()){
                listener.onDateChange( date.day, date.month, date.year);

            }}

        });
        AlertDialog dialog = alert.create();

        dialog.show();
        CalendarView calendar = dialog.findViewById(R.id.calendarView);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int y, int m, int d) {


            }
        });
    }
}
