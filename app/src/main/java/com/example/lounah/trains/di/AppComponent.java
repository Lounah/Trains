package com.example.lounah.trains.di;


import android.app.Application;

import com.example.lounah.trains.TrainsApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        MainActivityModule.class,
        AndroidSupportInjectionModule.class,
        AndroidInjectionModule.class
})
public interface AppComponent extends AndroidInjector<TrainsApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
