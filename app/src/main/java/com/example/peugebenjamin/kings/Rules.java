package com.example.peugebenjamin.kings;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        WebViewClient webViewClient = new WebViewClient();
        //retrieve webview from activity
        WebView rules = (WebView) findViewById(R.id.webView);
        rules.setWebViewClient(new WebViewClient());
        rules.loadUrl("http://mobileiron.com");


    }

}
