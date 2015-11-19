package com.academy.android.databindingworkshop.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class PlainUser {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
}
