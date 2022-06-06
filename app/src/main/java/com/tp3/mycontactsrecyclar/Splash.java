package com.tp3.mycontactsrecyclar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class Splash extends AppCompatActivity {
    //variable
    ImageView logo,bk;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logo = findViewById(R.id.imageView);
        bk = findViewById(R.id.image);
        lottieAnimationView = findViewById(R.id.lottie_layer_name);

        logo.animate().translationY(-1400).setDuration(2000).setStartDelay(5000);
        bk.animate().translationY(-1600).setDuration(2000).setStartDelay(5000);
        lottieAnimationView.animate().translationY(1600).setDuration(2000).setStartDelay(5000);


        new Handler().postDelayed(new Runnable() {  // apres la 5 s switcher vers l activity suivante
            @Override
            public void run() {
                Intent i=new Intent(Splash.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },5000); //time out for the splash
    }
}