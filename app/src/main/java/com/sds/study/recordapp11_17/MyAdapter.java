package com.sds.study.recordapp11_17;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * ViewPager는 껍데기에 불과하므로, 뷰페이저에 어떤페이지가 보여질지 프래그먼트가 총 몇개이고, 어떤
 * 페이지를 보여줘야 할지를 관리 해 주는 어댑터를 이용해야 한다...
 */

public class MyAdapter extends FragmentStatePagerAdapter{

    //앱에서 사용 할 프레그먼트를 준비해 놓자!!
    Fragment[] fragments=new Fragment[3];


    public MyAdapter(FragmentManager fm) {
        super(fm);
        fragments[0]=new FragmentA();
        fragments[1]=new FragmentB();
        fragments[2]=new FragmentC();

    }

    //몇번째 페이지에 어느것 보여줄 것인지...
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    //총 몇페이지니
    @Override
    public int getCount() {
        return fragments.length;
    }
}
