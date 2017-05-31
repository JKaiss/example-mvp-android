package com.example.jaafo.apparchitecturegui.presenter;


import android.view.View;

import com.example.jaafo.apparchitecturegui.controler.activities.HomeView;

/**
 * Created by jaafo on 30/05/2017.
 */

interface IHomePresenter {

    void setView(HomeView view);

    void init();

    void onResume();

    void onDestroy();

    void bindProductName();
}
