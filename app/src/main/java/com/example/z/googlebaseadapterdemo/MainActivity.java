package com.example.z.googlebaseadapterdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ViewPager mVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVp = (ViewPager) findViewById(R.id.viewpager);


        mVp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public android.support.v4.app.Fragment getItem(int position) {
                BaseFragment fragment = null;
                switch (position){
                    case 0:
                        fragment = new AppFragment();
                        break;

                    case 1:
                        fragment = new NewsFragment();
                        break;
                }
                return fragment;
            }

            @Override
            public int getCount() {
                return 2;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                if(position == 0){
                    return "diyi ";
                }else {
                    return super.getPageTitle(position);
                }
            }
        });

    }
}
