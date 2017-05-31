package com.example.jaafo.apparchitecturegui.dependency;

import com.example.jaafo.apparchitecturegui.App;

import dagger.Module;

/**
 * Created by jaafo on 31/05/2017.
 */
@Module
public class AppModule {
    private App app;

    public AppModule(App app) {
        this.app = app;
    }
}
