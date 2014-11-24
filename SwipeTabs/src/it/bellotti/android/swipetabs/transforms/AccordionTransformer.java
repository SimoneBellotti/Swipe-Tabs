package it.bellotti.android.swipetabs.transforms;

/**
 * Created with IntelliJ IDEA.
 * User: SimoneBellotti
 * Date: 24/11/2014
 * Time: 12.40
 */

import android.view.View;

public class AccordionTransformer extends BaseTransformer {
    @Override
    protected void onTransform(View view, float position) {
        view.setPivotX(position < 0 ? 0 : view.getWidth());
        view.setScaleX(position < 0 ? 1f + position : 1f - position);
    }
}