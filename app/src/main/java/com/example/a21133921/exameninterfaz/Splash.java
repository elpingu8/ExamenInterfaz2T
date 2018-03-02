package com.example.a21133921.exameninterfaz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders;

public class Splash extends AppCompatActivity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        CircularFillableLoaders imagen=(CircularFillableLoaders)findViewById(R.id.circularFillableLoaders);
        TextView titulo = (TextView) findViewById(R.id.splashTV);

        Animation animaImagen = AnimationUtils.loadAnimation(this, R.anim.up);
        imagen.startAnimation(animaImagen);


    }

    @Override
    public void onAnimationStart(Animation animation) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
