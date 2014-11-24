package it.bellotti.android.swipetabs.transforms;

import android.view.View;

/**
 * Created with IntelliJ IDEA.
 * User: Simone Bellotti
 * Date: 26/09/2014
 * Time: 10.35
 */
public class RotateUpTransformer extends BaseTransformer {

    private static final float ROT_MOD = -15f;

    @Override
    protected void onTransform(View view, float position) {
        final float width = view.getWidth();
        final float rotation = ROT_MOD * position;

        view.setPivotX(width * 0.5f);
        view.setPivotY(0f);
        view.setTranslationX(0f);
        view.setRotation(rotation);
    }

    @Override
    protected boolean isPagingEnabled() {
        return true;
    }
}

