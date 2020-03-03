package com.example.application_ostrovskogo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText email = findViewById(R.id.email);
        final EditText name = findViewById(R.id.name);
        final EditText password = findViewById(R.id.password);
        final EditText confirmPassword = findViewById(R.id.confirmPassword);
        Button addBtn = findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String error = "";
                if (email.getText().toString().equals("")){
                    error += "укажите email \n";
                }
                if (name.getText().toString().equals("")){
                    error += "укажите имя \n";
                }
                if (password.getText().toString().equals("")){
                    error += "укажите пароль \n";
                }

                if (confirmPassword.getText().toString().equals("")){
                    error += "Подтвердите пароль \n";
                }

                if(!password.getText().toString().equals("") && !confirmPassword.getText().toString().equals("")){
                   if(!password.getText().toString().equals(confirmPassword.getText().toString())){
                       error += "Пароли должны совпадать";
                   }
                }

                if(!error.equals("")){
                    showError(error);
                }
            }

        });
    }

    public void showError(String error){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(error);
        alert.setTitle("Ошибка");
        alert.setCancelable(true);
        alert.create().show();
    }
}
