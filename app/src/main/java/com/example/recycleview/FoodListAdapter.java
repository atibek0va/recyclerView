package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.ViewHolder>{
    private List<food> foodList;
    private Context context;

    public FoodListAdapter(List<food> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView photo;
        public TextView name, desc, price;

        public ViewHolder(View view) {
            super(view);

            photo =view.findViewById(R.id.photo);
            name =view.findViewById(R.id.name);
            desc =view.findViewById(R.id.desc);
            price =view.findViewById(R.id.price);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_item_foods, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder sborka, int position) {
        food item = foodList.get(position);

        sborka.name.setText(item.getName());
        sborka.desc.setText(item.getDesc());
        sborka.price.setText(""+item.getPrice());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
