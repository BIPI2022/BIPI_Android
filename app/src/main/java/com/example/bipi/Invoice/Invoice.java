package com.example.bipi.Invoice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bipi.R;

import java.util.ArrayList;

public class Invoice extends AppCompatActivity {

    ArrayList<InvoiceModel> invoiceModels = new ArrayList<>();

    private ImageView iVAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);

        getSupportActionBar().hide();

        iVAdd = findViewById(R.id.invoice_imageView1);

        iVAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(Invoice.this, AddInvoice.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.invoice_RecyclerView);

        setUpInvoiceModels();

        InvoiceRecyclerViewAdapter adapter = new InvoiceRecyclerViewAdapter(this,
                invoiceModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private  void  setUpInvoiceModels(){
        String[] invoiceDate = getResources().getStringArray(R.array.invoice_date);
        String[] invoiceWeek = getResources().getStringArray(R.array.invoice_week);
        String invoiceNumber = getResources().getString(R.string.invoice_number_title);
        String[] number = getResources().getStringArray(R.array.invoice_number);
        String[] invoiceStatus = getResources().getStringArray(R.array.invoice_status);

        for (int i = 0; i < invoiceDate.length; i++){
            invoiceModels.add(new InvoiceModel(invoiceDate[i],
                    invoiceWeek[i],invoiceNumber,number[i],invoiceStatus[i]));
        }

    }
}