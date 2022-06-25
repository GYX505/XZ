package com.example.xz;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class gyxlogin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉导航栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.login);
    }
}
