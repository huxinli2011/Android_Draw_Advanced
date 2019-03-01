package com.draw.adavnced.BezierDemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * 二阶贝济埃曲线的方法
 * quadTo(float x1, float y1, float x2, float y2)
 * rQuadTo(float dx1, float dy1, float dx2, float dy2)
 * x1和y1是控制点坐标  x2和y2是终点坐标 ，而起始点是通过Path.moveTo(x,y)来指定的，如果没有指定默认是从(0,0)开始
 *
 * 三阶贝济埃曲线的方法
 * cubicTo(float x1, float y1, float x2, float y2,float x3, float y3)
 * rCubicTo(float x1, float y1, float x2, float y2,float x3, float y3)
 *
 */
public class WaveView extends View {
    public WaveView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);

    Paint paint = new Paint();
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(5);
    paint.setColor(Color.BLACK);

    Path path = new Path();
    path.moveTo(100,300);
    path.quadTo(200,200,300,300);
    path.quadTo(400,400,500,300);


    canvas.drawPath(path,paint);
}
}
