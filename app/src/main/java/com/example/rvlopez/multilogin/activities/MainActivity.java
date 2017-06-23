package com.example.rvlopez.multilogin.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.rvlopez.multilogin.R;
import com.example.rvlopez.multilogin.adapters.LoginOptionsListAdapter;
import com.example.rvlopez.multilogin.helpers.DataHelper;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

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

    private void initToolbar() {
        setSupportActionBar(toolbar);
    }

    private void initRecycler() {
        RecyclerView recyclerView  = (RecyclerView) findViewById(R.id.my_recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(layoutManager);

        LoginOptionsListAdapter loginOptionsListAdapter = new LoginOptionsListAdapter(this, DataHelper.getLoginOptionsList());
        recyclerView.setAdapter(loginOptionsListAdapter);
    }
}
