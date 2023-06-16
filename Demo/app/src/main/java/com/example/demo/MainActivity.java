package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String NAME="answer";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn=findViewById(R.id.button);
    }
    public void onClick(View view){
//        Toast.makeText(this, "Helloooo", Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(this,MainActivity2.class);
//        startActivity(intent);
        EditText num1=findViewById(R.id.num1);
        EditText num2=findViewById(R.id.num2);
        TextView ans=findViewById(R.id.ans);
        int sum=Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());

        Intent intent=new Intent(this, MainActivity2.class);
        intent.putExtra(NAME,Integer.toString(sum));

        startActivity(intent);
    }

}