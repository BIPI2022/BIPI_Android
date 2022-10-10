package com.example.bipi.Invoice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bipi.R;

import java.util.ArrayList;

public class InvoiceRecyclerViewAdapter  extends RecyclerView.Adapter<InvoiceRecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<InvoiceModel> invoiceModels;

    public InvoiceRecyclerViewAdapter(Context context, ArrayList<InvoiceModel> invoiceModels){
        this.context = context;
        this.invoiceModels = invoiceModels;

    }

    @NonNull
    @Override
    public InvoiceRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.invoice_row,parent,false);

        return new InvoiceRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InvoiceRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvDate.setText(invoiceModels.get(position).getInvoiceDate());
        holder.tvWeek.setText(invoiceModels.get(position).getInvoiceWeek());
        holder.tvTitle.setText(invoiceModels.get(position).getInvoiceNumber());
        holder.tvNumber.setText(invoiceModels.get(position).getNumber());
        holder.tvStatus.setText(invoiceModels.get(position).invoiceStatus);

    }

    @Override
    public int getItemCount() {
        return invoiceModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvDate, tvWeek, tvTitle, tvNumber, tvStatus;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvDate = itemView.findViewById(R.id.textView);
            tvWeek = itemView.findViewById(R.id.textView5);
            tvTitle = itemView.findViewById(R.id.textView4);
            tvNumber = itemView.findViewById(R.id.textView3);
            tvStatus = itemView.findViewById(R.id.textView2);
        }
    }



}
