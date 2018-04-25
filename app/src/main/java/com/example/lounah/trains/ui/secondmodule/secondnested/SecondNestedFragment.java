package com.example.lounah.trains.ui.secondmodule.secondnested;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lounah.trains.MainActivity;
import com.example.lounah.trains.R;
import com.example.lounah.trains.ui.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

public class SecondNestedFragment extends BaseFragment {

    @BindView(R.id.second_nested_fragment_toolbar)
    Toolbar toolbar;

    public static SecondNestedFragment newInstance(String... args) {
        return new SecondNestedFragment();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Timber.i("ON ATTACH");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Timber.i("ON CREATE");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Timber.i("ON CREATE VIEW");

        View view = inflater.inflate(R.layout.fragment_second_nested, container, false);
        ButterKnife.bind(this, view);
        setupToolbar(toolbar);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Timber.i("ON ACTIVITY CREATED");
    }

    @Override
    public void onStart() {
        super.onStart();

        Timber.i("ON START");
    }

    @Override
    public void onResume() {
        super.onResume();

        Timber.i("ON RESUME");
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
    public void onDestroyView() {
        super.onDestroyView();

        Timber.i("ON DESTROY VIEW");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        toolbar = null;
        Timber.i("ON DESTROY");
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Timber.i("ON DETACH");
    }

    @Override
    protected void setupToolbar(@NonNull Toolbar toolbar) {
        ((MainActivity) getActivity()).onUpdateToolbar(toolbar);
    }

}
