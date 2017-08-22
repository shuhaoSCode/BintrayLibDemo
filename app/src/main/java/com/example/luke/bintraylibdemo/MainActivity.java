package com.example.luke.bintraylibdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testjcenterdemo.GetToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetToast getToast = GetToast.getInstance(this);
        getToast.getToast("gogogogo");
    }
}
