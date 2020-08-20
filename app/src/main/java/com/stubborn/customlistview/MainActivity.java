package com.stubborn.customlistview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int images[] = {R.drawable.demo1, R.drawable.demo2, R.drawable.demo3,
            R.drawable.demo4, R.drawable.demo5, R.drawable.demo6};
    String name[] = {"text1", "text1", "text1", "text1", "text1", "text1"};
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        myAdapter = new MyAdapter(MainActivity.this, images, name);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, name[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DataActivity.class);
                intent.putExtra("key_img", images[position]);
                intent.putExtra("key_name", name[position]);
                startActivity(intent);
            }
        });
    }
}
