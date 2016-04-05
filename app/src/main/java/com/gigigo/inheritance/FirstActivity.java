package com.gigigo.inheritance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gigigo.inheritance.collaborators.IndendencyInjector;
import com.gigigo.inheritance.collaborators.IndependencyInjector;
import com.gigigo.inheritance.collaborators.IndependencyInjectorInterface;

public class FirstActivity extends AppCompatActivity implements IndendencyInjector {

    protected static final String TAG = FirstActivity.class.getSimpleName();

    IndependencyInjectorInterface independencyInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        independencyInjector = new IndependencyInjector();
    }

    @Override
    public void initDi() {
        independencyInjector.initDI();
    }
}
