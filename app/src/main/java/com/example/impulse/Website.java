package com.example.impulse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Website extends AppCompatActivity {

    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        browser=(WebView)findViewById(R.id.browser);
        browser.loadUrl("https://rupsade.github.io/impulse-19/#events");
        // browser.loadUrl(url.getText().toString());
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setWebViewClient(new WebViewClient());

    }
}
