package com.gigigo.inheritance;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends SecondActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initNavigation();
    }

    private void initNavigation() {
        Log.i(TAG, "Init Navigation");
    }
}
