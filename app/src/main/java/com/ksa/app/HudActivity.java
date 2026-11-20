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
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        setContentView(webView);
        
        // HTML code direct yahan daal diya hai
        String htmlData = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <style>\n" +
                "        body { margin: 0; padding: 0; background-color: #222; color: white; font-family: sans-serif; display: flex; justify-content: center; align-items: center; height: 100vh; }\n" +
                "        h1 { color: #00FF00; }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>ABC Game Working!</h1>\n" +
                "</body>\n" +
                "</html>";
        
        webView.loadDataWithBaseURL(null, htmlData, "text/html", "UTF-8", null);
    }
}
