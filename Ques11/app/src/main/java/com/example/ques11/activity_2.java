package com.example.ques11;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_2 extends AppCompatActivity {

    TextView textView;
    Button Logout;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView = findViewById(R.id.textView);
        Logout = findViewById(R.id.Logout);

       Logout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void  onClick(View view) {

               Dialog alert = new Dialog(activity_2.this);
               alert.setContentView(R.layout.alert);
               alert.show();

               Button yes , no;
               yes=alert.findViewById(R.id.yes);
               no=alert.findViewById(R.id.no);

               yes.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Intent intent = new Intent(activity_2.this , MainActivity.class);
                       startActivity(intent);
                   }
               });

               no.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       alert.dismiss();
                   }
               });






           }
       });
    }
}