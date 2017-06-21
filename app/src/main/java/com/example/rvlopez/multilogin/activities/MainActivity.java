package com.example.rvlopez.multilogin.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rvlopez.multilogin.R;
import com.example.rvlopez.multilogin.adapters.LoginOptionsListAdapter;
import com.example.rvlopez.multilogin.helpers.DataHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecycler();
    }

    private void initRecycler() {
        RecyclerView recyclerView  = (RecyclerView) findViewById(R.id.my_recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(layoutManager);

        LoginOptionsListAdapter loginOptionsListAdapter = new LoginOptionsListAdapter(DataHelper.getLoginOptionsList());
        recyclerView.setAdapter(loginOptionsListAdapter);
    }
}
