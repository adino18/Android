package me.anon.grow;

import android.app.Fragment;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;

import lombok.experimental.Accessors;
import me.anon.grow.fragment.PlantDetailsFragment;
import me.anon.grow.fragment.StatisticsFragment;
import me.anon.lib.Views;

/**
 * // TODO: Add class description
 *
 * @author 7LPdWcaW
 * @documentation // TODO Reference flow doc
 * @project GrowTracker
 */
@Views.Injectable
@Accessors(prefix = {"m", ""}, chain = true)
public class PlantDetailsActivity extends BaseActivity
{
	private FragmentTabHost mTabHost;

	private static final String TAG_FRAGMENT = "current_fragment";

	@Override protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		if (!checkEncryptState())
		{
			setContentView(R.layout.fragment_holder);
			setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
			getSupportActionBar().setDisplayHomeAsUpEnabled(true);
			getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_done_white_24dp);
			Views.inject(this);

			int gardenIndex = -1;
			int plantIndex = -1;

			if (getIntent().getExtras() != null)
			{
				plantIndex = getIntent().getExtras().getInt("plant_index", -1);
				gardenIndex = getIntent().getExtras().getInt("garden_index", -1);
			}

			if (plantIndex < 0)
			{
				finish();
				return;
			}

			if (getFragmentManager().findFragmentByTag(TAG_FRAGMENT) == null)
			{
				getFragmentManager().beginTransaction().replace(R.id.fragment_holder, PlantDetailsFragment.newInstance(plantIndex, gardenIndex), TAG_FRAGMENT).commit();
			}
		}


//		mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
//		mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
//		//mTabHost.setOnTabChangedListener(onTab_Changed);
//		LayoutInflater inflater = getLayoutInflater();
//		View tab1 = inflater.inflate(R.layout.plant_details_view,null);
//		View tab2 = inflater.inflate(R.layout.stat,null);
//		View tab3 = inflater.inflate(R.layout.tab3_indicator,null);
//		TabHost tabHost = getTabHost();
//a
//		// thiet lap tab cho danh muc Android blog GocLapTrinh.com
//		TabHost.TabSpec androidspec = tabHost.newTabSpec("Android");
//		androidspec.setIndicator("Android", getResources().getDrawable(R.drawable.icon_android_tab));
//		Intent androidIntent = new Intent(this, AndroidActivity.class);
//		androidspec.setContent(androidIntent);
//
//		// thiet lap tab cho danh muc Software blog GocLapTrinh.com
//		TabHost.TabSpec softwarespec = tabHost.newTabSpec("SoftWare");
//		softwarespec.setIndicator("SoftWare", getResources().getDrawable(R.drawable.icon_software_tab));
//		Intent softwareIntent = new Intent(this, SoftwareActivity.class);
//		softwarespec.setContent(softwareIntent);
//
//		// thiet lap tab cho danh muc Tai Lieu blog GocLapTrinh.com
//		TabHost.TabSpec tailieuspec = tabHost.newTabSpec("Tài Liệu");
//		tailieuspec.setIndicator("Tài Liệu", getResources().getDrawable(R.drawable.icon_tailieu_tab));
//		Intent tailieuIntent = new Intent(this, TailieuActivity.class);
//		tailieuspec.setContent(tailieuIntent);
//
//		// lan luot Themm cac TabSpec vao TabHost
//		tabHost.addTab(androidspec);
//		tabHost.addTab(softwarespec);
//		tabHost.addTab(tailieuspec);
	}

	@Override public boolean onOptionsItemSelected(MenuItem item)
	{
		if (item.getItemId() == android.R.id.home)
		{
			Fragment fragment = getFragmentManager().findFragmentById(R.id.fragment_holder);

			if (fragment instanceof PlantDetailsFragment)
			{
				((PlantDetailsFragment)fragment).save();
			}

			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
//package me.anon.grow;
//
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentTabHost;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.TabHost;
//
//import me.anon.grow.fragment.PlantDetailsFragment;
//import me.anon.grow.fragment.StatisticsFragment;
//
//public class PlantDetailsActivity extends AppCompatActivity {
//    private FragmentTabHost mTabHost;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_plant_tab);
//        mTabHost = (FragmentTabHost) findViewById(R.id.tabhost);
//        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
//        mTabHost.setOnTabChangedListener(onTab_Changed);
//			int gardenIndex = -1;
//			int plantIndex = -1;
//
//			if (getIntent().getExtras() != null)
//			{
//				plantIndex = getIntent().getExtras().getInt("plant_index", -1);
//				gardenIndex = getIntent().getExtras().getInt("garden_index", -1);
//			}
//        LayoutInflater inflater = getLayoutInflater();
//        View tab1 = inflater.inflate(R.layout.statistics_view, null);
//        View tab2 = inflater.inflate(R.layout.statistics_view, null);
//        View tab3 = inflater.inflate(R.layout.statistics_view, null);
//
//        mTabHost.addTab(mTabHost.newTabSpec("tab1")
//                        .setIndicator(tab1),
//                StatisticsFragment.newInstance(plantIndex).getClass(), null);
//
//        mTabHost.addTab(mTabHost.newTabSpec("tab2")
//                        .setIndicator(tab2),
//                StatisticsFragment.newInstance(plantIndex).getClass(), null);
//
//        mTabHost.addTab(mTabHost.newTabSpec("tab3")
//                        .setIndicator(tab3),
//                StatisticsFragment.newInstance(plantIndex).getClass(), null);
//    }
//
//    private TabHost.OnTabChangeListener onTab_Changed = new TabHost.OnTabChangeListener() {
//        @Override
//        public void onTabChanged(String tabId) {
////            switch (tabId) {
////                case "tab1":
////                    getSupportActionBar().setTitle("Mau Xanh");
////                    break;
////                case "tab2":
////                    getSupportActionBar().setTitle("Mau Xanh La Cay");
////                    break;
////                case "tab3":
////                    getSupportActionBar().setTitle("Mau Do");
////                    break;
////            }
//        }
//    };
//    	@Override public boolean onOptionsItemSelected(MenuItem item)
//	{
//		if (item.getItemId() == android.R.id.home)
//		{
//			android.app.Fragment fragment = getFragmentManager().findFragmentById(R.id.fragment_holder);
//
//			if (fragment instanceof PlantDetailsFragment)
//			{
//				((PlantDetailsFragment)fragment).save();
//			}
//
//			return true;
//		}
//
//		return super.onOptionsItemSelected(item);
//	}
//}
