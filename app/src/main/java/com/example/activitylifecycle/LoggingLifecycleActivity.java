package com.example.activitylifecycle;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoggingLifecycleActivity extends AppCompatActivity {

    private static final String SAVED_INSTANCE_KEY = "saved_instance_key";

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SAVED_INSTANCE_KEY, 10);
        Log.i("ActivityLifecycleTag", this.getClass() + " onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int savedData = savedInstanceState.getInt(SAVED_INSTANCE_KEY);
        Log.i("ActivityLifecycleTag", this.getComponentName() + " onRestoreInstanceState (" + savedInstanceState + ")");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("ActivityLifecycleTag", this.getClass() + " onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ActivityLifecycleTag", this.getClass() + " onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ActivityLifecycleTag", this.getClass() + " onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ActivityLifecycleTag", this.getClass() + " onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ActivityLifecycleTag", this.getClass() + " onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ActivityLifecycleTag", this.getClass() + " onDestroy");
    }
}
