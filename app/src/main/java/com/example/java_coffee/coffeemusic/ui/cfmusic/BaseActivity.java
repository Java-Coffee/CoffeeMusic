package com.example.java_coffee.coffeemusic.ui.cfmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Java-Coffee on 2017/5/9.
 */
public class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void showSnackbar(View view){
    }
    public void startToActivity(Class activity){
        Intent intent = new Intent();
        intent.setClass(this,activity);
        startActivity(intent);
    }
}
