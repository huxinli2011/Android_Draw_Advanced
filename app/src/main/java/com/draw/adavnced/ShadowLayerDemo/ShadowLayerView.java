package com.draw.adavnced.ShadowLayerDemo;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.View;

import com.draw.adavnced.R;


public class ShadowLayerView extends View {
    private Paint mPaint = new Paint();
    private Bitmap mDogBmp;
    private int mRadius = 1, mDx = 10, mDy = 10;
    private boolean mSetShadow = true;

    public ShadowLayerView(Context context) {
        super(context);
        init();
    }

    public ShadowLayerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ShadowLayerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setLayerType(LAYER_TYPE_SOFTWARE, null);//禁用硬件加速
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(25);
        mDogBmp = BitmapFactory.decodeResource(getResources(), R.drawable.dog);
    }

    //模糊半径越大越模糊
    public void changeRadius() {
        mRadius++;
        postInvalidate();
    }

    public void changeDx() {
        mDx += 5;
        postInvalidate();
    }

    public void changeDy() {
        mDy += 5;
        postInvalidate();
    }

    public void setShadow(boolean showShadow) {//清除阴影也可以mRadius为0
        mSetShadow = showShadow;
        postInvalidate();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);

        if (mSetShadow) {
            mPaint.setShadowLayer(mRadius, mDx, mDy, Color.GRAY);//注意 setShadowLayer() 只有文字绘制阴影支持硬件加速，其它都不支持。setShadowLayer所指定的颜色对图片是不起作用的。
        } else {
            mPaint.clearShadowLayer();
        }

        canvas.drawText("启舰", 100, 100, mPaint);

        canvas.drawCircle(200, 200, 50, mPaint);

        canvas.drawBitmap(mDogBmp, null, new Rect(200, 300, 200 + mDogBmp.getWidth(), 300 + mDogBmp.getHeight()), mPaint);
    }
}
