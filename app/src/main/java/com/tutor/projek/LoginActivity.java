package com.tutor.projek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText user, pass;
    Button bt_login;
    
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        bt_login = (Button) findViewById(R.id.bt_login);
        login();

        if(user.getText().toString().isEmpty()) user.setError("Maaf tidak boleh kosong.");
        if(pass.getText().toString().isEmpty()) pass.setError("Maaf tidak boleh kosong.");
    }

    public void login(){
        bt_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(user.getText().toString().equals("aldy")&&pass.getText().toString().equals("123456")) {
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(LoginActivity.this,"Login anda gagal, periksa kembali username dan password anda",Toast.LENGTH_LONG).show();
                }
            }
        });
      }
}