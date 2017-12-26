package com.example.harlequin.krypton;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by harlequin on 17/12/17.
 */
//RECYCLE VIEW
public class hARAM extends RecyclerView.Adapter<gorilla> {


    int m=20;

    @Override
    public gorilla onCreateViewHolder(ViewGroup parent, int viewType) {
        Context con=parent.getContext();
       View vv= LayoutInflater.from(con).inflate(R.layout.num_list,parent,false);
        gorilla ob=new gorilla(vv);
        return ob;

    }

    @Override
    public void onBindViewHolder(gorilla holder, int position) {
     holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return m;
    }
}
