package com.example.application_ostrovskogo;

import android.content.Intent;
<<<<<<< HEAD
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
=======
import android.os.Bundle;
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.application_ostrovskogo.API.APIService;
import com.example.application_ostrovskogo.model.LoginRequest;
import com.example.application_ostrovskogo.model.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
<<<<<<< HEAD
    private TextView errorMsg;

=======
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText login = findViewById(R.id.login);
        final EditText password = findViewById(R.id.password);
        Button loginBtn = findViewById(R.id.loginBtn);
<<<<<<< HEAD
        errorMsg = findViewById(R.id.errorMsg);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String error = "";
                if (login.getText().toString().equals("")){
                    error = "Заполните поле \"Логин\"\n";
                }
                if (password.getText().toString().equals("")){
=======
        final TextView errorMsg = findViewById(R.id.errorMsg);
        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String error = "";
                if (login.getText().toString().equals("")) {
                    error = "Заполните поле \"Логин\"\n";
                }
                if (password.getText().toString().equals("")) {
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8
                    error += "Заполните поле \"Пароль\"\n";
                }
                if (!error.equals("")){
                    errorMsg.setText(error);
                    errorMsg.setVisibility(View.VISIBLE);
                    return;
                }
                loginUser(login.getText().toString(), password.getText().toString());
<<<<<<< HEAD
            }
        });

        TextView signubBtn = findViewById(R.id.signupBtn);
        signubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
=======

               // showMenuActivity();

            }
        });
        TextView signupBtn = findViewById(R.id.signupBtn);
        signupBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8
                showStartActivity();
            }
        });

        TextWatcher t = new TextWatcher() {
            @Override
<<<<<<< HEAD
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
=======
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                errorMsg.setText("");
<<<<<<< HEAD
=======
               // errorMsg.setVisibility(View.INVISIBLE);
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8


            }

            @Override
<<<<<<< HEAD
            public void afterTextChanged(Editable s) { }
=======
            public void afterTextChanged(Editable s) {
            }
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8
        };
        login.addTextChangedListener(t);
        password.addTextChangedListener(t);
        errorMsg.setVisibility(View.INVISIBLE);
    }
<<<<<<< HEAD
    public void showMenuActivity(){
        Intent i = new Intent(this,MenuActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//
        startActivity(i);
    }
    public void showStartActivity(){
        Intent i = new Intent(this,StartActivity.class);
=======

    public void showMenuActivity(){
        Intent i = new Intent(this, MenuActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void showStartActivity(){
        Intent i = new Intent(this, StartActivity.class);
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8
        startActivity(i);
    }
    public void loginUser (String email, String password) {
        LoginRequest r = new LoginRequest();
        r.Email = email;
        r.Password = password;
        APIService
                .getInstance()
                .getAPI()
                .login(r)
                .enqueue(new Callback<LoginResponse>() {
                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        LoginResponse resp = response.body();
                        if (!resp.result) {
<<<<<<< HEAD
                            errorMsg.setVisibility(View.VISIBLE);
                            errorMsg.setText(resp.error);
                        }else {
                            //сохранить токен в памяти устройства
                            //сохраняем токин в кэш приложения
                            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                            SharedPreferences.Editor editor = preferences.edit();
                            editor.putString("API_TOKEN",resp.token);
                            editor.apply();
                            //получение объекта из кэша
                            //preferences.getString("API_TOKEN","default(значение по умолчанию)")
=======
                            //TODO: обработка ошибки
                        } else {
                            //TODO: сохранить токен в памяти устройства
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8
                            showMenuActivity();
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
<<<<<<< HEAD
                        errorMsg.setVisibility(View.VISIBLE);
                        errorMsg.setText(t.getMessage());
                    }
                });

    }
}
=======
                        //TODO: обработка ошибки
                    }
                });


    }
    }
>>>>>>> 39ddb3eeba596875ef08a37e2d72120f170a31e8
