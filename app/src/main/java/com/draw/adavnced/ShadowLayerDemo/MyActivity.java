package com.draw.adavnced.ShadowLayerDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.draw.adavnced.R;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shadow_layer_main);

        findViewById(R.id.set_shadow_layer_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,ShadowLayerActivity.class));
            }
        });

        findViewById(R.id.text_shadow).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,TextShadowActivity.class));
            }
        });

        findViewById(R.id.bitmap_shadow).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,BitmapShadowActivity.class));
            }
        });
    }
}
