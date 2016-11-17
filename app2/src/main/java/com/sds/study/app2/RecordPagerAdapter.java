package com.sds.study.app2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 *
 */

public class RecordPagerAdapter extends FragmentStatePagerAdapter{

    Fragment []fragment=new Fragment[2];

    public RecordPagerAdapter(FragmentManager fm) {
        super(fm);
        fragment[0]=new ListFragment();
        fragment[1]=new DetailFragment();
    }

    @Override
    public Fragment getItem(int position) {
        return fragment[position];
    }

    @Override
    public int getCount() {
        return fragment.length;
    }
}
