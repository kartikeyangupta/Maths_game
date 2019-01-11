package com.example.mr_robot.map_practical_5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton lvl1 = findViewById(R.id.btn1);
        ImageButton lvl2 = findViewById(R.id.btn2);
        ImageButton lvl3 = findViewById(R.id.btn3);
        ImageButton lvl4 = findViewById(R.id.btn4);
        lvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,level_one.class);
                startActivity(i);
            }
        });
        lvl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,level_second.class);
                startActivity(i);
            }
        });
        lvl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,level_third.class);
                startActivity(i);
            }
        });
        lvl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,level_fourth.class);
                startActivity(i);
            }
        });
    }
}
