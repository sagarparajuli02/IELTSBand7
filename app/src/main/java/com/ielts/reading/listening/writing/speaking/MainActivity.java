package com.ielts.reading.listening.writing.speaking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String HI = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&maxResults=25&playlistId=UUglDIsg_Z9mE2oT9hsrbzFA&key=AIzaSyCFfSk_W8OzyxjSK6evcIqFOvH0VPg4vFc";
    private RecyclerView rv;
    RecyclerView recyclerView;
    private List<List_Data> list_data;
    private SmallVideoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=(RecyclerView)findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        list_data=new ArrayList<>();
        adapter=new SmallVideoAdapter(list_data,this);
        getData();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        //Call Read rss asyntask to fetch rss
        ReadRss readRss = new ReadRss(this, recyclerView);
        readRss.execute();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));



        Button writingButton=(Button)findViewById(R.id.writing);
        Button readingButton=(Button)findViewById(R.id.reading);
        Button listeningButton=(Button)findViewById(R.id.listening);
        Button speakingButton=(Button)findViewById(R.id.speaking);
        Button tipsButton=(Button)findViewById(R.id.proTips);
        Button faqButton=(Button)findViewById(R.id.faq);
        Button vocabularyButton=(Button)findViewById(R.id.vocabulary);
        TextView videosButton=(TextView) findViewById(R.id.moreVideos);


        writingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent writing = new Intent(MainActivity.this,Writing.class) ;
                startActivity(writing);
            }
        });

        readingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent readingButton = new Intent(MainActivity.this,Reading.class) ;
                startActivity(readingButton);
            }
        });
        listeningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listeningButton = new Intent(MainActivity.this,Listening.class) ;
                startActivity(listeningButton);
            }
        });
        speakingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent speakingButton = new Intent(MainActivity.this,Speaking.class) ;
                startActivity(speakingButton);
            }
        });
        faqButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent faqButton = new Intent(MainActivity.this,Faq.class) ;
                startActivity(faqButton);
            }
        });
        tipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tipsButton = new Intent(MainActivity.this,Tips.class) ;
                startActivity(tipsButton);
            }
        });
        vocabularyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vocabularyButton = new Intent(MainActivity.this,Vocabulary.class) ;
                startActivity(vocabularyButton);
            }
        });
        videosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videosButton = new Intent(MainActivity.this,Videos.class) ;
                startActivity(videosButton);
            }
        });

    }


    private void getData() {
        StringRequest stringRequest=new StringRequest(Request.Method.GET, HI, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject=new JSONObject(response);
                    JSONArray array=jsonObject.getJSONArray("items");
                    for (int i=0; i<array.length(); i++){
                        JSONObject ob=array.getJSONObject(i);
                        JSONObject snippets = ob.getJSONObject("snippet");
                        JSONObject defaulturl= snippets.getJSONObject("thumbnails");

                        JSONObject url = defaulturl.getJSONObject("medium");
                        String imageurl= url.getString("url");
                        String title= snippets.getString("title");




                        List_Data ld=new List_Data(title,imageurl);
                        list_data.add(ld);
                    }
                    rv.setAdapter(adapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
