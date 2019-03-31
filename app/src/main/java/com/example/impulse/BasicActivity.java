package com.example.impulse;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebViewClient;
import android.webkit.WebView;

public class BasicActivity extends AppCompatActivity {


    WebView browser;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        browser=(WebView)findViewById(R.id.browser);
                browser.loadUrl("https://www.facebook.com/bitimpulse2k19/?eid=ARAluFe7NH62CmBqCLPp8CCbHVpk6edKScA4ah2TdFegbeIdtVq--djw7fHutmrN66r-eVXVP52tbO6k");
                // browser.loadUrl(url.getText().toString());
                browser.getSettings().setJavaScriptEnabled(true);
                browser.setWebViewClient(new WebViewClient());
            }

    }