package com.academy.android.databindingworkshop.examples;

import com.academy.android.databindingworkshop.BaseActivity;
import com.academy.android.databindingworkshop.R;
import com.academy.android.databindingworkshop.databinding.ActivityViewWithIdsBinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

public class ViewWithIDsActivity extends BaseActivity {

    ActivityViewWithIdsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_with_ids);
    }

    public void showMyName(View view) {
        binding.firstName.setText("Darth");
        binding.lastName.setText("Vader");
    }
}
