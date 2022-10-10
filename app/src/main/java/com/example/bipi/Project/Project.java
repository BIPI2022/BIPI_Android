package com.example.bipi.Project;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bipi.HelperClass.HomeAdapter.FeaturedAdpater;
import com.example.bipi.HelperClass.HomeAdapter.FeaturedHelperClass;
import com.example.bipi.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Project extends AppCompatActivity  implements RecyclerViewInterface{

    private BottomNavigationView btmNavView;

    private ImageView imageViewAdd;

    RecyclerView featuredRecycler;
    RecyclerView.Adapter adapter;

    ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        getSupportActionBar().hide();

        imageViewAdd = findViewById(R.id.project_imageView1);

        featuredRecycler = findViewById(R.id.project_recycler_view);

        featuredRecycler();



        imageViewAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(Project.this,AddNewProject.class);
                startActivity(intent);
            }
        });
    }

    private void featuredRecycler(){

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));

        featuredLocations.add(new FeaturedHelperClass(R.drawable.project1,"Barton Apartment \nComplex","In progress"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.project2,"Turner Apartment \nPrecinct","In progress"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.project3,"Cook Housing \nDevelopment","In progress"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.project4,"Apartment","Completed"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.project5,"House","Completed"));
        adapter = new FeaturedAdpater(featuredLocations, this);
        featuredRecycler.setAdapter(adapter);

    }

    @Override
    public void onItemClick(int position) {



        Intent intent = new Intent(Project.this, CheckProject.class);

        intent.putExtra("Title",featuredLocations.get(position).getTitle());
        intent.putExtra("Description",featuredLocations.get(position).getDescription());
        intent.putExtra("Image",featuredLocations.get(position).getImage());
        startActivity(intent);

    }
}