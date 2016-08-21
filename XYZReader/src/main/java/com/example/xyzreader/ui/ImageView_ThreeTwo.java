package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ImageView_ThreeTwo extends ImageView {
    public ImageView_ThreeTwo(Context context) {
        super(context);
    }

    public ImageView_ThreeTwo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageView_ThreeTwo(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
  protected void onMeasure(int widthM_spec, int height_spec) {
        int widthNew = MeasureSpec.getSize(height_spec) * 2/3;
        int widthNewSpec =
                MeasureSpec.makeMeasureSpec(widthNew, MeasureSpec.EXACTLY);
        super.onMeasure(widthNewSpec,height_spec);
    }
}
