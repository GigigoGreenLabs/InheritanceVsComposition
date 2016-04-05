package com.gigigo.inheritance;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends FirstActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initUI();
    }

    private void initUI() {
        Log.i(TAG, "Init UI");
    }
}
