package com.academy.android.databindingworkshop.examples;

import com.academy.android.databindingworkshop.BaseActivity;
import com.academy.android.databindingworkshop.R;
import com.academy.android.databindingworkshop.databinding.ActivityBasicBinding;
import com.academy.android.databindingworkshop.model.User;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

public class BasicActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityBasicBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_basic);
        User user = new User("Darth", "Vader", 45);
        binding.setUser(user);
    }
}

