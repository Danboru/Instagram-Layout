package com.example.danboru.instagram;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button tombolMulainya;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombolMulainya = (Button) findViewById(R.id.tombolMulai);
        gambar = (ImageView) findViewById(R.id.gambarnya);


        tombolMulainya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startColorAnimation(gambar);

            }
        });

    }

    private void startColorAnimation(View v){

        int colorStart = v.getSolidColor();
        int colorEnd = 0xffff0000;

        ValueAnimator coloranimator = ObjectAnimator.ofInt(v, "Background Color", colorStart, colorEnd );
        coloranimator.setDuration(2000);
        coloranimator.setEvaluator(new ArgbEvaluator());
        coloranimator.setRepeatCount(1);
        coloranimator.setRepeatMode(ValueAnimator.REVERSE);
        coloranimator.start();

    }



}
