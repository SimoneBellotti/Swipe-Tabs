package it.bellotti.android.swipetabs.transforms;

import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: SimoneBellotti
 * Date: 24/11/2014
 * Time: 12.45
 */
public class FlipHorizontalTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        final float rotation = 180f * position;
        view.setAlpha(rotation > 90f || rotation < -90f ? 0 : 1);
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(rotation);
    }
}
