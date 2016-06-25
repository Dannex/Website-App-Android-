package com.dannextech.website;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Dannex Daniels on 6/6/2016.
 */
public class MoWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("www.dannextech.com")){
            return false;
        }

        Intent in = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        view.getContext().startActivity(in);

        return true;
    }
}
