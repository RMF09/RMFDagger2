package com.rmf.rmfdagger2;

import dagger.Component;

//the injector
@Component(modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
