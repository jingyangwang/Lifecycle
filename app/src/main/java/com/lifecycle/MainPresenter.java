package com.lifecycle;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.util.Log;

public class MainPresenter implements IPresenter {
    private static final String TAG = "MainPresenter";
    public MainPresenter(Context context){

    }

    @Override
    public void onCreate(LifecycleOwner owner) {
        Log.i("debug211121","onCreate ");
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public void onStart(LifecycleOwner owner) {
        Log.d(TAG, "onStart: ");
    }

    @Override
    public void onResume(LifecycleOwner owner) {
        Log.d(TAG, "onResume: ");
    }

    @Override
    public void onPause(LifecycleOwner owner) {
        Log.d(TAG, "onPause: ");
    }

    @Override
    public void onStop(LifecycleOwner owner) {
        Log.d(TAG, "onStop: ");
    }

    @Override
    public void onDestroy(LifecycleOwner owner) {
        Log.d(TAG, "onDestroy: ");
    }
}
