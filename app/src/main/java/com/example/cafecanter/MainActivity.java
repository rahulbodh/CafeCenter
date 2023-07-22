package com.example.cafecanter;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.loginBtn);
        Button register = findViewById(R.id.registerbtn);
        TextView skip = findViewById(R.id.btnskip);

        Intent intent = new Intent(MainActivity.this,signInActivity.class);

       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                  startActivity(intent);
               }


           
       });

       register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this,"clicked register button",Toast.LENGTH_SHORT).show();
           }
       });

       skip.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this,"clicked skip button",Toast.LENGTH_SHORT).show();
           }
       });


    }
}