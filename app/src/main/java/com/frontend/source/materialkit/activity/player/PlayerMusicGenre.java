package com.frontend.source.materialkit.activity.player;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.frontend.source.materialkit.R;
import com.frontend.source.materialkit.utils.Tools;

public class PlayerMusicGenre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_music_genre);
        Tools.setSystemBarColor(this, R.color.indigo_600);
    }

    public void genreClick(View view) {
        if (view instanceof Button) {
            Button b = (Button) view;
            b.setSelected(!b.isSelected());
        }
    }
}
