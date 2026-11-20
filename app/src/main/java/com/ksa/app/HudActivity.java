package com.abc.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HudActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true); // JS enable kiya
        webView.setWebViewClient(new WebViewClient());
        setContentView(webView);
        
        // HTML file load karo
        webView.loadUrl("file:///android_asset/hud.html"); 
    }
}
