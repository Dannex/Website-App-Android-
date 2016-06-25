package com.dannextech.website;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.webView);
        WebSettings settings = wv.getSettings();

        settings.setJavaScriptEnabled(true);

        wv.loadUrl("http://www.dannextech.com");

        wv.setWebViewClient(new MoWebViewClient());
    }


    @Override
    public void onBackPressed() {
        if(wv.canGoBack())
            wv.goBack();
        else
            super.onBackPressed();
    }
}
