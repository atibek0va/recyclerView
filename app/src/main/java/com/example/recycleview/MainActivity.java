package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FoodListAdapter foodListAdapter;
    ArrayList<food> foodList;
    private RecyclerView.LayoutManager linearLayoutManager, gridLayoutManager;
    Button btnchange;
    Boolean layoutType = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        btnchange = findViewById(R.id.btnchange);
        foodList = new ArrayList<>();
        foodListAdapter = new FoodListAdapter(foodList, this);
        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(foodListAdapter);

        foodList.add(new food(R.drawable.ic_launcher_background, "Tiramisu", "Cake", 500));
        foodList.add(new food(R.drawable.ic_launcher_background, "Whoopie pie", "Cake", 1500));
        foodList.add(new food(R.drawable.ic_launcher_background, "Fruct cake", "Cake", 2500));

        btnchange.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                layoutType =! layoutType;
                if (layoutType){
                    recyclerView.setLayoutManager(gridLayoutManager);
                    foodList.remove(0);
                }else{
                    recyclerView.setLayoutManager(linearLayoutManager);
                }


                foodListAdapter.notifyDataSetChanged();
            }
        });
    }
}