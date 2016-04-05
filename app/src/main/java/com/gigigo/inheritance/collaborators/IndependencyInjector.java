package com.gigigo.inheritance.collaborators;

import android.util.Log;

public class IndependencyInjector implements IndependencyInjectorInterface {

    private static final String TAG = IndependencyInjector.class.getSimpleName();

    @Override
    public void initDI() {
        Log.i(TAG, "Init DI");
    }
}
