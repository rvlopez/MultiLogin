package com.example.rvlopez.multilogin.activities;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.params.Face;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FacebookLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, FacebookLoginActivity.class);
    }
}
