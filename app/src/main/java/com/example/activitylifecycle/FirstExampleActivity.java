package com.example.activitylifecycle;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.example.activitylifecycle.databinding.ActivityExampleBinding;

public class FirstExampleActivity extends LoggingLifecycleActivity {

    private ActivityExampleBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExampleBinding.inflate(getLayoutInflater(), null, false);
        setContentView(binding.getRoot());

        binding.text.setOnClickListener(v -> getOnBackPressedDispatcher().onBackPressed());
    }
}
