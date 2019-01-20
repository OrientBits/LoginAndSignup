package com.loginandsignup.ramshek.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void openLoginPage(View view) {
        startActivity(new Intent(this,Login.class));
    }

    public void openSignupPage(View view) {
        startActivity(new Intent(this,Register.class));
    }
}
