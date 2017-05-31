package com.example.jaafo.apparchitecturegui.presenter;

import android.view.View;

import com.example.jaafo.apparchitecturegui.controler.activities.HomeView;
import com.example.jaafo.apparchitecturegui.model.Product;

import javax.inject.Inject;

/**
 * Created by jaafo on 30/05/2017.
 */

public class HomePresenter implements IHomePresenter {

    // region Implements presenter

    private Product mMyModel;
    private HomeView mHomeView;
    int i = 0;

    //endregion


    //region Constructor

    @Inject
    HomePresenter() {
        mMyModel = new Product();
    }

    //endregion


    // region Implements presenter

    @Override
    public void setView(HomeView view) {
        this.mHomeView = view;
    }

    @Override
    public void init() {
        mMyModel = new Product();
        mMyModel.setId("1");
        mMyModel.setName("Phone ");

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void bindProductName() {
        mHomeView.bindTitle(mMyModel.getName() + " " + i++);
    }

    //endregion
}
