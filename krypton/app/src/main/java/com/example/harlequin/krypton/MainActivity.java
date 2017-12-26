package com.example.harlequin.krypton;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {





URL vv=null;
    String ff="";
    String hhf="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


     String work="https://www.google.co.in";
        Uri bb=Uri.parse(work).buildUpon().build();
        try {
           vv=new URL(work);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
new Github().execute(vv);

        RecyclerView ii=(RecyclerView)findViewById(R.id.gundam);
        LinearLayoutManager l=new LinearLayoutManager(this);
        ii.setLayoutManager(l);
        hARAM bv=new hARAM();
        ii.setAdapter(bv);







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main,menu);
      return true;


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int j = item.getItemId();
        if (j == R.id.action)
        {

            Intent it=new Intent(MainActivity.this,Acivity2.class);
            startActivity(it);


        }
        return true;
    }

     public String gorilla(URL op) throws IOException {
        HttpURLConnection ob=(HttpURLConnection)op.openConnection();
         InputStream in=ob.getInputStream();
         Scanner nt=new Scanner(in);
        nt.useDelimiter("\\A");
        if(nt.hasNext())
            return nt.next();
        else
            return  null;


    }


    public class Github extends AsyncTask<URL,String,String>
    {


        @Override
        protected String doInBackground(URL... urls) {
             URL oi=urls[0];
            try {
                ff=gorilla(oi);
            } catch (IOException e) {
                e.printStackTrace();
            }
           return ff;
        }


        @Override
        protected void onPostExecute(String s) {
           hhf=s;
        }
    }





}


