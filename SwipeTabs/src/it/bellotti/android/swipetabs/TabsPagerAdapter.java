package it.bellotti.android.swipetabs;

import it.bellotti.android.swipetabs.fragments.HomeFragment;
import it.bellotti.android.swipetabs.fragments.StatisticsFragment;
import it.bellotti.android.swipetabs.fragments.TabThree;
import it.bellotti.android.swipetabs.util.Constants;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter{

	private final static int PAGES_COUNT = 3;
	
	//Constructor
	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

        switch (index) {
        case 0:
            // TabOne fragment activity
            return new HomeFragment();
        case 1:
            // TabTwo fragment activity
            return new StatisticsFragment();
        case 2:
            // TabThree fragment activity
            return new TabThree();
        }
		
		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return PAGES_COUNT;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {

	    String tabTitle;
	    switch(position) {
	        case 0:
	            tabTitle = Constants.TABS[0];
	            break;
	        case 1:
	            tabTitle = Constants.TABS[1];
	            break;
	        case 2:
	            tabTitle = Constants.TABS[2];
	            break;
	        default:
	            tabTitle = "Default Tab Title";
	            break;
	    }
	    return tabTitle;
	}

}
