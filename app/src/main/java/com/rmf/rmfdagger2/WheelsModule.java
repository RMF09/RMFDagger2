package com.rmf.rmfdagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims(){
        return  new Rims();
    }
    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }


    @Provides
    static Wheels provideWheels(Rims rims,Tires tires){
        //rims and tires from provide method -auto
        return new Wheels(rims,tires);
    }
}