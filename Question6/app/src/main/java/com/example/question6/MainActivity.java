package com.example.question6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        TextView t=findViewById(R.id.textView);
        RadioButton op1=findViewById(R.id.cs);
        RadioButton op2=findViewById(R.id.eng);
        RadioButton op3=findViewById(R.id.phy);
        RadioButton op4=findViewById(R.id.mts);

        if(op1.isChecked()){
            t.setText("Sujata Khatri");
        }
        else if(op2.isChecked())
            t.setText("Mishail");
        else if (op3.isChecked())
            t.setText("Hoga koi");
        else if (op4.isChecked()) {
            t.setText("Ab sabka thodi pata hai");
        }
        else
            t.setText("koi option to select karo");
    }
}