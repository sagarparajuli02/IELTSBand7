package com.ielts.reading.listening.writing.speaking;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    private static final String HI = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&maxResults=25&playlistId=UUglDIsg_Z9mE2oT9hsrbzFA&key=AIzaSyAhBTxMTNqY_sHQMAy4Y4vOF6-zlaThLlI";

    RecyclerView videoRecyclerView;
    RecyclerView recyclerView;

    private List<List_Data> list_data;
    private SmallVideoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ReadRss readRss = new ReadRss(this, recyclerView);
        readRss.execute();

        videoRecyclerView=findViewById(R.id.videoRecyclerView);
        list_data=new ArrayList<>();
        adapter=new SmallVideoAdapter(list_data,this);
        videoRecyclerView.setHasFixedSize(true);
        videoRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        videoRecyclerView.setAdapter(adapter);
        getData();



        Button writingButton=(Button)findViewById(R.id.writing);
        Button readingButton=(Button)findViewById(R.id.reading);
        Button listeningButton=(Button)findViewById(R.id.listening);
        Button speakingButton=(Button)findViewById(R.id.speaking);
        Button tipsButton=(Button)findViewById(R.id.proTips);
        Button faqButton=(Button)findViewById(R.id.faq);
        TextView videosButton=(TextView) findViewById(R.id.moreVideos);
        Button rateApp =(Button) findViewById(R.id.updateApp) ;


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
                        JSONObject resourceId = snippets.getJSONObject("resourceId");
                        String videoId= resourceId.getString("videoId");


                        List_Data ld=new List_Data(title,imageurl,videoId);
                        list_data.add(ld);
                    }
                    videoRecyclerView.setAdapter(adapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "Error ocurs", Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
