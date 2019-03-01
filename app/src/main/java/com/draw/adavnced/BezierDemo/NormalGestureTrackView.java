package com.draw.adavnced.BezierDemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 实现手势轨迹
 * 1、在自定义控件中拦截onTouchEvent
 * 2、移动画笔mPath.moveTo
 * 3、连线mPath.lineTo，在onDraw方法中调用drawPath
 *
 * 两个问题需要注意
 * 1、MotionEvent.ACTION_DOWN返回true，表示当前控件已经消费了按下动作，之后的MotionEvent.ACTION_MOVE和MotionEvent.ACTION_UP动作也会传递到当前控件中
 *    如果返回false,那么MotionEvent.ACTION_MOVE和MotionEvent.ACTION_UP动作就不会在传递到这个控件中。
 * 2、使用postInvalidate()主线程和子线程都行，而Invalidate()只能在主线程
 *
 */
public class NormalGestureTrackView extends View {
    private Path mPath = new Path();
    private Paint mPaint;

    public NormalGestureTrackView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5);
    }


    @Override
public boolean onTouchEvent(MotionEvent event) {
    switch (event.getAction()){
        case MotionEvent.ACTION_DOWN: {
            mPath.moveTo(event.getX(), event.getY());
            return true;
        }
        case MotionEvent.ACTION_MOVE:
            mPath.lineTo(event.getX(), event.getY());
            postInvalidate();
            break;
        default:
            break;
    }
    return super.onTouchEvent(event);
}

    @Override
protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    canvas.drawPath(mPath,mPaint);
}
}
