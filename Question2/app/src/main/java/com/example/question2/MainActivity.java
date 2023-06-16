package com.example.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void increment(View view){
        TextView t=(TextView) findViewById(R.id.num);
        int num=Integer.valueOf(t.getText().toString());
        num++;
        t.setText(Integer.toString(num));
    }public void decrement(View view){
        TextView t=(TextView) findViewById(R.id.num);
        int num=Integer.valueOf(t.getText().toString());
        num--;
        t.setText(Integer.toString(num));
    }public void reset(View view){
        TextView t=(TextView) findViewById(R.id.num);
        t.setText("0");
    }
}