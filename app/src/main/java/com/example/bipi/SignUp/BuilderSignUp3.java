package com.example.bipi.SignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.example.bipi.R;

public class BuilderSignUp3 extends AppCompatActivity {
    private Button buttonBuilderSignUp;
    private CheckBox mCB1;
    private CheckBox mCB2;
    private CheckBox mCB3;
    private CheckBox mCB4;
    private CheckBox mCB5;
    private CheckBox mCB6;
    private CheckBox mCB7;
    private CheckBox mCB8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_sign_up3);
        buttonBuilderSignUp = findViewById(R.id.btn_builder_signup);

        mCB1 = findViewById(R.id.cb_1);
        mCB2 = findViewById(R.id.cb_2);
        mCB3 = findViewById(R.id.cb_3);
        mCB4 = findViewById(R.id.cb_4);
        mCB5 = findViewById(R.id.cb_5);
        mCB6 = findViewById(R.id.cb_6);
        mCB7 = findViewById(R.id.cb_7);

        mCB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(BuilderSignUp3.this,"Checked",Toast.LENGTH_SHORT).show();
            }
        });

        mCB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(BuilderSignUp3.this,"Checked",Toast.LENGTH_SHORT).show();
            }
        });

        mCB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(BuilderSignUp3.this,"Checked",Toast.LENGTH_SHORT).show();
            }
        });

        mCB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(BuilderSignUp3.this,"Checked",Toast.LENGTH_SHORT).show();
            }
        });

        mCB5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(BuilderSignUp3.this,"Checked",Toast.LENGTH_SHORT).show();
            }
        });

        mCB6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(BuilderSignUp3.this,"Checked",Toast.LENGTH_SHORT).show();
            }
        });

        mCB7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(BuilderSignUp3.this,"Checked",Toast.LENGTH_SHORT).show();
            }
        });








        buttonBuilderSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(BuilderSignUp3.this, SignUpSucceed.class);
                startActivity(intent);
            }
        });
    }
}