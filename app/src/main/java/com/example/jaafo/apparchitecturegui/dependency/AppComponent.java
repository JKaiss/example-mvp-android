package com.example.jaafo.apparchitecturegui.dependency;

import com.example.jaafo.apparchitecturegui.controler.activities.HomeActivty;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jaafo on 31/05/2017.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    HomeActivty inject(HomeActivty activty);
}
