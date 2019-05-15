package com.strikalov.mdhomework7;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class TabActivity extends AppCompatActivity {

    private static final String FRAGMENT1 = "Fragment1";
    private static final String FRAGMENT2 = "Fragment2";
    private static final String FRAGMENT3 = "Fragment3";

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Fragment fragment1 = Fragment1.newInstance(FRAGMENT1);
        Fragment fragment2 = Fragment2.newInstance(FRAGMENT2);
        Fragment fragment3 = Fragment3.newInstance(FRAGMENT3);

        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter.addFragmet(fragment1, FRAGMENT1);
        myAdapter.addFragmet(fragment2, FRAGMENT2);
        myAdapter.addFragmet(fragment3, FRAGMENT3);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(myAdapter);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
