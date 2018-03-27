package com.example.lounah.trains;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.lounah.trains.ui.navigation.NavigationController;


import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import timber.log.Timber;

public class MainActivity extends DaggerAppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawer;

    @BindView(R.id.nav_view)
    NavigationView mNavView;

    @Inject
    NavigationController mNavController;

    private ActionBarDrawerToggle toggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null)
            mNavController.navigateToFirstFragment();
            initUI();
    }

    private void initUI() {
        ButterKnife.bind(this);
        mNavView.setNavigationItemSelectedListener(this);
    }

    public void onUpdateToolbar(@NonNull final Toolbar toolbar) {

        setSupportActionBar(toolbar);

        toggle = new ActionBarDrawerToggle(
                this, mDrawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        mDrawer.addDrawerListener(toggle);
        toggle.syncState();

        if ((mNavController.getBackStackCount() > 0) &&
                (getSupportActionBar() != null) &&
                        (mNavController != null)) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                mDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
                toolbar.setNavigationOnClickListener(v -> onBackPressed());
        } else {
            mDrawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        }
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else if (mNavController.getBackStackCount() > 0)
            mNavController.navigateBack(); else super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        Timber.i("ON OPTIONS ITEM SELECTED");

        switch (id) {
            case R.id.action_settings:
                break;
            case android.R.id.home:

                Timber.i("ON OPTIONS ITEM SELECTED: HOME");
                onBackPressed();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_first_fragment:
                mNavController.navigateToFirstFragment();
                break;

            case R.id.nav_second_fragment:
                mNavController.navigateToSecondFragment();
                break;

            case R.id.nav_third_fragment:
                mNavController.navigateToThirdFragment();
                break;
        }
        mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onPause() {
        super.onPause();

        Timber.i("ON PAUSE");
    }

    @Override
    public void onStop() {
        super.onStop();

        Timber.i("ON STOP");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Timber.i("ON DESTROY");
    }




}
