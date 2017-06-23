package com.example.rvlopez.multilogin.navigator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.rvlopez.multilogin.activities.EmailLoginActivity;
import com.example.rvlopez.multilogin.activities.FacebookLoginActivity;
import com.example.rvlopez.multilogin.activities.GoogleLoginActivity;
import com.example.rvlopez.multilogin.activities.MainActivity;
import com.example.rvlopez.multilogin.activities.TwitterLoginActivity;
import com.example.rvlopez.multilogin.utils.Constants;

public class Navigator {

    private static Navigator instance;

    public Navigator() {
    }

    public static Navigator getInstance() {
        if (instance == null) {
            instance = new Navigator();
        }
        return instance;
    }

    public void nagigateToEmailLoginActivity(Context context) {
        if (context != null) {
            Intent intent = EmailLoginActivity.getCallingIntent(context);
            context.startActivity(intent);
        }
    }

    public void navigateToGoogleLoginActivity(Context context) {
        if (context != null) {
            Intent intent = GoogleLoginActivity.getCallingIntent(context);
            context.startActivity(intent);
        }
    }

    public void navigateToFacebookLoginActivity(Context context) {
        if (context != null) {
            Intent intent = FacebookLoginActivity.getCallingIntent(context);
            context.startActivity(intent);
        }
    }

    public void navigateToTwitterLoginActivity(Context context) {
        if (context != null) {
            Intent intent = TwitterLoginActivity.getCallingIntent(context);
            context.startActivity(intent);
        }
    }
}
