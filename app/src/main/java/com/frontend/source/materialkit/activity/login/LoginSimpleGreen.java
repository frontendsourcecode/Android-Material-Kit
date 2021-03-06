package com.frontend.source.materialkit.activity.login;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.frontend.source.materialkit.R;
import com.frontend.source.materialkit.utils.Tools;
import com.google.android.material.snackbar.Snackbar;

public class LoginSimpleGreen extends AppCompatActivity {

    private View parent_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_simple_green);
        parent_view = findViewById(android.R.id.content);

        Tools.setSystemBarColor(this, android.R.color.white);
        Tools.setSystemBarLight(this);

        findViewById(R.id.sign_up_for_account).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(parent_view, "Sign up for an account", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
