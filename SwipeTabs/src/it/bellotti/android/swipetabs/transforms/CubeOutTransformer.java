package it.bellotti.android.swipetabs.transforms;

import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: Simone Bellotti
 * Date: 26/09/2014
 * Time: 10.36
 */
public class CubeOutTransformer extends BaseTransformer {

    @Override
    protected void onTransform(View view, float position) {
        view.setPivotX(position < 0f ? view.getWidth() : 0f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(90f * position);
    }

    @Override
    public boolean isPagingEnabled() {
        return true;
    }
}
