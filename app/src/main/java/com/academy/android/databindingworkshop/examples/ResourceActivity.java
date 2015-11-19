package com.academy.android.databindingworkshop.examples;

import com.academy.android.databindingworkshop.BaseActivity;
import com.academy.android.databindingworkshop.R;
import com.academy.android.databindingworkshop.databinding.ResourceBinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import java.util.Random;

public class ResourceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ResourceBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_resource);

        Random random = new Random();
        binding.setFirstName("Darth");
        binding.setLastName("Vader");

        binding.setLarge(random.nextBoolean());

        binding.setBananaCount(random.nextInt(10));
        binding.setOrangeCount(random.nextInt(10));
    }
}
