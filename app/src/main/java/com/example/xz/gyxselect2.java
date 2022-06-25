package com.example.xz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class gyxselect2 extends AppCompatActivity {
    private Button gyx_btnnext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉导航栏
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.select2);
        //声明点击下一步跳转至下一个界面
        gyx_btnnext=findViewById(R.id.gyx_btnnext);
        gyx_btnnext.setOnClickListener(view -> {
            Intent intent=new Intent(gyxselect2.this,gyxlogin.class);
            startActivity(intent);
        });
    }
}
