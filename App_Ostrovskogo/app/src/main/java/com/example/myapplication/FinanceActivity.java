package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.myapplication.adapter.FinanceAdapter;
import com.example.myapplication.model.Finance;
import com.example.myapplication.utils.Dialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FinanceActivity extends AppCompatActivity {
    // TODO: remove
    private Finance[] fakeFinances = {
            new Finance(12.5f, "Vasya", "shopping", "24/03/2012 18:43:45"),
            new Finance(11.5f, "Kolya", "shopping", "23/03/2012 17:42:44"),
            new Finance(10.5f, "Petya", "shopping", "22/03/2012 16:41:43"),
            new Finance(9.5f, "Dasha", "shopping", "21/03/2012 15:40:42"),
            new Finance(8.5f, "Vika", "shopping", "20/03/2012 14:39:41")
    };
    //
    private ListView financesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);
        ImageButton calendarBtn = findViewById(R.id.calendarBtn);
        calendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog.showCalendarDialog(FinanceActivity.this);
            }
        });
        financesList = findViewById(R.id.financesList);
        FinanceAdapter adapter = new FinanceAdapter(this, fakeFinances);
        financesList.setAdapter(adapter);
        FloatingActionButton addBtn = findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FinanceActivity.this, AddCreditActivity.class);
                startActivity(i);
            }
        });
    }
}
