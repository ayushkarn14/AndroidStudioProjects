package com.example.question4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp=findViewById(R.id.spi);
        ImageView img=findViewById(R.id.img);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(sp.getSelectedItemId()==0){
                    img.setImageResource(R.drawable.image1);
                }if(sp.getSelectedItemId()==1){
                    img.setImageResource(R.drawable.image2);
                }if(sp.getSelectedItemId()==2){
                    img.setImageResource(R.drawable.image3);
                }if(sp.getSelectedItemId()==3){
                    img.setImageResource(R.drawable.image4);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}