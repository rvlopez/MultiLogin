package com.example.rvlopez.multilogin.navigator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.widget.ImageView;

import com.example.rvlopez.multilogin.activities.EmailLoginActivity;
import com.example.rvlopez.multilogin.activities.FacebookLoginActivity;
import com.example.rvlopez.multilogin.activities.GoogleLoginActivity;
import com.example.rvlopez.multilogin.activities.TwitterLoginActivity;

public class Navigator {

    private static Navigator instance;

    public static Navigator getInstance() {
        if (instance == null) {
            instance = new Navigator();
        }
        return instance;
    }

    public void navigateToEmailLoginActivity(Context context, ImageView imageView) {
        if (context != null) {
            Intent intent = EmailLoginActivity.getCallingIntent(context);
            /* Shared Element Activity Transition */
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat
                    .makeSceneTransitionAnimation((Activity) context, imageView, "option_icon");
            context.startActivity(intent, optionsCompat.toBundle());
        }
    }

    public void navigateToGoogleLoginActivity(Context context, ImageView imageView) {
        if (context != null) {
            Intent intent = GoogleLoginActivity.getCallingIntent(context);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat
                    .makeSceneTransitionAnimation((Activity) context, imageView, "option_icon");
            context.startActivity(intent, optionsCompat.toBundle());
        }
    }

    public void navigateToFacebookLoginActivity(Context context, ImageView imageView) {
        if (context != null) {
            Intent intent = FacebookLoginActivity.getCallingIntent(context);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat
                    .makeSceneTransitionAnimation((Activity) context, imageView, "option_icon");
            context.startActivity(intent, optionsCompat.toBundle());
        }
    }

    public void navigateToTwitterLoginActivity(Context context, ImageView imageView) {
        if (context != null) {
            Intent intent = TwitterLoginActivity.getCallingIntent(context);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat
                    .makeSceneTransitionAnimation((Activity) context, imageView, "option_icon");
            context.startActivity(intent, optionsCompat.toBundle());
        }
    }
}
