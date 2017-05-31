package com.example.jaafo.apparchitecturegui.controler.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.jaafo.apparchitecturegui.App;
import com.example.jaafo.apparchitecturegui.R;
import com.example.jaafo.apparchitecturegui.presenter.HomePresenter;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivty extends AppCompatActivity implements HomeView {

    //region Properties

    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @Inject
    HomePresenter mHomePresenter;

    //endregion


    //region Life Cycle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        App.getAppComponent(this).inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        initPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mHomePresenter.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mHomePresenter.onDestroy();
    }

    //endregion


    //region Private methods

    private void initPresenter() {
        mHomePresenter.init();
        mHomePresenter.setView(this);
    }

    //endregion


    //region Implements HomeView

    @Override
    public void bindTitle(String productName) {
        tvTitle.setText(productName);
    }

    //endregion


    //region Events

    @OnClick(R.id.btnShow)
    public void showOnClick() {
        mHomePresenter.bindProductName();
    }

    //endregion

}
