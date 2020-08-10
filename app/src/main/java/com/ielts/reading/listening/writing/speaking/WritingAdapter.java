package com.ielts.reading.listening.writing.speaking;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WritingAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public WritingAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs  
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TaskOneFragment homeFragment = new TaskOneFragment();
                return homeFragment;
            case 1:
                TaskTwoFragment sportFragment = new TaskTwoFragment();
                return sportFragment;

            default:
                return null;
        }
    }
    // this counts total number of tabs  
    @Override
    public int getCount() {
        return totalTabs;
    }
}