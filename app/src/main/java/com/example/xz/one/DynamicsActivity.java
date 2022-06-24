package com.example.xz.one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.example.xz.R;//导R
public class DynamicsActivity extends AppCompatActivity {
    private ImageView imageView1,imageView2,imageView3,imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉导航栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dynamics);
        imageView1=findViewById(R.id.m1);
        imageView2=findViewById(R.id.m2);
        Initdata();
    }
    private void Initdata(){
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.bilibili.com/video/BV1eo4y1X7b5?share_source=copy_web");    //设置跳转的网站
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DynamicsActivity.this,Dynamic_example2Activity.class);
                startActivity(intent);
            }
        });
    }
}