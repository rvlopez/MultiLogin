package com.example.rvlopez.multilogin.navigator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.rvlopez.multilogin.activities.EmailLoginActivity;
import com.example.rvlopez.multilogin.activities.FacebookLoginActivity;
import com.example.rvlopez.multilogin.activities.GoogleLoginActivity;
import com.example.rvlopez.multilogin.activities.MainActivity;
import com.example.rvlopez.multilogin.activities.TwitterLoginActivity;
import com.example.rvlopez.multilogin.utils.Constants;

//TODO: It can't be an Activity. Change it using another type to navigate (EventBus..)
public class Navigator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        navigateTo((String) getIntent().getExtras().get(Constants.NAVIGATE));
    }

    private void navigateTo(String toActivity) {
        switch (toActivity) {
            case Constants.EMAIL_TITLE:
                startActivity(new Intent(this, EmailLoginActivity.class));
                break;
            case Constants.GOOGLE_TITLE:
                startActivity(new Intent(this, GoogleLoginActivity.class));
                break;
            case Constants.FACEBOOK_TITLE:
                startActivity(new Intent(this, FacebookLoginActivity.class));
                break;
            case Constants.TWITTER_TITLE:
                startActivity(new Intent(this, TwitterLoginActivity.class));
                break;
            default:
                break;
        }
    }
}
