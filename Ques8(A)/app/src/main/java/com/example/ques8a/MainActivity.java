package com.example.ques8a;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button click;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click=findViewById(R.id.btn);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,activity_second.class);
                startActivity(intent);
            }
        });
    }



    @Override
    protected void onStart() {

        super.onStart();
        Toast.makeText(this, "Main Activity OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {

        super.onResume();
        Toast.makeText(this, "Main Activity OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {

        super.onPause();
        Toast.makeText(this, " Main Activity OnPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {

        super.onRestart();
        Toast.makeText(this, "Main Activity OnRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {

        super.onStop();
        Toast.makeText(this, "Main Activity OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Main Activity OnDestroy", Toast.LENGTH_SHORT).show();
    }
}