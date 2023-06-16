package com.example.ques8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class activity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(this, "Second Activity Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {

        super.onStart();
        Toast.makeText(this, "Second Activity OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {

        super.onResume();
        Toast.makeText(this, "Second Activity OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {

        super.onPause();
        Toast.makeText(this, " Second Activity OnPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {

        super.onRestart();
        Toast.makeText(this, " Second Activity OnRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {

        super.onStop();
        Toast.makeText(this, "Second Activity OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Second Activity OnDestroy", Toast.LENGTH_SHORT).show();
    }

}

