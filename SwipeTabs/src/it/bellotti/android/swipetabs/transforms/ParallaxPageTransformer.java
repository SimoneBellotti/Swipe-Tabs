package it.bellotti.android.swipetabs.transforms;

import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: SimoneBellotti
 * Date: 20/11/2014
 * Time: 15.12
 */
import android.support.v4.view.ViewPager;

public class ParallaxPageTransformer implements ViewPager.PageTransformer {
    private int id;
    private int border = 0;
    private float speed = 0.2f;

    public ParallaxPageTransformer(int id) {
        this.id = id;
    }

    @Override
    public void transformPage(View view, float position) {
        View parallaxView = view.findViewById(id);
        if (parallaxView != null) {
            if (position > -1 && position < 1) {
                float width = parallaxView.getWidth();
                parallaxView.setTranslationX(-(position * width * speed));
                float sc = ((float) view.getWidth() - border) / view.getWidth();
                if (position == 0) {
                    view.setScaleX(1);
                    view.setScaleY(1);
                } else {
                    view.setScaleX(sc);
                    view.setScaleY(sc);
                }
            }
        }
    }

    public void setBorder(int px) {
        border = px;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
