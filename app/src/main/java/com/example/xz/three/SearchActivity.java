package com.example.xz.three;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.xz.R;//导R
public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉导航栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_three_search);
    }
}