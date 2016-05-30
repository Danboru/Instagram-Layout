package com.example.danboru.instagram;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

public class InstagramLogin extends Activity {

    LinearLayout awal, akhir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_instagram_login);

        awal = (LinearLayout) findViewById(R.id.awal);
        akhir  = (LinearLayout) findViewById(R.id.akhir);

        ValueAnimator animasi = ValueAnimator.ofFloat(0f, 1f);

        animasi.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {

                akhir.setAlpha((Float) animation.getAnimatedValue());

            }
        });

        animasi.setDuration(9000);
        animasi.setRepeatMode(ValueAnimator.REVERSE);
        animasi.setRepeatCount(-1);
        animasi.start();


    }

    public void masuk_ke_instagram(View v){

        Toast.makeText(InstagramLogin.this, "Kamu Masuk Instagram Sekarang", Toast.LENGTH_SHORT).show();

    }

    public void masukdenganfacebook(View view){

        Intent masksudnya = new Intent(InstagramLogin.this, FacebookLogin.class);
        startActivity(masksudnya);

    }

    public void pilihbahasanya(View v){

        Toast.makeText(InstagramLogin.this, "Kamu pilih bahasa", Toast.LENGTH_SHORT).show();

    }


    public void bantuanmasuk(View v){

        Toast.makeText(InstagramLogin.this, "Bantuan Masuk", Toast.LENGTH_SHORT).show();

    }

    public void masukLangsung(View v){

        Intent instagram = new Intent(InstagramLogin.this, MainActivity.class);
        startActivity(instagram);

    }

}
