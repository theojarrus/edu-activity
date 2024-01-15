package com.example.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.activitylifecycle.databinding.ActivityMainBinding;

public class MainActivity extends LoggingLifecycleActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater(), null, false);
        setContentView(binding.getRoot());

        binding.firstActivityButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, FirstExampleActivity.class);
            startActivity(intent);
        });


        binding.secondActivityButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondExampleActivity.class);
            startActivity(intent);
        });
    }
}
