package it.bellotti.android.swipetabs.activities;

import it.bellotti.android.swipetabs.R;
import it.bellotti.android.swipetabs.TabsPagerAdapter;
import it.bellotti.android.swipetabs.util.Constants;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class HomeActivity extends FragmentActivity implements ActionBar.TabListener {

    private ViewPager mViewPager;
    private TabsPagerAdapter mAdapter;
    private ActionBar mActionBar;
//    private PagerTabStrip mPagerTitleStrip;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
;
		
		// Init
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mActionBar = getActionBar();
        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());
        
        //PageTitleStrip
//        mPagerTitleStrip = (PagerTabStrip) findViewById(R.id.pager_tab_strip);
        
        mViewPager.setAdapter(mAdapter);
        mActionBar.setHomeButtonEnabled(false);
        mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);       
 
        // Adding Tabs
        for (String tab_name : Constants.TABS) {
        	mActionBar.addTab(mActionBar.newTab().setText(tab_name)
                    .setTabListener(this));
        }
        

        
        
    	mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
       	 
            @Override
            public void onPageSelected(int position) {
                // on changing the page
                // make respected tab selected
                // When swiping between pages, select the
                // corresponding tab.
            	mActionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    } 
	


	@Override
	public void onTabReselected(Tab tab, FragmentTransaction frag) {
		// probably ignore this event

		
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction frag) {
		 /*show the given tab
         on tab selected
         show respected fragment view*/
		/* When the tab is selected, switch to the
           corresponding page in the ViewPager.*/
        mViewPager.setCurrentItem(tab.getPosition());
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction arg1) {
		// hide the given tab

		
	}
	
	//Create ActionBar
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
