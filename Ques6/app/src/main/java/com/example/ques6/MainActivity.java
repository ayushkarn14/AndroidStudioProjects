package com.example.ques6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1 , textView;
    CheckBox box1 , box2 , box3;

    Button submit;

    @SuppressLint("MissingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box1 = findViewById(R.id.box1);
        box2 = findViewById(R.id.box2);
        box3 = findViewById(R.id.box3);

        textView = findViewById(R.id.textView);
        textView1=findViewById(R.id.textView1);

        submit=findViewById(R.id.submit);


    }


    public void onClick(View v){
        if(box1.isChecked()){
                    textView.setText("Teacher Incharge = Sujata Khatri");
            };

        if(box2.isChecked()){
            textView.setText("Teacher Incharge = Ayush");
        };

        if(box3.isChecked()){
            textView.setText("Teacher Incharge = Girish");
        };

    }



}