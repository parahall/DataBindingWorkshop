package com.academy.android.databindingworkshop.examples;

import com.academy.android.databindingworkshop.BaseActivity;
import com.academy.android.databindingworkshop.ContractBinding;
import com.academy.android.databindingworkshop.R;
import com.academy.android.databindingworkshop.model.Contact;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

public class CustomBindingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ContractBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_custom_binding);

        Contact contact = new Contact("111-333-444", "Death Star");
        binding.setContact(contact);
    }
}
