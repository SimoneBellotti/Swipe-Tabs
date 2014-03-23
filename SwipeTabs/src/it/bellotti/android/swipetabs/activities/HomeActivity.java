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
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

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
        
        
        mViewPager.setAdapter(mAdapter);
        
        //If you want to add the stable ActionBar
        
//        mActionBar.setHomeButtonEnabled(false);
//        mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);       
 
        // Adding Tabs for stabled ActionBar
//        for (String tab_name : Constants.TABS) {
//        	mActionBar.addTab(mActionBar.newTab().setText(tab_name)
//                    .setTabListener(this));
//        }
        
        DepthPageTransformer callback = new DepthPageTransformer();
        mViewPager.setPageTransformer(true, callback);
        
        
    	mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
       	 
            @Override
            public void onPageSelected(int position) {
                // on changing the page
                // make respected tab selected
                // When swiping between pages, select the
                // corresponding tab.
            	
//            	mActionBar.setSelectedNavigationItem(position);
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
	
	public class DepthPageTransformer implements ViewPager.PageTransformer {
	    private static final float MIN_SCALE = 0.75f;

	    public void transformPage(View view, float position) {
	        int pageWidth = view.getWidth();

	        if (position < -1) { // [-Infinity,-1)
	            // This page is way off-screen to the left.
	            view.setAlpha(0);

	        } else if (position <= 0) { // [-1,0]
	            // Use the default slide transition when moving to the left page
	            view.setAlpha(1);
	            view.setTranslationX(0);
	            view.setScaleX(1);
	            view.setScaleY(1);

	        } else if (position <= 1) { // (0,1]
	            // Fade the page out.
	            view.setAlpha(1 - position);

	            // Counteract the default slide transition
	            view.setTranslationX(pageWidth * -position);

	            // Scale the page down (between MIN_SCALE and 1)
	            float scaleFactor = MIN_SCALE
	                    + (1 - MIN_SCALE) * (1 - Math.abs(position));
	            view.setScaleX(scaleFactor);
	            view.setScaleY(scaleFactor);

	        } else { // (1,+Infinity]
	            // This page is way off-screen to the right.
	            view.setAlpha(0);
	        }
	    }
	}
	
}
