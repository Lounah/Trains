package com.example.lounah.trains.model.datasource.remote;

import com.example.lounah.trains.model.datasource.Api;
import com.example.lounah.trains.model.entity.Something;

import java.util.Collection;

import io.reactivex.Observable;
import io.reactivex.Single;

public class FirebaseApi implements Api {
    @Override
    public Single<Something> getById(int id) {
        return null;
    }

    @Override
    public Observable<Collection<Something>> getAllById(int id) {
        return null;
    }
}
