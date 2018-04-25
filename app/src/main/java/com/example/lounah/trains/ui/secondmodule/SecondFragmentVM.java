package com.example.lounah.trains.ui.secondmodule;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import com.example.lounah.trains.model.entity.Something;
import com.example.lounah.trains.model.repository.SomethingRepository;

public class SecondFragmentVM extends ViewModel {

    private MutableLiveData<Something> something;

    private final SomethingRepository repository;

    public SecondFragmentVM(@NonNull final SomethingRepository repository) {
        this.repository = repository;
    }

    public void getSomething() {
        if (something == null) {
            something = new MutableLiveData<>();
        }
    }

}
