package com.example.harlequin.krypton;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Settt extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settt);

        ActionBar aB=this.getSupportActionBar();
        if(aB!=null)
            aB.setDisplayHomeAsUpEnabled(true);




    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            NavUtils.navigateUpFromSameTask(this);
        return super.onOptionsItemSelected(item);
    }






}
