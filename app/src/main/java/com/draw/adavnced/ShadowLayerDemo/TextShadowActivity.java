package com.draw.adavnced.ShadowLayerDemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.draw.adavnced.R;


public class TextShadowActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_shadow_activity);

        TextView tv = (TextView)findViewById(R.id.tv);
        tv.setShadowLayer(2,5,5, Color.GRAY);
    }
}
