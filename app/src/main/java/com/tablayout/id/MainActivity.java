package com.tablayout.id;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.Fragment;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;





public class MainActivity extends AppCompatActivity {
	
	TabLayout tabLayout;
	ViewPager viewPager;
	


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		viewPager = findViewById(R.id.viewpager); 
		setupViewPager(viewPager);
		tabLayout = findViewById(R.id.tablayout);
		tabLayout.setupWithViewPager(viewPager);
	
    }
	
	private void setupViewPager(ViewPager viewPager){
		SectionPagerAdapter adapter= new SectionPagerAdapter(getSupportFragmentManager());
		adapter.addFragment(FragHome.newInstance(), " home");
		adapter.addFragment(FragFavorite.newInstance(), " Favorite");
		adapter.addFragment(FragProfile.newInstance(), " Profil");
		
		viewPager.setAdapter(adapter);
	}
	
	private class SectionPagerAdapter extends FragmentPagerAdapter {
		private final List<Fragment> mFragmentList = new ArrayList<>();
		private final List<String> mFragmentTitleList = new ArrayList<>();
		
		SectionPagerAdapter(FragmentManager manager){
			super(manager);
		}
		@Override
		public Fragment getItem(int position){
			return mFragmentList.get(position);
		}
		
		@Override
		public int getCount(){
			return mFragmentList.size();
		}
		
		void addFragment(Fragment fragment, String title){
			mFragmentList.add(fragment);
			title = title.toLowerCase();
			title = title.substring(0, 1).toUpperCase() + title.substring(1);
			mFragmentTitleList.add(title);
		}
		
		@Override
		public CharSequence getPageTitle(int position){
			return mFragmentTitleList.get(position);
		}
	}
}