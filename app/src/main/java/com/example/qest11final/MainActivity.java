package com.example.qest11final;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    EditText edt;
    Button btn;
    String stringUrl = "https://www.walla.co.il/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv = (WebView) findViewById(R.id.webView);
        edt = (EditText) findViewById(R.id.EditText);
        btn = (Button) findViewById(R.id.Button);

        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());

        wv.loadUrl(stringUrl);
    }

    public void go(View view) {
        stringUrl = edt.getText().toString();
        wv.loadUrl(stringUrl);
    }
    private class MyWebViewClient extends WebViewClient {



        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);

            return true;
        }
    }
}