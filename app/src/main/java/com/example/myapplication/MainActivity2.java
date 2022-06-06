package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView t1,t2;
String str1,str2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1= (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        str1 = intent.getStringExtra("message_key1");
        str2 = intent.getStringExtra("message_key2");
        t1.setText(str1);
        t2.setText(str2);
    }
}