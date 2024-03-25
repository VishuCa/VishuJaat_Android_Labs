package com.example.vishujaatsandroidlabs;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView flagImageView;
    private Switch switch1; // Corrected variable name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flagImageView = findViewById(R.id.flagImageView);
        switch1 = findViewById(R.id.switch1); // Corrected ID

        switch1.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(5000);
                rotate.setRepeatCount(Animation.INFINITE);
                rotate.setInterpolator(new LinearInterpolator());
                flagImageView.startAnimation(rotate);
            } else {
                flagImageView.clearAnimation();
            }
        });
    }
}
