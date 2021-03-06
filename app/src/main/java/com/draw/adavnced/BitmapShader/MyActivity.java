package com.draw.adavnced.BitmapShader;

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
        setContentView(R.layout.bitmap_shader_main);

        findViewById(R.id.bitmap_shader_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,BitmapShaderActivity.class));
            }
        });

        findViewById(R.id.telescope_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,TelescopeActivity.class));
            }
        });

        findViewById(R.id.avator_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,AvatorActivity.class));
            }
        });
    }
}
