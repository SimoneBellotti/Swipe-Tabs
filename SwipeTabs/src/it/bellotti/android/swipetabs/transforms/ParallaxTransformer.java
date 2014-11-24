package it.bellotti.android.swipetabs.transforms;

import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: SimoneBellotti
 * Date: 20/11/2014
 * Time: 15.12
 */
public class ParallaxTransformer extends BaseTransformer  {

    private View parallaxView;

    public ParallaxTransformer(View parallaxView) {
        this.parallaxView = parallaxView;
    }

    @Override
    protected void onTransform(View view, float position) {
        int pageWidth = view.getWidth();

        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            view.setAlpha(1);

        } else if (position <= 1) { // [-1,1]
            parallaxView.setTranslationX(-position * (pageWidth / 2)); //Half the normal speed
        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            view.setAlpha(1);
        }
    }
}
