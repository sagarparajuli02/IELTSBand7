package com.ielts.reading.listening.writing.speaking;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

public class Videos extends AppCompatActivity {

    private static final String HI = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&maxResults=25&playlistId=UUglDIsg_Z9mE2oT9hsrbzFA&key=AIzaSyAhBTxMTNqY_sHQMAy4Y4vOF6-zlaThLlI";
    private RecyclerView rv;
    private List<List_Data>list_data;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        setTitle("Videos");
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);;
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        rv=(RecyclerView)findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        list_data=new ArrayList<>();
        adapter=new MyAdapter(list_data,this);

        getData();

    }

    private void getData() {
        StringRequest stringRequest=new StringRequest(Request.Method.GET, HI, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject=new JSONObject(response);
                    JSONArray  array=jsonObject.getJSONArray("items");
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}