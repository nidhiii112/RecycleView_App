package com.nidhi.recycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleItem> mExamplelist;
    public class ExampleViewHolder extends RecyclerView.ViewHolder{
         public ImageView imageView;
         public TextView textView;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

        }
        }
        public ExampleAdapter(ArrayList<ExampleItem> exampleList){

        mExamplelist = exampleList;
        }


    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.example_list,parent,false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int i) {

        ExampleItem currentItem = mExamplelist.get(i);
        exampleViewHolder.imageView.setImageResource(currentItem.getmImageresource());
        exampleViewHolder.textView.setText(currentItem.getmText());
    }

    @Override
    public int getItemCount() {

        return mExamplelist.size();
    }
}
