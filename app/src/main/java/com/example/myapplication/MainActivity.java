package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button move;
    EditText s1,s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        move=findViewById(R.id.button);
        s1=(EditText)findViewById(R.id.editTextTextPersonName);
        s2=(EditText)findViewById(R.id.editTextTextPersonName2);


        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = s1.getText().toString();
                String str2 = s2.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);


                intent.putExtra("message_key1", str1);
                intent.putExtra("message_key2", str2);

                startActivity(intent);

            }
        });
    }
}