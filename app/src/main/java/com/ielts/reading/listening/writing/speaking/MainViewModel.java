package com.ielts.reading.listening.writing.speaking;


import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.prof.rssparser.Article;
import com.prof.rssparser.Channel;
import com.prof.rssparser.OnTaskCompleted;
import com.prof.rssparser.Parser;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Channel> articleListLive = null;
    private String urlString = "https://www.androidauthority.com/feed";

    private MutableLiveData<String> snackbar = new MutableLiveData<>();

    public MutableLiveData<Channel> getChannel() {
        if (articleListLive == null) {
            articleListLive = new MutableLiveData<>();
        }
        return articleListLive;
    }

    private void setChannel(Channel channel) {
        this.articleListLive.postValue(channel);
    }


    public void fetchFeed() {
        Log.i(TAG, "lado" );

        Parser parser = new Parser.Builder()
                // If you want to provide a custom charset (the default is utf-8):
                // .charset(Charset.forName("ISO-8859-7"))
                // .cacheExpirationMillis() and .context() not called because on Java side, caching is NOT supported
                .build();

        parser.onFinish(new OnTaskCompleted() {

            //what to do when the parsing is done
            @Override
            public void onTaskCompleted(@NonNull Channel channel) {
                setChannel(channel);

            }

            //what to do in case of error
            @Override
            public void onError(@NonNull Exception e) {
                Log.i(TAG, "error" );

                setChannel(new Channel(null, null, null, null, null, null, new ArrayList<Article>()));
                e.printStackTrace();
            }
        });
        parser.execute(urlString);
    }
}