package com.rmf.rmfdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//    private Car car;

    //Inject Field
    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
//        car = carComponent.getCar();
        //Inject Field
        carComponent.inject(this);
//        car.drive();
    }


}