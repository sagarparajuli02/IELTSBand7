package com.ielts.reading.listening.writing.speaking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class Faq extends AppCompatActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("What is IELTS?");
        listDataHeader.add("Which organisations accept IELTS?");
        listDataHeader.add("Who owns IELTS and who writes the test?");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("IELTS is the International English Language Testing System which tests English proficiency across the globe. Conducting one million tests globally, IELT");

        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("'IELTS is accepted by more than 6000 organisations worldwide. These include universities, ");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("'IELTS is jointly owned by British Council, IDP: IELTS Australia and the University of Cambridge ESOL Examinations (Cambridge ESOL). International teams of writers contribute to IELTS test materials. Ongoing research ensures that IELTS remains fair and unbiased. Test writers from different English-speaking countries develop IELTS content so it reflects real-life situations.' ");

        listDataChild.put(listDataHeader.get(0), top250);
        listDataChild.put(listDataHeader.get(1), nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }
}