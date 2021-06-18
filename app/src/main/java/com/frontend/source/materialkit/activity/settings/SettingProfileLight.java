package com.frontend.source.materialkit.activity.settings;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.frontend.source.materialkit.R;
import com.frontend.source.materialkit.utils.Tools;

public class SettingProfileLight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_profile_light);
        Tools.setSystemBarColor(this, android.R.color.white);
        Tools.setSystemBarLight(this);
    }
}
