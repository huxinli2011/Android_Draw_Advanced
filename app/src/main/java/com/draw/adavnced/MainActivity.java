package com.draw.adavnced;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bezier).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,com.draw.adavnced.BezierDemo.MyActivity.class));
            }
        });
        findViewById(R.id.bitmap_shader).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,com.draw.adavnced.BitmapShader.MyActivity.class));
            }
        });
        findViewById(R.id.bitmap_blurmask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,com.draw.adavnced.BlurMaskFilterDemo.MyActivity.class));
            }
        });
        findViewById(R.id.bitmap_lineargradient).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,com.draw.adavnced.LinearGradient.MyActivity.class));
            }
        });
        findViewById(R.id.bitmap_radial).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,com.draw.adavnced.RadialGradient.MyActivity.class));
            }
        });
        findViewById(R.id.bitmap_shadowlayer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,com.draw.adavnced.ShadowLayerDemo.MyActivity.class));
            }
        });
    }
}
