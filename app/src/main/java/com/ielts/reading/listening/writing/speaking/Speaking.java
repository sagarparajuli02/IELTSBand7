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
        getterSetterList.add(new GetterSetter("Describe a café you like or dislike","file:///android_asset/SpeakingSample/Describe a café you like or dislike.html"));
        getterSetterList.add(new GetterSetter("Describe a change in your life","file:///android_asset/SpeakingSample/Describe a change in your life.html"));
        getterSetterList.add(new GetterSetter("Describe a city or town you have been to","file:///android_asset/SpeakingSample/Describe a city or town you have been to.html"));
        getterSetterList.add(new GetterSetter("Describe a decision that you disagreed with","file:///android_asset/SpeakingSample/Describe a decision that you disagreed with.html"));
        getterSetterList.add(new GetterSetter("Describe a dinner you enjoyed with your friends","file:///android_asset/SpeakingSample/Describe a dinner you enjoyed with your friends.html"));
        getterSetterList.add(new GetterSetter("Describe a family member that made you proud","file:///android_asset/SpeakingSample/Describe a family member that made you proud.html"));
        getterSetterList.add(new GetterSetter("Describe a family member who has had an important influence on you","file:///android_asset/SpeakingSample/Describe a family member who has had an important influence on you.html"));
        getterSetterList.add(new GetterSetter("Describe a famous person that you are interested in","file:///android_asset/SpeakingSample/Describe a famous person that you are interested in.html"));
        getterSetterList.add(new GetterSetter("Describe a foreign food you would like to try","file:///android_asset/SpeakingSample/Describe a foreign food you would like to try.html"));
        getterSetterList.add(new GetterSetter("Describe a happy family event that you remember well","file:///android_asset/SpeakingSample/Describe a happy family event that you remember well.html"));
        getterSetterList.add(new GetterSetter("Describe a holiday or vacation you have been on","file:///android_asset/SpeakingSample/Describe a holiday or vacation you have been on.html"));
        getterSetterList.add(new GetterSetter("Describe a lesson that you enjoyed","file:///android_asset/SpeakingSample/Describe a lesson that you enjoyed.html"));
        getterSetterList.add(new GetterSetter("Describe a lesson that you enjoyed","file:///android_asset/SpeakingSample/Describe a lesson that you enjoyed.html"));
        getterSetterList.add(new GetterSetter("Describe a long journey you travelled by ca","file:///android_asset/SpeakingSample/Describe a long journey you travelled by car.html"));
        getterSetterList.add(new GetterSetter("Describe a newly-opened shop","file:///android_asset/SpeakingSample/Describe a newly-opened shop.html"));
        getterSetterList.add(new GetterSetter("Describe a person who has apologized to you","file:///android_asset/SpeakingSample/Describe a person who has apologized to you.html"));
        getterSetterList.add(new GetterSetter("Describe a piece of artwork that you have seen before","file:///android_asset/SpeakingSample/Describe a piece of artwork that you have seen before.html"));
        getterSetterList.add(new GetterSetter("Describe a piece of good news you heard","file:///android_asset/SpeakingSample/Describe a piece of good news you heard"));
        getterSetterList.add(new GetterSetter("Describe a place you visited","file:///android_asset/SpeakingSample/Describe a place you visited.html"));
        getterSetterList.add(new GetterSetter("Describe a popular place","file:///android_asset/SpeakingSample/Describe a popular place.html"));
        getterSetterList.add(new GetterSetter("Describe a recent happy event","file:///android_asset/SpeakingSample/Describe a recent happy event.html"));
        getterSetterList.add(new GetterSetter("Describe a service from a company or shop","file:///android_asset/SpeakingSample/Describe a service from a company or shop.html"));
        getterSetterList.add(new GetterSetter("Describe a short trip that was special to you","file:///android_asset/SpeakingSample/Describe a short trip that was special to you.html"));
        getterSetterList.add(new GetterSetter("Describe a street you know well","file:///android_asset/SpeakingSample/Describe a street you know well.html"));
        getterSetterList.add(new GetterSetter("Describe a time when you had to work hard to achieve a goal","file:///android_asset/SpeakingSample/Describe a time when you had to work hard to achieve a goal.html"));
        getterSetterList.add(new GetterSetter("Describe a time when you saw an interesting animal","file:///android_asset/SpeakingSample/Describe a time when you saw an interesting animal.html"));
        getterSetterList.add(new GetterSetter("Describe a time when you worked in a team","file:///android_asset/SpeakingSample/Describe a time when you worked in a team.html"));
        getterSetterList.add(new GetterSetter("Describe a trip you took by bike","file:///android_asset/SpeakingSample/Describe a trip you took by bike.html"));
        getterSetterList.add(new GetterSetter("Describe a TV program you enjoy","file:///android_asset/SpeakingSample/Describe a TV program you enjoy.html"));
        getterSetterList.add(new GetterSetter("Describe a TV series you enjoy watching","file:///android_asset/SpeakingSample/Describe a TV series you enjoy watching.html"));
        getterSetterList.add(new GetterSetter("Describe a type of weather you like","file:///android_asset/SpeakingSample/Describe a type of weather you like.html"));
        getterSetterList.add(new GetterSetter("Describe a useful website that you often visit","file:///android_asset/SpeakingSample/Describe a useful website that you often visit.html"));
        getterSetterList.add(new GetterSetter("Describe an enjoyable experience you had in the countryside","file:///android_asset/SpeakingSample/Describe an enjoyable experience you had in the countryside.html"));
        getterSetterList.add(new GetterSetter("Describe an environment law","file:///android_asset/SpeakingSample/Describe an environment law.html"));
        getterSetterList.add(new GetterSetter("Describe an experience when you spent time with a child","file:///android_asset/SpeakingSample/Describe an experience when you spent time with a child.html"));
        getterSetterList.add(new GetterSetter("Describe an important plant in your country","file:///android_asset/SpeakingSample/Describe an important plant in your country.html"));
        getterSetterList.add(new GetterSetter("Describe an interesting advertisement","file:///android_asset/SpeakingSample/Describe an interesting advertisement.html"));
        getterSetterList.add(new GetterSetter("Describe an interesting conversation you had with someone","file:///android_asset/SpeakingSample/Describe an interesting conversation you had with someone.html"));
        getterSetterList.add(new GetterSetter("Describe an interesting neighbour you know","file:///android_asset/SpeakingSample/Describe an interesting neighbour you know.html"));
        getterSetterList.add(new GetterSetter("Describe an interesting talk or speech you heard","file:///android_asset/SpeakingSample/Describe an interesting talk or speech you heard.html"));
        getterSetterList.add(new GetterSetter("Describe one of your best friends","file:///android_asset/SpeakingSample/Describe one of your best friends.html"));
        getterSetterList.add(new GetterSetter("Describe someone you admire who is much older than you","file:///android_asset/SpeakingSample/Describe someone you admire who is much older than you.html"));
        getterSetterList.add(new GetterSetter("Describe two people from the same family","file:///android_asset/SpeakingSample/Describe two people from the same family.html"));
        getterSetterList.add(new GetterSetter("Describe your favourite piece of clothing","file:///android_asset/SpeakingSample/Describe your favourite piece of clothing.html"));


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