package it.bellotti.android.swipetabs.transforms;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: SimoneBellotti
 * Date: 20/11/2014
 * Time: 15.26
 */
public class AlphaTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View view, float position) {
        final float normPosition = Math.abs(Math.abs(position) - 1);
        view.setAlpha(normPosition);
    }
}
