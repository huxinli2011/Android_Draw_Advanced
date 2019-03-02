package com.draw.adavnced.BlurMaskFilterDemo;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class BlurMaskFilterView extends View {
    private Paint mPaint;
    public BlurMaskFilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayerType(LAYER_TYPE_SOFTWARE,null);
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setMaskFilter(new BlurMaskFilter(50, BlurMaskFilter.Blur.OUTER));//实现发光效果，Blur.OUTER只显示发光效果，Blur.INNER内发光，Blur.SOLID外发光，Blur.NORMAL内外发光
        //mPaint.setMaskFilter(new EmbossMaskFilter(); //实现浮雕效果
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        canvas.drawCircle(200,200,100,mPaint);
    }
}
