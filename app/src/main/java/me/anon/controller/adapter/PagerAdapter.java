//package me.anon.controller.adapter;
//
//import android.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//
//import me.anon.grow.fragment.StatisticsFragment;
//
//public class PagerAdapter extends FragmentPagerAdapter {
//
//    PagerAdapter(FragmentManager fragmentManager) {
//        super(fragmentManager);
//    }
//    @Override
//    public android.support.v4.app.Fragment getItem(int position) {
//        Fragment frag=null;
//        switch (position){
//            case 0:
//                frag = new StatisticsFragment();
//                break;
//            case 1:
//                frag = new StatisticsFragment();
//                break;
//            case 2:
//                frag = new StatisticsFragment();
//                break;
//        }
//        return frag.getTargetFragment();
//    }
//
//    @Override
//    public int getCount() {
//        return 3;
//    }
//    @Override
//    public CharSequence getPageTitle(int position) {
//        String title = "";
//        switch (position){
//            case 0:
//                title = "One";
//                break;
//            case 1:
//                title = "Two";
//                break;
//            case 2:
//                title = "Three";
//                break;
//        }
//        return title;
//    }
//}