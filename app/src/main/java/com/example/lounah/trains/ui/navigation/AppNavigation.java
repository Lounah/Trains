package com.example.lounah.trains.ui.navigation;


public interface AppNavigation {

    void navigateToFirstFragment();

    void navigateToSecondFragment();

    void navigateToSecondNestedFragment(String... args);

    void navigateToThirdFragment();

    int getBackStackCount();

    void navigateBack();

    void popBackStack();
}
