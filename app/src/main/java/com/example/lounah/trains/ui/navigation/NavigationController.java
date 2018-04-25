package com.example.lounah.trains.ui.navigation;


import android.support.v4.app.FragmentManager;

import com.example.lounah.trains.MainActivity;
import com.example.lounah.trains.R;
import com.example.lounah.trains.di.ActivityScoped;
import com.example.lounah.trains.ui.firstmodule.FirstFragment;
import com.example.lounah.trains.ui.secondmodule.SecondFragment;
import com.example.lounah.trains.ui.secondmodule.secondnested.SecondNestedFragment;
import com.example.lounah.trains.ui.thirdmodule.ThirdFragment;

import javax.inject.Inject;
import javax.inject.Singleton;

public class NavigationController implements AppNavigation {

    private static final int CONTAINER_ID = R.id.fragment_container;

    private static final String FIRST_FRAGMENT_TAG = "FIRST_FRAGMENT";
    private static final String SECOND_FRAGMENT_TAG = "SECOND_FRAGMENT";
    private static final String SECOND_NESTED_FRAGMENT_TAG = "SECOND_NESTED_FRAGMENT";
    private static final String THIRD_FRAGMENT_TAG = "THIRD_FRAGMENT";

    private final FragmentManager mFragmentManager;

    @Inject
    NavigationController(MainActivity activity) {
        mFragmentManager = activity.getSupportFragmentManager();
    }


    @Override
    public void navigateToFirstFragment() {
        mFragmentManager.beginTransaction()
                .replace(CONTAINER_ID, FirstFragment.newInstance(), FIRST_FRAGMENT_TAG)
                .commit();
    }

    @Override
    public void navigateToSecondFragment() {
        mFragmentManager.beginTransaction()
                .replace(CONTAINER_ID, SecondFragment.newInstance(), SECOND_FRAGMENT_TAG)
                .commit();
    }

    @Override
    public void navigateToSecondNestedFragment(String... args) {
        mFragmentManager.beginTransaction()
                .replace(CONTAINER_ID, SecondNestedFragment.newInstance(args), SECOND_NESTED_FRAGMENT_TAG)
                .addToBackStack(SECOND_NESTED_FRAGMENT_TAG)
                .commit();
    }

    @Override
    public void navigateToThirdFragment() {
        mFragmentManager.beginTransaction()
                .replace(CONTAINER_ID, ThirdFragment.newInstance(), THIRD_FRAGMENT_TAG)
                .commit();
    }

    @Override
    public int getBackStackCount() {
        return mFragmentManager.getBackStackEntryCount();
    }

    @Override
    public void navigateBack() {
        mFragmentManager.popBackStack();
    }

    @Override
    public void popBackStack() {
        mFragmentManager.popBackStack();
    }


}
