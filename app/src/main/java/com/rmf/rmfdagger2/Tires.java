package com.rmf.rmfdagger2;

import android.util.Log;

public class Tires {
    //we don't own this class so we can't annotate it with @Inject
    private static final String TAG = "Car";

    public void inflate(){
        Log.d(TAG, "Tires inflate!");
    }
}
