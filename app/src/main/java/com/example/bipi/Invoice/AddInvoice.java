package com.example.bipi.Invoice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.bipi.R;

import java.util.ArrayList;
import java.util.Calendar;

public class AddInvoice extends AppCompatActivity {


    EditText editDate;
    DatePickerDialog.OnDateSetListener setListener;

    private ArrayList<String> data = new ArrayList<String>();
    private ArrayList<String> data1 = new ArrayList<String>();
    private ArrayList<String> data2 = new ArrayList<String>();
    private ArrayList<String> data3 = new ArrayList<String>();

    private TableLayout table;
    EditText edItemName,edPrice,edQTY,edTotal;
    ImageButton imageButtonAdd;

    private TextView textViewSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_invoive);

        getSupportActionBar().hide();


        editDate = findViewById(R.id.add_invoice_et_3);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);


        editDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(AddInvoice.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month = month+1;
                        String date = day+"/"+month+"/"+ year;
                        editDate.setText(date);

                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

        edItemName = findViewById(R.id.add_invoice_et_5);
        edPrice = findViewById(R.id.add_invoice_et_6);
        edQTY = findViewById(R.id.add_invoice_et_7);
        edTotal = findViewById(R.id.subtotal);
        imageButtonAdd = findViewById(R.id.add_item);


        imageButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });

        textViewSave = findViewById(R.id.Add_TEXTView2);

        textViewSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(AddInvoice.this,Invoice.class);
                startActivity(intent);
            }
        });


    }

    public void add(){
        int total;

        String itemName = edItemName.getText().toString();
        int price = Integer.parseInt(edPrice.getText().toString());
        int qty = Integer.parseInt(edQTY.getText().toString());
        total = + price * qty;

        data.add(itemName);
        data1.add(String.valueOf(price));
        data2.add(String.valueOf(qty));
        data3.add(String.valueOf(total));

        TableLayout tableLayout = (TableLayout) findViewById(R.id.tb1);

        TableRow row = new TableRow(this);
        TextView item_tv1 = new TextView(this);
        TextView item_tv2 = new TextView(this);
        TextView item_tv3 = new TextView(this);
        TextView item_tv4 = new TextView(this);

        item_tv1.setTextColor(0xFFFCFCFC);
        item_tv2.setTextColor(0xFFFCFCFC);
        item_tv3.setTextColor(0xFFFCFCFC);
        item_tv4.setTextColor(0xFFFCFCFC);


        String subtotal;
        int sum = 0;

        for (int i = 0; i < data.size(); i ++){
            String iName = data.get(i);
            String prc = data1.get(i);
            String quantity = data2.get(i);
            String tot= data3.get(i);

            item_tv1.setText(iName);
            item_tv2.setText(prc);
            item_tv3.setText(quantity);
            item_tv4.setText(tot);

            sum = sum + Integer.parseInt(data3.get(i).toString());

        }



        row.addView(item_tv1);
        row.addView(item_tv2);
        row.addView(item_tv3);
        row.addView(item_tv4);
        tableLayout.addView(row);






        edTotal.setText(String.valueOf(sum));
        edItemName.setText("");
        edQTY.setText("");
        edPrice.setText("");
        edItemName.requestFocus();



    }


}


