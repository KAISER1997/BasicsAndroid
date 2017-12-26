package com.example.harlequin.krypton;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Acivity2 extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {

//loaders,service





    SQLiteDatabase mDb,mDb2;
    String work="";
    String tt="";
    int loaderNo=22;
    String wor="https://www.google.co.in";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Dbheper ob = new Dbheper(this);
      //  mDb=ob.getWritableDatabase();
//        String stm="INSERT INTO "+contract.TABLE_NAME+" ( "+contract.BOOK_NAME+" , "+contract.AUTHOR+" ) VALUES ('aditya','RAMA');";
//        mDb.execSQL(stm);
//using content values
        ContentValues cv=new ContentValues();
        cv.put(contract.BOOK_NAME,"GORI");
        cv.put(contract.AUTHOR,"patra");
       // mDb.insert(contract.TABLE_NAME,null,cv);
   Uri uriT=getContentResolver().insert(contract.CONTENT_URI,cv);
        System.out.println("HARAMBE--"+uriT.toString());



        mDb2=ob.getReadableDatabase();
        Cursor a1=mDb2.query(contract.TABLE_NAME,null,null,null,null,null,null);
        System.out.println("HARAMBE"+a1.getCount());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acivity2);
        if(savedInstanceState!=null)
        {
            if(savedInstanceState.containsKey("key1"))
                work=savedInstanceState.getString("key1");
        }
        Bundle qB=new Bundle();
        qB.putString("web",wor);
        LoaderManager ll=getSupportLoaderManager();
        Loader<String> gsl=ll.getLoader(22);
        if(gsl!=null)
        ll.restartLoader(22,qB,this).forceLoad();
        else
            ll.initLoader(22,qB,this).forceLoad();




    }
public void IGNITE(View view)
{

    Toast.makeText(this,tt,Toast.LENGTH_LONG).show();

}


    public String gori(URL op) throws IOException {
        HttpURLConnection ob=(HttpURLConnection)op.openConnection();
        InputStream in=ob.getInputStream();
        Scanner nt=new Scanner(in);
        nt.useDelimiter("\\A");
        if(nt.hasNext())
            return nt.next();
        else
            return  null;


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String a1=work;
        outState.putString("key1",a1);

    }

    public void Startwork(View view)
    {

        TextView a1=(TextView)findViewById(R.id.show);
        work=work+((EditText)findViewById(R.id.input)).getText().toString();
        a1.setText(work);



    }

    @Override
    public Loader<String> onCreateLoader(int id, final Bundle args) {
     System.out.println("FUN"+args.size());

        return new AsyncTaskLoader<String>(this) {
            String gt="";
            @Override
            public String loadInBackground() {


                 String ee=args.getString("web");
                System.out.println("FUN"+ee);

                URL pp= null;
                try {
                    pp = new URL(ee);

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

                try {
                      gt=gori(pp);
                    System.out.println("FUN"+gt);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            return (gt);
            }
        };
    }

    @Override
    public void onLoadFinished(Loader<String> loader, String data) {
    tt=data;
    }

    @Override
    public void onLoaderReset(Loader<String> loader) {

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2,menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         if(item.getItemId()==R.id.act2)
         {
             Intent it=new Intent(this,Settt.class);
             startActivity(it);
         }
         return true;
    }

   public void eagle(View view)
   {
       Intent serviceIntent=new Intent(this,avenger.class);
       startService(serviceIntent);


   }







}
