package com.ielts.reading.listening.writing.speaking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class DetailWebView extends AppCompatActivity {

    WebView webView;
    ProgressBar progressBar;
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
                progressBar=findViewById(R.id.progressBar);

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
    @Override
    public void onPageFinished(WebView view, String url) {
       progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        Toast.makeText(DetailWebView.this, "Error Occurred" , Toast.LENGTH_SHORT).show();

    }
}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
