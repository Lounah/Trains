package com.example.lounah.trains.di;

import com.example.lounah.trains.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = {FragmentBindingModule.class})
    abstract MainActivity mainActivity();
}
