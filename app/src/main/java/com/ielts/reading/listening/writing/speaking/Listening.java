package com.ielts.reading.listening.writing.speaking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Listening extends AppCompatActivity {

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RecyclerView recyclerView;

        setContentView(R.layout.activity_listening);
        setTitle("Listening Topics");
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);;
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        recyclerView = (RecyclerView) findViewById(R.id.recycleViewContainer);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        getterSetterList = new ArrayList<>();

        //Adding Data into ArrayList
        getterSetterList.add(new GetterSetter("Sample 1","file:///android_asset/listening/Sample1.html"));
        getterSetterList.add(new GetterSetter("Sample 2","file:///android_asset/listening/Sample2.html"));
        getterSetterList.add(new GetterSetter("Sample 3","file:///android_asset/listening/Sample3.html"));
        getterSetterList.add(new GetterSetter("Sample 4","file:///android_asset/listening/Sample4.html"));
        getterSetterList.add(new GetterSetter("Sample 5","file:///android_asset/listening/Sample5.html"));
        getterSetterList.add(new GetterSetter("Sample 6","file:///android_asset/listening/Sample6.html"));
        getterSetterList.add(new GetterSetter("Sample 7","file:///android_asset/listening/Sample7.html"));
        getterSetterList.add(new GetterSetter("Sample 8","file:///android_asset/listening/Sample8.html"));
        getterSetterList.add(new GetterSetter("Sample 9","file:///android_asset/listening/Sample9.html"));
        getterSetterList.add(new GetterSetter("Sample 10","file:///android_asset/listening/Sample10.html"));
        getterSetterList.add(new GetterSetter("Sample 11","file:///android_asset/listening/Sample11.html"));
        getterSetterList.add(new GetterSetter("Sample 12","file:///android_asset/listening/Sample12.html"));
        getterSetterList.add(new GetterSetter("Sample 13","file:///android_asset/listening/Sample13.html"));
        getterSetterList.add(new GetterSetter("Sample 14","file:///android_asset/listening/Sample14.html"));
        getterSetterList.add(new GetterSetter("Sample 15","file:///android_asset/listening/Sample15.html"));


        mAdapter = new WebViewAdapter(this, getterSetterList);

        recyclerView.setAdapter(mAdapter);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}