package com.ielts.reading.listening.writing.speaking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Reading extends AppCompatActivity {

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RecyclerView recyclerView;

        setContentView(R.layout.activity_reading);
        setTitle("Reading Topics");
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
        getterSetterList.add(new GetterSetter("Reading Topic 1","file:///android_asset/reading/read80.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 2","file:///android_asset/reading/read81.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 3","file:///android_asset/reading/read82.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 4","file:///android_asset/reading/read83.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 5","file:///android_asset/reading/read84.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 6","file:///android_asset/reading/read85.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 7","file:///android_asset/reading/read86.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 8","file:///android_asset/reading/read87.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 9","file:///android_asset/reading/read88.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 10","file:///android_asset/reading/read89.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 11","file:///android_asset/reading/read90.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 12","file:///android_asset/reading/read91.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 13","file:///android_asset/reading/read92.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 14","file:///android_asset/reading/read93.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 15","file:///android_asset/reading/read94.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 16","file:///android_asset/reading/read95.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 17","file:///android_asset/reading/read96.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 18","file:///android_asset/reading/read97.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 19","file:///android_asset/reading/read98.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 20","file:///android_asset/reading/read99.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 21","file:///android_asset/reading/read101.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 22","file:///android_asset/reading/read102.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 23","file:///android_asset/reading/read103.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 24","file:///android_asset/reading/read104.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 25","file:///android_asset/reading/read105.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 26","file:///android_asset/reading/read106.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 27","file:///android_asset/reading/read107.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 28","file:///android_asset/reading/read108.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 29","file:///android_asset/reading/read109.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 30","file:///android_asset/reading/read110.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 31","file:///android_asset/reading/read111.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 32","file:///android_asset/reading/read112.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 33","file:///android_asset/reading/read113.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 34","file:///android_asset/reading/read114.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 35","file:///android_asset/reading/read115.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 36","file:///android_asset/reading/read116.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 37","file:///android_asset/reading/read117.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 38","file:///android_asset/reading/read128.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 39","file:///android_asset/reading/read119.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 40","file:///android_asset/reading/read120.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 41","file:///android_asset/reading/read121.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 42","file:///android_asset/reading/read122.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 43","file:///android_asset/reading/read123.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 44","file:///android_asset/reading/read124.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 45","file:///android_asset/reading/read125.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 46","file:///android_asset/reading/read126.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 47","file:///android_asset/reading/read127.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 48","file:///android_asset/reading/read128.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 49","file:///android_asset/reading/read129.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 50","file:///android_asset/reading/read130.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 51","file:///android_asset/reading/read131.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 52","file:///android_asset/reading/read132.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 53","file:///android_asset/reading/read133.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 54","file:///android_asset/reading/read134.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 55","file:///android_asset/reading/read135.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 56","file:///android_asset/reading/read136.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 57","file:///android_asset/reading/read137.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 58","file:///android_asset/reading/read138.html"));
        getterSetterList.add(new GetterSetter("Reading Topic 59","file:///android_asset/reading/read139.html"));







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