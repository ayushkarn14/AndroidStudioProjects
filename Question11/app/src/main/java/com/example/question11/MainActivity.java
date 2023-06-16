package com.example.question11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login=findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txt=findViewById(R.id.name);
                String name=txt.getText().toString();
                EditText pass=findViewById(R.id.pass);
                String p=pass.getText().toString();
                if(name.equals("ayush") && p.equals("pass")){
                    Intent intent=new Intent(getBaseContext(), MainActivity2.class);
                    intent.putExtra("username",name);
                    startActivity(intent);
                    Log.v("Log","Logged in");
                }
                else
                    Log.v("Log",name);
            }
        });
    }
}