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
import com.example.application_ostrovskogo.model.LoginResponse;
import com.example.application_ostrovskogo.model.RegistrationRequest;
import com.example.application_ostrovskogo.model.RegistrationResponse;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText email = findViewById(R.id.email);
        final EditText name = findViewById(R.id.name);
        final EditText password = findViewById(R.id.password);
        final EditText confirmPassword = findViewById(R.id.confirmPassword);

        Button okBtn = findViewById(R.id.addBtn);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String error = "";
                if(email.getText().toString().equals("")){
                    error += "Укажите Email\n";
                }
                if(name.getText().toString().equals("")){
                    error += "Укажите Имя\n";
                }
                if(password.getText().toString().equals("")){
                    error += "Укажите Пароль\n";
                }
                if(confirmPassword.getText().toString().equals("")){
                    error += "Подтвердите пароль\n";
                }
                if(!password.getText().toString().equals("") && !confirmPassword.getText().toString().equals("")){

                    if (!password.getText().toString().equals(
                            confirmPassword.getText().toString())){
                        error += "Пароли должны совпадать!";
                    }
                }
                if(!error.equals("")){//если произошла какая то ошибка, то выводим сообщение об ошибке
                    showError(error);
                    return;
                }
                registerUser(name.getText().toString(),email.getText().toString(),password.getText().toString());
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
    public void registerUser(String name,String email,String password){
        RegistrationRequest r = new RegistrationRequest();
        r.email = email;
        r.password = password;
        r.name = name;
        APIService
                .getInstance()
                .getAPI()
                .registration(r)
                .enqueue(new Callback<RegistrationResponse>() {
                    @Override
                    public void onResponse(Call<RegistrationResponse> call, Response<RegistrationResponse> response) {
                        RegistrationResponse resp = null;
                        if(!response.isSuccessful()){
                            Gson g = new Gson();
                            resp = g.fromJson(
                                    response.errorBody().charStream(),RegistrationResponse.class);
                        }else{
                               resp =  response.body();}
                        if (!resp.result) {
                            showError(resp.error);
                        }else {
                            showConfirmActivity();
                        }
                    }

                    @Override
                    public void onFailure(Call<RegistrationResponse> call, Throwable t) {
                        showError(t.getMessage());
                    }
                });

    }
    public void showConfirmActivity() {//создание новой активной активити
        Intent i = new Intent(this,ConfirnActivity.class);
        startActivity(i);
    }
}
