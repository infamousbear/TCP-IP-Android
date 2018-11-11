package com.example.a3ctko.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        Intent intent = getIntent();
        String Receive_IP = intent.getStringExtra("IP");
        TextView textView = findViewById(R.id.Second_txt);
        textView.setText(Receive_IP);

    }

}
