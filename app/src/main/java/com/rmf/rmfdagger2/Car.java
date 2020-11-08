package com.rmf.rmfdagger2;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject Engine engine;
    @Inject Wheels wheels;

    @Inject
    public Car() {
        Log.d(TAG, "Car Ready");
    }

    //method injection otomatis dipanggil ketika consctructor->member dipanggil
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
    @Inject
    public void drive(){
        Log.d(TAG, "driving...");
    }
}

//Dipanggil  Consuctor-> member-> method injection
