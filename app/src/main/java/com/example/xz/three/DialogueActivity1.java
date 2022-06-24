package com.example.xz.three;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.xz.R;//导R
public class DialogueActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue1);
        //去掉导航栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dialogue1);
        ImageView imageView=findViewById(R.id.xing_re);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}