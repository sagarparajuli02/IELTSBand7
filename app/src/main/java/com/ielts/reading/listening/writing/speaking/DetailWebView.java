package com.ielts.reading.listening.writing.speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class DetailWebView extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_web_view);

    String title=getIntent().getStringExtra("title");
    setTitle(title);
        if(getSupportActionBar()!=null){
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);;
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                }

                String mainUrl = getIntent().getStringExtra("localUrl");

                webView = (WebView)findViewById(R.id.WebView);

                WebSettings webSetting = webView.getSettings();
                webSetting.setBuiltInZoomControls(true);
                webSetting.setJavaScriptEnabled(true);

                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(mainUrl);



        }

private class WebViewClient extends android.webkit.WebViewClient
{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url)
    {
        return super.shouldOverrideUrlLoading(view, url);
    }
}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
