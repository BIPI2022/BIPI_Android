package com.example.bipi.SignUp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bipi.R;


public class SignUp extends AppCompatActivity {
    private Button buttonBorrower;
    private Button buttonBuilder;
    private  Button buttonTraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        buttonBorrower = findViewById(R.id.btn_borrower);
        buttonBuilder = findViewById(R.id.btn_builder);
        buttonTraining = findViewById(R.id.btn_training);

        buttonBorrower.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = null;
                intent = new Intent(SignUp.this,BorrowerSignUp.class);
                startActivity(intent);
            }

        });

        buttonBuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(SignUp.this,BuilderSignUP1.class);
                startActivity(intent);

                }


        });

        buttonTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(SignUp.this,TrainingSignUp.class);
                startActivity(intent);
            }
        });

    }

}