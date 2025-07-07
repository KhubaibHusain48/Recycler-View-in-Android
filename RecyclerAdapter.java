package com.example.recyclerviewpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context C;
    ArrayList<DataClass> D;
    public RecyclerAdapter(Context c, ArrayList<DataClass> d) {
        C = c;
        D = d;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(C).inflate(R.layout.activity_structure,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        holder.imgV.setImageResource(D.get(position).image);
        holder.txt1.setText(D.get(position).name);
        holder.txt2.setText(D.get(position).num);

    }

    @Override
    public int getItemCount() {
        return D.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgV;
        TextView txt1,txt2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgV=itemView.findViewById(R.id.image);
            txt1=itemView.findViewById(R.id.contact);
            txt2=itemView.findViewById(R.id.ContactNum);
        }
    }
}

