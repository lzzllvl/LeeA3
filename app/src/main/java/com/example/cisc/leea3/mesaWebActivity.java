package com.example.cisc.leea3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class mesaWebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa_web);

        WebView mesaWebView = (WebView) findViewById(R.id.mesaWebView);
        mesaWebView.setWebViewClient(new WebViewClient());
        mesaWebView.loadUrl("http://www.sdmesa.edu/");

    }
}
