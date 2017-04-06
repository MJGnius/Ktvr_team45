package com.example.ktvr.ktvr_team45;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public EditText etUsername;
    public EditText etPassword;
    public Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etUsername.getText().toString().equals("driver") && etPassword.getText().toString().equals("1234")){
                    Toast.makeText(getApplicationContext(),"Please Wait", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(LoginActivity.this, DriverProfile.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(), "Incorrect Details", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
