package com.gigigo.inheritance;

import android.os.Bundle;
import android.util.Log;

public class FourthActivity extends ThirdActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        manageRotation();
    }

    private void manageRotation() {
        Log.i("TAG", "Rotation Control");
    }
}
