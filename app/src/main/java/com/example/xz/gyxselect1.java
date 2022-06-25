package com.example.xz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class gyxselect1 extends AppCompatActivity {
    private Button btn_self;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉导航栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.select1);
        //声明点击自己学跳转到下一个页面
        btn_self=findViewById(R.id.btn_self);
        btn_self.setOnClickListener(view -> {
            Intent intent=new Intent(gyxselect1.this,gyxselect2.class);
            startActivity(intent);
        });
    }
}
