package com.example.harlequin.krypton;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
//VIEWHOLDER FOR RECYCLE VIEW
/**
 * Created by harlequin on 16/12/17.
 */

public class gorilla   extends RecyclerView.ViewHolder
{
     TextView ob;

    public gorilla(View itemView) {
        super(itemView);
        ob=(TextView)itemView.findViewById(R.id.hum);

    }

   void bind(int index)
   {


       ob.setText(String.valueOf(index));

   }










}
