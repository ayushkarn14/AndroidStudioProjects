package com.example.question8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onPause(){
        super.onPause();
        Log.v("Life Cycle","On Pause");
    }
    public void onResume(){
        super.onResume();
        Log.v("Life Cycle :","On Resume");
    }
    public void onStop() {
        super.onStop();
        Log.v("Life Cycle :","On Stop");
    }
    public void onStart(){
        super.onStart();
        Log.v("Life Cycle","on Start");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.v("Life Cycle :","On Destroy");
    }
}