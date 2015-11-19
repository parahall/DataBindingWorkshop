package com.academy.android.databindingworkshop.examples;

import com.academy.android.databindingworkshop.BaseActivity;
import com.academy.android.databindingworkshop.R;
import com.academy.android.databindingworkshop.databinding.ActivityIncludeBinding;
import com.academy.android.databindingworkshop.model.Contact;
import com.academy.android.databindingworkshop.model.User;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

public class IncludeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIncludeBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_include);
        User user = new User("Darth", "Vader");
        Contact contact = new Contact("111-222-333", "Death Star");

        binding.setUser(user);
        binding.setContact(contact);
    }
}

