package com.example.jaafo.apparchitecturegui.controler.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.jaafo.apparchitecturegui.R;
import com.example.jaafo.apparchitecturegui.model.Product;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //region Properties

    private Product mMymodel;
    // link widgets in Controler using ButterKnife
    @BindView(R.id.tvTitle)
    TextView tvTitle;

    //endregion


    //region Life cycle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initUI();
    }

    //endregion


    //region Private methods

    private void initUI() {
        // Instantiate model
        mMymodel = new Product();
        mMymodel.setId("1");
        mMymodel.setName("Phone");
        // set the instruction text in the textview
        tvTitle.setText("Click the button to show product name");
    }

    //endregion


    //region Events

    // When the user click the button we set the name of product in text-view
    @OnClick(R.id.btnShow)
    public void showOnClick() {
        tvTitle.setText(mMymodel.getName());
        startActivity(new Intent(this,HomeActivty.class));
    }

    //endregion

}
