package com.snape.shivichu.simplebarcodescanner;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by Shivichu on 1/26/2017.
 */

public class SplashScreen extends AppCompatActivity {

    TextView tTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //making full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //setting layout to Splash Screen
        setContentView(R.layout.activity_splash);

        tTitle = (TextView) findViewById(R.id.txt_splash_title);
        Typeface tf = Typeface.createFromAsset(this.getAssets(), "Lobster-Regular.ttf");
        tTitle.setTypeface(tf);

        int SPLASH_TIME_OUT = 3000;
        new Handler().postDelayed(new Runnable() {
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
            */
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_out, R.anim.slide_in);
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}