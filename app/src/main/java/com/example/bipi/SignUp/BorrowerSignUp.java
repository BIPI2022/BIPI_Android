package com.example.bipi.SignUp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bipi.R;

public class BorrowerSignUp extends AppCompatActivity {

    private Button buttonBorrowerSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrower_sign_up);

        buttonBorrowerSignUp = findViewById(R.id.btn_borrower_signup);

        buttonBorrowerSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(BorrowerSignUp.this,SignUpSucceed.class);
                startActivity(intent);
            }
        });
    }
}