package com.example.bipi.Project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bipi.Invoice.Invoice;
import com.example.bipi.R;

public class CheckProject extends AppCompatActivity {

    private Button buttonCheckInvoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_project);

        getSupportActionBar().hide();

        String title = getIntent().getStringExtra("Title");
        String description = getIntent().getStringExtra("Description");
        int image = getIntent().getIntExtra("Image",0);


        TextView textView = findViewById(R.id.check_project_tv_1);
        TextView textView1 = findViewById(R.id.check_project_tv_2);
        ImageView imageView = findViewById(R.id.check_project_iv_1);

        textView.setText(title);
        textView1.setText(description);
        imageView.setImageResource(image);

        buttonCheckInvoice = findViewById(R.id.check_invoice_btn);

        buttonCheckInvoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(CheckProject.this, Invoice.class);
                startActivity(intent);

            }
        });


    }
}