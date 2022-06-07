package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private Button move;
    EditText s1, s2;
    RadioGroup g;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        move = findViewById(R.id.button);
        s1 = (EditText) findViewById(R.id.editTextTextPersonName);
//        s2=(EditText)findViewById(R.id.editTextTextPersonName2);
        g = findViewById(R.id.rg);
        // store the text corresponding to  the RadioButton which is clicked

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str1 = s1.getText().toString();
                String str2 = s1.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);


                intent.putExtra("message_key1", str1);

                intent.putExtra("message_key2", str);

                startActivity(intent);

            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.odd:
                if (checked)
                    str = "odd";
                Intent intent = new Intent();

                    break;
            case R.id.even:
                if (checked)
                    str = "even";
                    break;

        }
    }

    }
