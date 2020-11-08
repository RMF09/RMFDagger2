package com.rmf.rmfdagger2;

import dagger.Component;

//the injector
@Component
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
