package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.api.APIBuilder;
import com.example.myapplication.model.JoinRequest;
import com.example.myapplication.model.JoinResponse;
import com.example.myapplication.utils.Dialog;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.join;

public class JoinActivity extends AppCompatActivity {
    private EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        email = findViewById(R.id.email);
        final Button joinBtn = findViewById(R.id.joinBtn);
        joinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("")) {
                    Dialog.showErrorDialog(JoinActivity.this, "Укажите email");
                    return;
                }
                String regex = "^(.+)@(.+)$";

                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(email.getText().toString());
                if (!matcher.matches())
                {
                    Dialog.showErrorDialog(JoinActivity.this, "неверно указан email");
                    return;
                }
                join(email.getText().toString());
            }
        });
    }

    public void join(String email) {
        JoinRequest r = new JoinRequest();
        r.email = email;
        APIBuilder<JoinRequest, JoinResponse> builder = new APIBuilder<>();
        builder.execute("join", r, JoinResponse.class, new APIBuilder.onCallback<JoinResponse>() {
            @Override
            public void onResponse(JoinResponse resp) {
                Dialog.showDialog(JoinActivity.this,"Пользователь добавлен!");
                JoinActivity.this.email.setText("");
            }

            @Override
            public void onError(Exception e) {
                Dialog.showDialog(JoinActivity.this, e.getMessage());
            }
        });
    }
}
