package me.anon.grow;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;

import me.anon.grow.fragment.StatisticsFragment;

public class PlantTabActivity extends AppCompatActivity {
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_tab);
        mTabHost = (FragmentTabHost) findViewById(R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        mTabHost.setOnTabChangedListener(onTab_Changed);

        LayoutInflater inflater = getLayoutInflater();
        View tab1 = inflater.inflate(R.layout.tab1_indicator, null);
        View tab2 = inflater.inflate(R.layout.tab2_indicator, null);
        View tab3 = inflater.inflate(R.layout.tab3_indicator, null);

        mTabHost.addTab(mTabHost.newTabSpec("tab1")
                        .setIndicator(tab1),
                StatisticsFragment.class, null);

        mTabHost.addTab(mTabHost.newTabSpec("tab2")
                        .setIndicator(tab2),
                StatisticsFragment.class, null);

        mTabHost.addTab(mTabHost.newTabSpec("tab3")
                        .setIndicator(tab3),
                StatisticsFragment.newInstance(1).getClass(), null);
    }

    private TabHost.OnTabChangeListener onTab_Changed = new TabHost.OnTabChangeListener() {
        @Override
        public void onTabChanged(String tabId) {
            switch (tabId) {
                case "tab1":
                    getSupportActionBar().setTitle("Mau Xanh");
                    break;
                case "tab2":
                    getSupportActionBar().setTitle("Mau Xanh La Cay");
                    break;
                case "tab3":
                    getSupportActionBar().setTitle("Mau Do");
                    break;
            }
        }
    };
}
