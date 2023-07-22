package com.example.cafecanter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import java.util.Objects;

public class signInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Sign In");


    }
}