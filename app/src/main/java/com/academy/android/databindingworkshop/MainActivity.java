package com.academy.android.databindingworkshop;

import com.academy.android.databindingworkshop.examples.BasicActivity;
import com.academy.android.databindingworkshop.examples.CollectionActivity;
import com.academy.android.databindingworkshop.examples.CustomBindingActivity;
import com.academy.android.databindingworkshop.examples.DynamicActivity;
import com.academy.android.databindingworkshop.examples.IncludeActivity;
import com.academy.android.databindingworkshop.examples.ObservableActivity;
import com.academy.android.databindingworkshop.examples.ResourceActivity;
import com.academy.android.databindingworkshop.examples.ViewStubActivity;
import com.academy.android.databindingworkshop.examples.ViewWithIDsActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openBasic(View view) {
        startActivity(new Intent(this, BasicActivity.class));
    }

    public void openCustomBinding(View view) {
        startActivity(new Intent(this, CustomBindingActivity.class));
    }

    public void openIncludes(View view) {
        startActivity(new Intent(this, IncludeActivity.class));
    }

    public void openCollections(View view) {
        startActivity(new Intent(this, CollectionActivity.class));
    }

    public void openResources(View view) {
        startActivity(new Intent(this, ResourceActivity.class));
    }

    public void openObservable(View view) {
        startActivity(new Intent(this, ObservableActivity.class));
    }

    public void openViewWithIDs(View view) {
        startActivity(new Intent(this, ViewWithIDsActivity.class));
    }

    public void openViewStub(View view) {
        startActivity(new Intent(this, ViewStubActivity.class));
    }

    public void openDynamicVariables(View view) {
        startActivity(new Intent(this, DynamicActivity.class));
    }

}
