package com.example.xz.three;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.xz.R;//导R
public class DialogueActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue2);
        //去掉导航栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dialogue2);
        ImageView imageView=findViewById(R.id.doc_re);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}