package it.bellotti.android.swipetabs.adapters;

import android.content.Context;
import it.bellotti.android.swipetabs.R;
import it.bellotti.android.swipetabs.fragments.CalendarFragment;
import it.bellotti.android.swipetabs.fragments.HomeFragment;
import it.bellotti.android.swipetabs.fragments.StatisticsFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter
        extends FragmentPagerAdapter {

    public final static int PAGES = 3;
    private Context context;

    public TabsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                return new HomeFragment();
            case 1:
                return new StatisticsFragment();
            case 2:
                return new CalendarFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return context.getString(R.string.fragment_home);
            case 1:
                return context.getString(R.string.fragment_statistics);
            case 2:
                return context.getString(R.string.fragment_calendar);
            default:
                return null;
        }
    }

}
