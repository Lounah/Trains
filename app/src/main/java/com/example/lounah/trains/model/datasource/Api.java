package com.example.lounah.trains.model.datasource;

import com.example.lounah.trains.model.entity.Something;

import java.util.Collection;

import io.reactivex.Observable;
import io.reactivex.Single;

public interface Api {

    Single<Something> getById(final int id);

    Observable<Collection<Something>> getAllById(final int id);

}
