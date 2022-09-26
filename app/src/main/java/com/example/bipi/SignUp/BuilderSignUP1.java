package com.example.bipi.SignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bipi.R;

public class BuilderSignUP1 extends AppCompatActivity {
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_sign_up1);

        buttonNext = findViewById(R.id.btn_builder_next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(BuilderSignUP1.this,BuilderSignUp2.class);
                startActivity(intent);
            }
        });
    }
}