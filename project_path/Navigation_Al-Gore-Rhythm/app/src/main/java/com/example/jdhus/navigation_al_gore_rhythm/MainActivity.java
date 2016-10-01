package com.example.jdhus.navigation_al_gore_rhythm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        response = CustomHttpClient.executeHttpGet("http://www.google.com");
        Log.i(TAG, response);
    }
}
