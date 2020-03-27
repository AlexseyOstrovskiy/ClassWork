package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.api.APIService;
import com.example.myapplication.model.ConfirmRequest;
import com.example.myapplication.model.ConfirmResponse;
import com.example.myapplication.model.RegistrationRequest;
import com.example.myapplication.model.RegistrationResponse;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        final EditText code = findViewById(R.id.code);
        final Button confirmBtn = findViewById(R.id.confirmBtn);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (code.getText().toString().equals("")) {
                    showError("Введите код!");
                    return;
                }
                confirmCode(code.getText().toString());
            }
        });
    }

    public void showError(String error) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
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

    public void confirmCode(String code) {
        // запрос на сервер
        ConfirmRequest r = new ConfirmRequest();
        r.code = code;
        APIService
                .getInstance()
                .getAPI()
                .confirm(r)
                .enqueue(new Callback<ConfirmResponse>() {
                    @Override
                    public void onResponse(Call<ConfirmResponse> call, Response<ConfirmResponse> response) {
                        ConfirmResponse resp = null;
                        if (!response.isSuccessful()) {
                            Gson g = new Gson();
                            resp = g.fromJson(response.errorBody().charStream(),ConfirmResponse.class);
                        } else {
                            resp = response.body();
                        }
                        //ConfirmResponse resp = response.body();
                        if (!resp.result) {
                            showError(resp.error);
                        } else {
                            showMenuActivity();
                        }
                    }

                    @Override
                    public void onFailure(Call<ConfirmResponse> call, Throwable t) {
                        showError(t.getMessage());
                    }
                });
    }

    public void showMenuActivity() {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }
}
