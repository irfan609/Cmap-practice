package com.example.pageforlog_in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {

    private ImageView cloc;
    private ImageView near;
    private ImageView aboutus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        cloc = findViewById(R.id.currentloc);
        near = findViewById(R.id.nearest);
        aboutus = findViewById(R.id.about);
        cloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, currentloca.class);
                startActivity(intent);
            }
        });

        near.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, nearloca.class);
                startActivity(intent);
            }
        });


        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, about.class);
                startActivity(intent);
            }
        });
    }}

