package com.strikalov.mdhomework7;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class BottomActivity extends AppCompatActivity {

    private static final String FRAGMENT1 = "Fragment1";
    private static final String FRAGMENT2 = "Fragment2";
    private static final String FRAGMENT3 = "Fragment3";

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        replaceFragment(Fragment1.newInstance(FRAGMENT1));

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.navigation_fragment1:
                        replaceFragment(Fragment1.newInstance(FRAGMENT1));
                        return true;
                    case R.id.navigation_fragment2:
                        replaceFragment(Fragment2.newInstance(FRAGMENT2));
                        return true;
                    case R.id.navigation_fragment3:
                        replaceFragment(Fragment3.newInstance(FRAGMENT3));
                        return true;
                }
                return false;
            }
        });
    }

    private void replaceFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_layout, fragment)
                .commit();
    }

}
