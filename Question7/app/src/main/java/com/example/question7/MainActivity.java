package com.example.question7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.option_menubar, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int i=item.getItemId();
        ConstraintLayout all=findViewById(R.id.all);
//        all.setBackgroundColor(Color.RED);
        switch (i){
            case R.id.item1:
                all.setBackgroundColor(Color.RED);
                break;
            case R.id.item2:
                all.setBackgroundColor(Color.BLUE);
                break;
            case R.id.item3:
                all.setBackgroundColor(Color.YELLOW);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}