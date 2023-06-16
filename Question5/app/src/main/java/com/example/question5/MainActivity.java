package com.example.question5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

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
        int item_id=item.getItemId();
        TextView t=findViewById(R.id.textView);
        switch (item_id){
            case R.id.item1:
                t.setText("You");
                break;
            case R.id.item2:
                t.setText("Have");
                break;
            case R.id.item3:
                t.setText("Been");
                break;
            case R.id.item4:
                t.setText("Rickrolled");
        }
        return super.onOptionsItemSelected(item);
    }
}