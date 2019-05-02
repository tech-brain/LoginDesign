package com.example.logindesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonSIgnUp;
    EditText editTextEmail, editTextPass, editTextRePass;
    TextView textViewLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSIgnUp = (Button) findViewById(R.id.btn_sign_up);

        editTextEmail = (EditText) findViewById(R.id.input_email);
        editTextPass = (EditText) findViewById(R.id.input_password);
        editTextRePass = (EditText) findViewById(R.id.input_re_password);

        textViewLogin = (TextView) findViewById(R.id.txt_login_here);

        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
