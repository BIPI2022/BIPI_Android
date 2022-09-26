package com.example.bipi.SignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bipi.R;

public class BuilderSignUp2 extends AppCompatActivity {
    private Button buttonGoNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_sign_up2);

        buttonGoNext = findViewById(R.id.btn_builder_next_1);
        buttonGoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(BuilderSignUp2.this,BuilderSignUp3.class);
                startActivity(intent);
            }
        });



    }
}