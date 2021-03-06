package com.draw.adavnced.LinearGradient;

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
        setContentView(R.layout.lineargradient_main);

        findViewById(R.id.linear_gradient_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,LinearGradientDemoActivity.class));
            }
        });

        findViewById(R.id.shimmer_text_demo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MyActivity.this,ShimmerTextActivity.class));
            }
        });
    }
}
