package com.example.bipi.SignUp;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bipi.R;

public class TrainingSignUp extends AppCompatActivity {

    private Button buttonTrainingSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_sign_up);

        buttonTrainingSignUp = findViewById(R.id.btn_training_signup);

        buttonTrainingSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(TrainingSignUp.this,SignUpSucceed.class);
                startActivity(intent);
            }
        });

    }
}