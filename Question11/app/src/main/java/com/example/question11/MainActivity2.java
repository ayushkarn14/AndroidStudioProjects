package com.example.question11;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String name=getIntent().getExtras().getString("username","username");
        TextView t=findViewById(R.id.msg);
        t.setText("Welcome, "+name);
        Log.v("username ",name);


        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity2.this);
                builder.setMessage("Are you sure you want to exit?");
                builder.setTitle("Logout?");

                builder.setPositiveButton("Yes",(DialogInterface.OnClickListener) (dialog,which)->{
                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(intent);
                });
                builder.setNegativeButton("No",(DialogInterface.OnClickListener) (dialog, which)->{
                    dialog.cancel();
                });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }
        });
    }
}