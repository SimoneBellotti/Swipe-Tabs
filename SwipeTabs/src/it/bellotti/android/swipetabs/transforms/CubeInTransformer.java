package it.bellotti.android.swipetabs.transforms;

import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: SimoneBellotti
 * Date: 24/11/2014
 * Time: 12.41
 */
public class CubeInTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        // Rotate the fragment on the left or right edge
        view.setPivotX(position > 0 ? 0 : view.getWidth());
        view.setPivotY(0);
        view.setRotationY(-90f * position);
    }
    @Override
    public boolean isPagingEnabled() {
        return true;
    }
}