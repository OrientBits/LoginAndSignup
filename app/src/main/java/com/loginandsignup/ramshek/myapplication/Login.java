package com.loginandsignup.ramshek.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.wang.avi.AVLoadingIndicatorView;


public class Login extends AppCompatActivity {
    TextView login;
    ImageView googleBtn,facebookBtn;

    AVLoadingIndicatorView login_loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_loader = findViewById(R.id.login_loader);
        login = findViewById(R.id.sign_in_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login.setBackgroundResource(R.drawable.button_background);
                login_loader.setVisibility(View.VISIBLE);
                login_loader.show();
            }
        });


        googleBtn = findViewById(R.id.google_sign_btn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login_loader.hide();
                googleBtn.setBackgroundResource(R.drawable.button_background);
                login_loader.setVisibility(View.VISIBLE);
                login_loader.show();
            }
        });


        facebookBtn = findViewById(R.id.facebook_signin_btn);
        facebookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login_loader.hide();
                facebookBtn.setBackgroundResource(R.drawable.button_background);
                login_loader.setVisibility(View.VISIBLE);
                login_loader.show();
            }
        });




    }

    public void openSignupPage(View view) {
        startActivity(new Intent(this,Register.class));
    }


    public void openLoginPage(View view) {

    }


}

