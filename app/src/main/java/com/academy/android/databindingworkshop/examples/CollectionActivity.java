package com.academy.android.databindingworkshop.examples;

import com.academy.android.databindingworkshop.BaseActivity;
import com.academy.android.databindingworkshop.R;
import com.academy.android.databindingworkshop.databinding.CollectionsBinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.SparseArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CollectionsBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_collection);

        String[] literals = new String[]{"Darth", "Vader"};

        List<String> list = new ArrayList<>();
        SparseArray<String> sparse = new SparseArray<>(2);

        String key = "firstName";
        int index = 0;

        for (String literal : literals) {
            list.add(literal);
            sparse.put(0, literal);
        }

        Map<String, String> map = new HashMap<>();
        map.put(key, "Darth");
        map.put("lastName", "Vader");

        binding.setIndex(index);
        binding.setKey(key);
        binding.setList(list);
        binding.setSparse(sparse);
        binding.setMap(map);
    }
}
