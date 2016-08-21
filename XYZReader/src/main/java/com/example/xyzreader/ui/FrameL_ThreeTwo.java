package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;


public class FrameL_ThreeTwo extends FrameLayout {
    public FrameL_ThreeTwo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FrameL_ThreeTwo(Context context) {
        super(context);
    }

    @Override
    protected void onMeasure(int widthM_spec, int height_spec) {
        int widthNew = MeasureSpec.getSize(height_spec) * 3/2;
        int widthNewSpec =
                MeasureSpec.makeMeasureSpec(widthNew, MeasureSpec.EXACTLY);
        super.onMeasure(widthNewSpec,height_spec);
    }
}
