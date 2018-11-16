package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "NUMBERS", "FAMILY", "COLORS", "PHRASES" };
    private Context mContext;


    public CategoryAdapter(Context context,FragmentManager fm){
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new NumbersFragment();
            case 1: return new FamilyFragment();
            case 2: return new ColorsFragment();
            case 3: return new PhrasesFragment();
            default: return new NumbersFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
