package com.example.fragmentsandviewmodul.ui.addapters;

import android.speech.RecognizerIntent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentsandviewmodul.R;
import com.example.fragmentsandviewmodul.modules.Recipe;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAddapter extends RecyclerView.Adapter<ReciveViewHordel> {
    private ArrayList<Recipe> recipes;

    @NonNull
    @Override
    public ReciveViewHordel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resipe_layout,parent,false);
        return new ReciveViewHordel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReciveViewHordel holder, int position) {
holder.onBain(recipes.get(position));
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

}

