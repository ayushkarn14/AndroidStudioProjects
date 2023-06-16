package com.example.question3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String NAME="login_data";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login(View v){
        EditText u=(EditText) findViewById(R.id.username);
        EditText p=(EditText) findViewById(R.id.password);

        String username=u.getText().toString();
        String password=p.getText().toString();

        if(username.equals("ayushkarn14") && password.equals("password")){
            Intent intent=new Intent(this, MainActivity2.class);
            intent.putExtra(NAME,"Logged in");
//            Toast.makeText(this, "Logged in", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }

    }
}