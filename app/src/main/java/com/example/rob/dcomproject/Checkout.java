package com.example.rob.dcomproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Checkout extends AppCompatActivity {

    @Bind(R.id.btn20) Button btn20;
    @Bind(R.id.btn20two) Button btn20Two;
    @Bind(R.id.D20) Button D20;
    @Bind(R.id.T20) Button T20;
    @Bind(R.id.btn1) Button btn1;
    @Bind(R.id.btn1two) Button btn1Two;
    @Bind(R.id.btnD1) Button btnD1;
    @Bind(R.id.btnD1two) Button btnD1Two;
    @Bind(R.id.btnT1) Button btnT1;
    @Bind(R.id.btn18) Button btn18;
    @Bind(R.id.btn18two) Button btn18Two;
    @Bind(R.id.btn18Three) Button btn18Three;
    @Bind(R.id.btnT18) Button btnT18;
    @Bind(R.id.btnT18Two) Button btnT18Two;
    @Bind(R.id.checkOut) TextView text;


    @OnClick({R.id.btn20, R.id.btn20two})
    public void cal20(Button btn) {
        text.setText("20");
    }

    @OnClick(R.id.D20)
    public void calD20(Button btn){
        text.setText("40");
    }

    @OnClick(R.id.T20)
    public void calT20(Button btn){
        text.setText("60");
    }

    @OnClick({R.id.btn1, R.id.btn1two})
    public void cal1(Button btn){
        text.setText("1");
    }

    @OnClick(R.id.btnD1)
    public void calD1(Button btn){
        text.setText("2");
    }

    @OnClick(R.id.btnT1)
    public void calT1(Button btn){
        text.setText("3");
    }

    @OnClick({R.id.btn18, R.id.btn18two, R.id.btn18Three})
    public void call18(Button btn){
        text.setText("18");
    }

    @OnClick({R.id.btnT18, R.id.btnT18Two})
    public void callT18(Button btn){
        text.setText("54");
    }

    @OnClick({R.id.btnD18, R.id.btnD18Two})
    public void callD18(Button btn){
        text.setText("36");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        ButterKnife.bind(this);

    }


}
