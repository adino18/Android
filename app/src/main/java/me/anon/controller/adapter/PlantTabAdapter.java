package me.anon.controller.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import me.anon.grow.fragment.StatisticsFragment;

public class PlantTabAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PlantTabAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                StatisticsFragment tab1 = new StatisticsFragment().newInstance(1);
                return tab1;
            case 1:
                StatisticsFragment tab2 = new StatisticsFragment();
                return tab2;
            case 2:
                StatisticsFragment tab3 = new StatisticsFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}