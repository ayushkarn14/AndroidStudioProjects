package com.example.question3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String str= getIntent().getStringExtra(MainActivity.NAME);
        TextView text=findViewById(R.id.data);
        text.setText(str);
    }
}