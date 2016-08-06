package com.palle.rathan.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    Button buttonLogin;
    EditText editTextUsername, editTextPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonLogin = (Button) findViewById(R.id.button_login);
        buttonLogin.setOnClickListener(this);

        editTextUsername = (EditText) findViewById(R.id.editText);
        editTextPassword = (EditText) findViewById(R.id.editText2);

    }

    @Override
    public void onClick(View view) {
        Intent i= new Intent(LoginActivity.this, HomeActivity.class);
        i.putExtra("uname",editTextUsername.getText().toString());
        i.putExtra("uPassword",editTextPassword.getText().toString());

        startActivity(i);

        finish();
    }
}
