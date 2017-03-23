package com.example.cisc.leea3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mozWebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moz_web);

        WebView mozillaWebView = (WebView) findViewById(R.id.mozWebView);
        mozillaWebView.setWebViewClient(new WebViewClient());
        mozillaWebView.loadUrl("https://developer.mozilla.org/en-US/docs/Web/JavaScript");
    }
}
