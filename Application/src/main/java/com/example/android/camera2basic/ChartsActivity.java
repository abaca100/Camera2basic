package com.example.android.camera2basic;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by jackpro15 on 2/18/16.
 */
public class ChartsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charts);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, ChartsFragment.newInstance())
                    .commit();
        }
    }
}
