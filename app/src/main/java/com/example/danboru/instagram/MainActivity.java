package com.example.danboru.instagram;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.FragmentManager;
import android.graphics.Paint;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    LinearLayout awalnya, akhirnya;
    TextView ketentuan, kebijakan, bahasanya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        ketentuan = (TextView) findViewById(R.id.ketentuannya);
        kebijakan = (TextView) findViewById(R.id.kebijakannya);
        bahasanya = (TextView) findViewById(R.id.bahasanya);


        ketentuan.setPaintFlags(ketentuan.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        kebijakan.setPaintFlags(ketentuan.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        animation();


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
    public void masukLewatFacebook(View v){


        Toast.makeText(MainActivity.this, "Anda masuk dengan Facebook", Toast.LENGTH_SHORT).show();

    }

    public void buatAkun(View v){

        Toast.makeText(MainActivity.this, "Kamu buat akun", Toast.LENGTH_SHORT).show();

    }

    public void masukLangsung(View v){

        Toast.makeText(MainActivity.this, "Masuk Instagram", Toast.LENGTH_SHORT).show();

    }

    public void ketentuan(View v){

        Toast.makeText(MainActivity.this, "Anda Membuka Ketentuan", Toast.LENGTH_SHORT).show();
    }

    public void kebijakan(View v){

        Toast.makeText(MainActivity.this, "Anda Membuka Kebijakan", Toast.LENGTH_SHORT).show();

    }

    public void pilihbahasanya(View v){

        Toast.makeText(MainActivity.this, "Pemilihan bahasa", Toast.LENGTH_SHORT).show();

    }



}
