package com.example.cisc.leea3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String mesa_URL;
    private String mozilla_URL;
    private Button mesa_button;
    private Button mozilla_button;
    private Button jquery_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mesa_URL = "http://www.sdmesa.edu/";
        mozilla_URL = "https://developer.mozilla.org/en-US/docs/Web/JavaScript";
        mesa_button = (Button) findViewById(R.id.mesa_button);
        mesa_button.setOnClickListener(this);
        jquery_button = (Button) findViewById(R.id.jquery_button);
        jquery_button.setOnClickListener(this);
        mozilla_button = (Button) findViewById(R.id.mozilla_button);
        mozilla_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mesa_button:
                Intent mesa;
                mesa = new Intent(this, mesaWebActivity.class);
                startActivity(mesa);
                break;
            case R.id.mozilla_button:
                Intent moz;
                moz = new Intent(this, mozWebActivity.class);
                startActivity(moz);
                break;
            case R.id.jquery_button:
                Intent jq;
                jq = new Intent(this, jqueryWebActivity.class);
                startActivity(jq);
                break;


        }
    }
}
