package com.example.sean.speechtotexttutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    private TextView txtSpeechInput01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        String result = extras.getString("Key");

        if (result != null) {
            txtSpeechInput01.setText("Hello World");
        }
    }
}
