package it.bellotti.android.swipetabs.transforms;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: SimoneBellotti
 * Date: 20/11/2014
 * Time: 15.18
 */
public class ScalePageTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View view, float position) {
        final float normalizedposition = Math.abs(Math.abs(position) - 1);
        view.setScaleX(normalizedposition / 2 + 0.5f);
        view.setScaleY(normalizedposition / 2 + 0.5f);
    }
}
