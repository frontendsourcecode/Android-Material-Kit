package com.frontend.source.materialkit.activity.verification;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.frontend.source.materialkit.R;
import com.frontend.source.materialkit.utils.Tools;

public class VerificationPhone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_phone);
        Tools.setSystemBarColor(this, R.color.grey_20);
    }
}
