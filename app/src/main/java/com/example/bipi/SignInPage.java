package com.example.bipi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bipi.SignUp.SignUp;

public class SignInPage extends AppCompatActivity {
    //声明控件
    private Button buttonSignIn;
    private  Button buttonSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        //找到控件
        buttonSignIn = findViewById(R.id.btn_login);
        buttonSignUp = findViewById(R.id.btn_signup);

        //实现跳转
        buttonSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = null;
                intent = new Intent(SignInPage.this, SignUp.class);
                startActivity(intent);
            }
        });

    }
}

