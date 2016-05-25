package com.example.danboru.instagram;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class FacebookLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_facebook_login);
    }


    public void masuk_ke_facebook(View view){

        Toast.makeText(FacebookLogin.this, "Sekarang Kamu Masuk Facebook", Toast.LENGTH_SHORT).show();

    }

    public void lupasandi(View v){

        Toast.makeText(FacebookLogin.this, "Kenapa Kamu Lupa ?", Toast.LENGTH_SHORT).show();

    }

    public void bantuanmasuk(View tampil){

        Toast.makeText(FacebookLogin.this, "Kamu Butuh bantuan", Toast.LENGTH_SHORT).show();

    }

    public void buatakun(View v){

        Toast.makeText(FacebookLogin.this, "Kamu Butuh aku baru ?", Toast.LENGTH_SHORT).show();

    }


}
