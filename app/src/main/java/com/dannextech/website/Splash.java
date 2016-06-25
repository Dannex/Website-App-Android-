package com.dannextech.website;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent("com.dannextech.website.MAINACTIVITY");
                    startActivity(intent);
                }
            }
        };
        th.start();
    }

    @Override
    protected void onPause() {
        super.onPause();

        finish();
    }
}
