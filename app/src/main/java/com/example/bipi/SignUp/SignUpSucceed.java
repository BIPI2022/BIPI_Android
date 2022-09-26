package com.example.bipi.SignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bipi.R;
import com.example.bipi.SignInPage;

public class SignUpSucceed extends AppCompatActivity {
    private Button buttonGoToSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_succeed);

        buttonGoToSignIn = findViewById(R.id.btn_go_to_login);

        buttonGoToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(SignUpSucceed.this, SignInPage.class);
                startActivity(intent);
            }
        });


    }
}