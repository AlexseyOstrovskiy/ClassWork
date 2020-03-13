package com.example.application_ostrovskogo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.application_ostrovskogo.API.APIService;
import com.example.application_ostrovskogo.model.ConfirnRequest;
import com.example.application_ostrovskogo.model.ConfirnResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConfirnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirn);
        final EditText code = findViewById(R.id.code);
        Button confirmBtn = findViewById(R.id.confirnBtn);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( code.getText().toString().equals("")){
                    showError("Введите код!");
                    return;
                }
                confirmCode(code.getText().toString());
            }
        });
    }
    public void showError(String error){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);//вывод диалогового окна с ошибкой
        alert.setMessage(error);
        alert.setTitle("Ошибка");
        alert.setCancelable(true);
        alert.setPositiveButton("ЯСНО", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {}//вызов окна про нажатии на кнопку "ЯСНО
        });
        alert.setIcon(R.drawable.ic_launcher_background);//вывод иконки
        alert.create();//создает объект alert dialog
        alert.show();
    }
    public void confirmCode(String code){
        //запрос на сервер
        ConfirnRequest r = new ConfirnRequest();
        r.code = code;
        APIService
                .getInstance()
                .getAPI()
                .confirm(r)
                .enqueue(new Callback<ConfirnResponse>() {
                    @Override
                    public void onResponse(Call<ConfirnResponse> call, Response<ConfirnResponse> response) {
                        ConfirnResponse resp = response.body();
                        if (!resp.result) {
                            showError(resp.error);
                        }else {
                            showMenuActivity();
                        }
                    }

                    @Override
                    public void onFailure(Call<ConfirnResponse> call, Throwable t) {
                        showError(t.getMessage());
                    }
                });

    }
    public void showMenuActivity(){
        Intent i = new Intent(this,MenuActivity.class);
        startActivity(i);

    }
}
