package com.example.rvlopez.multilogin.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rvlopez.multilogin.R;
import com.example.rvlopez.multilogin.adapters.LoginOptionsListAdapter;
import com.example.rvlopez.multilogin.helpers.DataHelper;
import com.example.rvlopez.multilogin.navigator.Navigator;
import com.example.rvlopez.multilogin.utils.Constants;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements LoginOptionsListAdapter.OnItemClickListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.toolbar_title)
    TextView toolbar_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
        initRecycler();
    }

    //TODO: Try to rebase initToolbar and override a different toolbars in a different activities
    private void initToolbar() {
        setSupportActionBar(toolbar);
    }

    private void initRecycler() {
        RecyclerView recyclerView  = (RecyclerView) findViewById(R.id.my_recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(layoutManager);

        LoginOptionsListAdapter loginOptionsListAdapter = new LoginOptionsListAdapter(this, DataHelper.getLoginOptionsList());
        loginOptionsListAdapter.setOnItemClickListener(this);
        recyclerView.setAdapter(loginOptionsListAdapter);
    }

    @Override
    public void onOptionItemClicked(String option, ImageView imageView) {
        Navigator navigator = Navigator.getInstance();
        switch (option) {
            case Constants.EMAIL_TITLE:
                navigator.navigateToEmailLoginActivity(this, imageView);
                break;
            case Constants.GOOGLE_TITLE:
                navigator.navigateToGoogleLoginActivity(this, imageView);
                break;
            case Constants.FACEBOOK_TITLE:
                navigator.navigateToFacebookLoginActivity(this, imageView);
                break;
            case Constants.TWITTER_TITLE:
                navigator.navigateToTwitterLoginActivity(this, imageView);
                break;
            case Constants.FINGERPRINT_TITLE:
                //TODO: Fingerprint implementation
                Toast.makeText(this, "Coming soon!", Toast.LENGTH_SHORT).show();
        }
    }
}
