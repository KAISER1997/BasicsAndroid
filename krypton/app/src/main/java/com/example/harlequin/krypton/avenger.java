package com.example.harlequin.krypton;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;

//INTENT SERVICE
/**
 * Created by harlequin on 26/12/17.
 */

public class avenger extends IntentService {

    public avenger()
    {
        super("EAGLE");


    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        System.out.println("DUM"+String.valueOf(contract.e));
        ++contract.e;

    }
}
