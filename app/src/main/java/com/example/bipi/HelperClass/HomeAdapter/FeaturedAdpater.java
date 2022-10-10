package com.example.bipi.HelperClass.HomeAdapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bipi.Project.AddNewProject;
import com.example.bipi.Project.Project;
import com.example.bipi.Project.RecyclerViewInterface;
import com.example.bipi.R;

import java.util.ArrayList;

public class FeaturedAdpater extends RecyclerView.Adapter<FeaturedAdpater.FeaturedViewHolder> {

    private final RecyclerViewInterface recyclerViewInterface;

    ArrayList<FeaturedHelperClass> featuredLocations;


    public FeaturedAdpater(ArrayList<FeaturedHelperClass> featuredLocations, RecyclerViewInterface recyclerViewInterface) {
        this.featuredLocations = featuredLocations;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        FeaturedViewHolder featuredViewHolder = new FeaturedViewHolder(view, recyclerViewInterface);
        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {

        FeaturedHelperClass featuredHelperClass = featuredLocations.get(position);

        holder.image.setImageResource(featuredHelperClass.getImage());
        holder.title.setText(featuredHelperClass.getTitle());
        holder.desc.setText(featuredHelperClass.getDescription());

    }

    @Override
    public int getItemCount() {
        return featuredLocations.size();
    }



    public static class FeaturedViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title,desc;


        public FeaturedViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);

            //Hooks
            image = itemView.findViewById(R.id.card_iv1);
            title = itemView.findViewById(R.id.card_tv_1);
            desc = itemView.findViewById(R.id.card_tv_2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (recyclerViewInterface != null){
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION){
                            recyclerViewInterface.onItemClick(pos);
                        }

                    }
                }
            });
        }
    }
}
