package it.bellotti.android.swipetabs.activities;

import android.widget.ArrayAdapter;
import it.bellotti.android.swipetabs.transforms.*;
import it.bellotti.android.swipetabs.R;
import it.bellotti.android.swipetabs.TabsPagerAdapter;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class MainActivity
        extends FragmentActivity implements ActionBar.TabListener, ActionBar.OnNavigationListener {

    private ViewPager viewPager;
//    private TabsPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.pager);
        TabsPagerAdapter adapter = new TabsPagerAdapter(this, getSupportFragmentManager());
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {

            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

            actionBar.setListNavigationCallbacks(new ArrayAdapter<String>(this
                    , R.layout.dropdown_item
                    , getResources().getStringArray(R.array.page_transformers)), this);
        }

        //If you want to add the stable ActionBar
//        mActionBar.setHomeButtonEnabled(false);
//        mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);       

        // Adding Tabs for stabled ActionBar
//        for (String tab_name : Constants.TABS) {
//        	mActionBar.addTab(mActionBar.newTab().setText(tab_name)
//                    .setTabListener(this));
//        }
        viewPager.setAdapter(adapter);
//        viewPager.setPageTransformer(true, new CubeInTransformer());
//        viewPager.setPageTransformer(true, new RotationPageTransformer(165));
//        viewPager.setOffscreenPageLimit(TabsPagerAdapter.PAGES);
//        viewPager.setPageMargin(80);
//        viewPager.setClipChildren(false);
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
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction arg1) {
        // hide the given tab
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        viewPager.setAdapter(new TabsPagerAdapter(this, getSupportFragmentManager()));
//        viewPager.setPageTransformer(true, null);
        switch (itemPosition) {
            case 0: //AlphaTransformer
                viewPager.setPageTransformer(true, new AlphaTransformer());
                return true;
            case 1: //ScalePageTransformer
                viewPager.setPageTransformer(true, new ScalePageTransformer());
                return true;
            case 2: //ZoomInPageTransformer
                viewPager.setPageTransformer(true, new ZoomInPageTransformer());
                return true;
            case 3: //ZoomOutPageTransformer
                viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
                return true;
            case 4: //ZoomOutSlideTransformer
                viewPager.setPageTransformer(true, new ZoomOutSlideTransformer());
                return true;
            case 5: //RotateUpTransformer
                viewPager.setPageTransformer(true, new RotateUpTransformer());
                return true;
            case 6: //RotateDownTransformer
                viewPager.setPageTransformer(true, new RotateDownTransformer());
                return true;
            case 7: //DepthPageTransformer
                viewPager.setPageTransformer(true, new DepthPageTransformer());
                return true;
            case 8: //CubeInTransformer
                viewPager.setPageTransformer(true, new CubeInTransformer());
                return true;
            case 9: //CubeOutTransformer
                viewPager.setPageTransformer(true, new CubeOutTransformer());
                return true;
            case 10: //BackgroundToForegroundTransformer
                viewPager.setPageTransformer(true, new BackgroundToForegroundTransformer());
                return true;
            case 11: //ForegroundToBackgroundTransformer
                viewPager.setPageTransformer(true, new ForegroundToBackgroundTransformer());
                return true;
            case 12: //FlipVerticalTransformer
                viewPager.setPageTransformer(true, new FlipVerticalTransformer());
                return true;
            case 13: //FlipHorizontalTransformer
                viewPager.setPageTransformer(true, new FlipHorizontalTransformer());
                return true;
            case 14: //Accordion
                viewPager.setPageTransformer(true, new AccordionTransformer());
                return true;
            case 15: //TabletTransformer
                viewPager.setPageTransformer(true, new TabletTransformer());
                return true;
            case 16: //StackTransformer
                viewPager.setPageTransformer(true, new StackTransformer());
                return true;
            case 17: //RotationPageTransformer
                viewPager.setPageTransformer(true, new RotationPageTransformer());
                return true;
            default:
                return false;
        }
    }

    //Create ActionBar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
}
