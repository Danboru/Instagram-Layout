package com.example.danboru.instagram;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ImageView mImageGrey,mImageOrange;
    LinearLayout awalnya, akhirnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        animation();
        masukLewatFacebook();
    }

    public void animation(){

       awalnya = (LinearLayout) findViewById(R.id.awal);
       akhirnya = (LinearLayout) findViewById(R.id.akhir);

        ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                akhirnya.setAlpha((Float) animation.getAnimatedValue());
            }
        });

        animator.setDuration(8000);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(-1);
        animator.start();

    }
    public void masukLewatFacebook(){


        Toast.makeText(MainActivity.this, "Anda masuk dengan Facebook", Toast.LENGTH_SHORT).show();

    }


}
