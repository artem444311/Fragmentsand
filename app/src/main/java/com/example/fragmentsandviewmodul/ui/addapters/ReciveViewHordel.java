package com.example.fragmentsandviewmodul.ui.addapters;

import android.view.View;
import android.widget.TextView;

import com.example.fragmentsandviewmodul.R;
import com.example.fragmentsandviewmodul.modules.Recipe;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReciveViewHordel extends RecyclerView.ViewHolder {
    private TextView txtTitle;
    private TextView txtMsg;
    public ReciveViewHordel(@NonNull View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtMsg = itemView.findViewById(R.id.txtMsg);
    }
    public void onBain(Recipe recipe){
        txtTitle.setText(recipe.getTitle());
        txtMsg.setText(recipe.getMsg());

    }
}
