package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    private void addListenerOnButtonClick() {
        CheckBox a = (CheckBox) findViewById(R.id.apple);
        CheckBox m = (CheckBox) findViewById(R.id.mango);
        CheckBox p = (CheckBox) findViewById(R.id.pine);
        CheckBox o = (CheckBox) findViewById(R.id.orange);

        Button buy = (Button) findViewById(R.id.button);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total = 0;
                String text = "";
                if (a.isChecked()) {
                    text += "Apple          10\n";
                    total += 10;
                }
                if (m.isChecked()) {
                    text += "Mango        20\n";
                    total += 20;
                }
                if (p.isChecked()) {
                    text += "Pineapple   30\n";
                    total += 30;
                }
                if (o.isChecked()) {
                    text += "Orange        40\n";
                    total += 40;
                }
                TextView t = (TextView) findViewById(R.id.textView);
                t.setText(text + "Total           " + total);
            }
        });
    }
}