package com.example.rvlopez.multilogin.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.rvlopez.multilogin.R;

public class EmailLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login);


    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, EmailLoginActivity.class);
    }
}
