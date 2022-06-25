package com.example.xz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉导航栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.poster);
        ImageButton login = findViewById(R.id.btn_next);
        login.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,gyxselect1.class);
            startActivity(intent);
        });
    }
}