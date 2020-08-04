package com.ielts.reading.listening.writing.speaking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Speaking extends AppCompatActivity {

    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<GetterSetter> getterSetterList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RecyclerView recyclerView;

        setContentView(R.layout.activity_speaking);
        setTitle("Speaking Topics");
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
        getterSetterList.add(new GetterSetter("lsasa","file:///android_asset/reading/read80.html"));
        getterSetterList.add(new GetterSetter("Intoduction","file:///android_asset/reading/read80.html"));
        getterSetterList.add(new GetterSetter("Intoduction","file:///android_asset/reading/read80.html"));
        getterSetterList.add(new GetterSetter("Intoduction","file:///android_asset/reading/read80.html"));
        getterSetterList.add(new GetterSetter("Intoduction","file:///android_asset/reading/read80.html"));
        getterSetterList.add(new GetterSetter("nvbv","file:///android_asset/reading/read80.html"));
        getterSetterList.add(new GetterSetter("Valiables","file:///android_asset/javascript/variables.html"));
        getterSetterList.add(new GetterSetter("Operators","file:///android_asset/javascript/operator.html"));
        getterSetterList.add(new GetterSetter("If..Else","file:///android_asset/javascript/ifelse.html"));
        getterSetterList.add(new GetterSetter("Switch Case","file:///android_asset/javascript/switch.html"));
        getterSetterList.add(new GetterSetter("While  Loop","file:///android_asset/javascript/while.html"));
        getterSetterList.add(new GetterSetter("For Loop","file:///android_asset/javascript/for.html"));
        getterSetterList.add(new GetterSetter("Loop Control","file:///android_asset/javascript/loopcontrol.html"));
        getterSetterList.add(new GetterSetter("Functions","file:///android_asset/javascript/function.html"));
        getterSetterList.add(new GetterSetter("Events","file:///android_asset/javascript/events.html"));
        getterSetterList.add(new GetterSetter("Cookies","file:///android_asset/javascript/cookies.html"));
        getterSetterList.add(new GetterSetter("Html DOM","file:///android_asset/javascript/htmldom.html"));
        getterSetterList.add(new GetterSetter("Error Handling","file:///android_asset/javascript/errorhandeling.html"));
        getterSetterList.add(new GetterSetter("Animation","file:///android_asset/javascript/lanimatuons.html"));
        getterSetterList.add(new GetterSetter("Browser","file:///android_asset/javascript/browser.html"));


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