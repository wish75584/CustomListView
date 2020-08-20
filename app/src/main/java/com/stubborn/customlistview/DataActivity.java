package com.stubborn.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        imageView = findViewById(R.id.img);
        textView=findViewById(R.id.name);

        Intent intent;
        intent = getIntent();
        String txt = intent.getStringExtra("key_name");
        int img = intent.getIntExtra("key_img",R.drawable.demo1);

        imageView.setImageResource(img);
        textView.setText(txt);


    }
}
