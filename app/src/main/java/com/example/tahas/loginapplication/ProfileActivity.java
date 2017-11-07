package com.example.tahas.loginapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by tahas on 11/7/2017.
 */

public class ProfileActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);


    textView = (TextView) findViewById(R.id.textView2);


        Bundle extras = getIntent().getExtras();
        if(extras!=null)
        {
            textView.setText("Welcome  "+extras.getString("editText"));
        }

    }
}
