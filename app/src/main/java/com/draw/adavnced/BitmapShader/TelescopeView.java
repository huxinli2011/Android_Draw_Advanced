package com.draw.adavnced.BitmapShader;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.draw.adavnced.R;


public class TelescopeView extends View {
    private Paint mPaint;
    private Bitmap mBitmap,mBitmapBG;
    private int mDx = -1, mDy = -1;

    public TelescopeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.scenery);
    }

    @Override
public boolean onTouchEvent(MotionEvent event) {
    switch (event.getAction()) {
        case MotionEvent.ACTION_DOWN://按下或移动的时候得到手指所在位置
            mDx = (int) event.getX();
            mDy = (int) event.getY();
            postInvalidate();
            return true;
        case MotionEvent.ACTION_MOVE:
            mDx = (int) event.getX();
            mDy = (int) event.getY();
            break;
        case MotionEvent.ACTION_UP:
        case MotionEvent.ACTION_CANCEL:
            mDx = -1;
            mDy = -1;
            break;
    }
    postInvalidate();
    return super.onTouchEvent(event);
}

    @Override
protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    //1、将图片缩放到控件大小
    //2、将mBitmapBG作为BitmapShader设置给Paint,然后在手指所在位置画圆，并把图圈部分显示出来

    if (mBitmapBG == null){
        mBitmapBG = Bitmap.createBitmap(getWidth(),getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvasbg = new Canvas(mBitmapBG);
        canvasbg.drawBitmap(mBitmap,null,new Rect(0,0,getWidth(),getHeight()),mPaint);
    }

    if (mDx != -1 && mDy != -1) {
        mPaint.setShader(new BitmapShader(mBitmapBG, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        canvas.drawCircle(mDx, mDy, 150, mPaint);
    }
}
}
