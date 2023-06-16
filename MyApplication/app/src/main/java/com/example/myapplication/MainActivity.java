package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v) {
        TextView result = (TextView) findViewById(R.id.result);
        EditText x1 = (EditText) findViewById(R.id.num1);
        EditText x2 = (EditText) findViewById(R.id.num2);
        int ans = Integer.parseInt(x1.getText().toString()) + Integer.parseInt(x2.getText().toString());
        result.setText("Sum = "+Integer.toString(ans));
    }
    public void sub(View v) {
        TextView result = (TextView) findViewById(R.id.result);
        EditText x1 = (EditText) findViewById(R.id.num1);
        EditText x2 = (EditText) findViewById(R.id.num2);
        int ans = Integer.parseInt(x1.getText().toString()) - Integer.parseInt(x2.getText().toString());
        result.setText("Difference = "+Integer.toString(ans));
    }
    public void pro(View v) {
        TextView result = (TextView) findViewById(R.id.result);
        EditText x1 = (EditText) findViewById(R.id.num1);
        EditText x2 = (EditText) findViewById(R.id.num2);
        int ans = Integer.parseInt(x1.getText().toString()) * Integer.parseInt(x2.getText().toString());
        result.setText("Product = "+Integer.toString(ans));
    }
    public void div(View v) {
        TextView result = (TextView) findViewById(R.id.result);
        EditText x1 = (EditText) findViewById(R.id.num1);
        EditText x2 = (EditText) findViewById(R.id.num2);
        int ans = Integer.parseInt(x1.getText().toString()) / Integer.parseInt(x2.getText().toString());
        result.setText("Quotient = "+Integer.toString(ans));
    }
}