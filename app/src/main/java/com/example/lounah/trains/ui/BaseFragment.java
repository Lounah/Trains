package com.example.lounah.trains.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;


import dagger.android.support.DaggerFragment;

public abstract class BaseFragment extends DaggerFragment {

    protected abstract void setupToolbar(@NonNull final Toolbar toolbar);

}
