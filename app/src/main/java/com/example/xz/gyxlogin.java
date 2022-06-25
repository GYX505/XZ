package com.example.xz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class gyxlogin extends AppCompatActivity {
    private Button gyx_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉导航栏
        getSupportActionBar().hide();
        setContentView(R.layout.login);
        gyx_login=findViewById(R.id.btn_login);
        gyx_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(gyxlogin.this,BaseActivity.class);
                startActivity(intent);
            }
        });
    }
}
