package com.loginandsignup.ramshek.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.wang.avi.AVLoadingIndicatorView;

public class Register extends AppCompatActivity {


    AVLoadingIndicatorView register_loader;
    TextView registerBtn;
    FrameLayout blur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        blur = findViewById(R.id.background_blur_register);
        register_loader = findViewById(R.id.register_loader);



        registerBtn = findViewById(R.id.register_btn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blur.setBackgroundResource(R.drawable.button_background);
                register_loader.setVisibility(View.VISIBLE);
                register_loader.show();
            }
        });


    }

    public void openLoginPage(View view) {
        startActivity(new Intent(this,Login.class));
    }
}
