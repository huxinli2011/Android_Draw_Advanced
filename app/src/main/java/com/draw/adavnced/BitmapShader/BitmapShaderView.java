package com.draw.adavnced.BitmapShader;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.View;

import com.draw.adavnced.R;


public class BitmapShaderView extends View {
    private Paint mPaint;
    private Bitmap mBmp;
    public BitmapShaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mBmp = BitmapFactory.decodeResource(getResources(), R.drawable.dog_edge);
        mPaint.setShader(new BitmapShader(mBmp, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT));
        //Shader.TileMode.CLAMP 用边缘色彩填充多余空间
        //Shader.TileMode.REPEAT重复原图像来填充多余空间
        //Shader.TileMode.MIRROR重复使用镜像模式的图像来填充多余空间
    }

    @Override
protected void onDraw(Canvas canvas) {

    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    //getWidth()用于获取控件宽度，getHeight()用于获取控件高度
    float left = getWidth()/2;
    float top = getHeight()/2;
    float right = getWidth() *2/2;
    float bottom = getHeight() *2/2;

    canvas.drawRect(left,top,right,bottom,mPaint);
//        canvas.drawRect(0,0,getWidth(),getHeight(),mPaint);
}
}
