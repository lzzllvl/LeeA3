package com.example.cisc.leea3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class jqueryWebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jquery_web);

        WebView jqWebView = (WebView) findViewById(R.id.jqWebView);
        jqWebView.setWebViewClient(new WebViewClient());
        jqWebView.loadUrl("https://api.jquery.com");

    }
}
