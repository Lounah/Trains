package com.example.lounah.trains.di;

import com.example.lounah.trains.MainActivity;
import com.example.lounah.trains.ui.firstmodule.FirstFragment;
import com.example.lounah.trains.ui.secondmodule.SecondFragment;
import com.example.lounah.trains.ui.secondmodule.secondnested.SecondNestedFragment;
import com.example.lounah.trains.ui.thirdmodule.ThirdFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module abstract class FragmentBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector
    abstract FirstFragment firstFragment();

    @ActivityScoped
    @ContributesAndroidInjector
    abstract SecondFragment secondFragment();

    @ActivityScoped
    @ContributesAndroidInjector
    abstract SecondNestedFragment secondNestedFragment();

    @ActivityScoped
    @ContributesAndroidInjector
    abstract ThirdFragment thirdFragment();
}
