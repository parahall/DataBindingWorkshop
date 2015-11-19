package com.academy.android.databindingworkshop.examples;


import com.academy.android.databindingworkshop.BaseActivity;
import com.academy.android.databindingworkshop.R;
import com.academy.android.databindingworkshop.databinding.ActivityObservableBinding;
import com.academy.android.databindingworkshop.model.ObservableUser;
import com.academy.android.databindingworkshop.model.PlainUser;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.view.View;

public class ObservableActivity extends BaseActivity {

    private ObservableUser user = new ObservableUser();
    private PlainUser plainUser = new PlainUser();
    private ObservableArrayMap<String, Object> mapUser = new ObservableArrayMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityObservableBinding binding = DataBindingUtil.setContentView(
                this, R.layout.activity_observable);

        setMyName(null);

        binding.setUser(user);
        binding.setPlainUser(plainUser);
        binding.setMapUser(mapUser);
    }

    public void setOtherName(View view) {
        user.setFirstName("Darth");
        user.setLastName("Vader");

        plainUser.firstName.set("Luke");
        plainUser.lastName.set("Skywalker");
        plainUser.age.set(21);

        mapUser.put("firstName", "Princess");
        mapUser.put("lastName", "Leia");
        mapUser.put("age", 23);
    }

    public void setMyName(View view) {
        user.setFirstName("Han");
        user.setLastName("Solo");

        plainUser.firstName.set("Obi-Wan");
        plainUser.lastName.set("Kenobi");
        plainUser.age.set(59);

        mapUser.put("firstName", "Chewbacca");
        mapUser.put("lastName", "");
        mapUser.put("age", 200);
    }
}
