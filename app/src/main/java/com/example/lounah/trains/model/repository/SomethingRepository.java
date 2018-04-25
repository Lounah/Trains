package com.example.lounah.trains.model.repository;

import android.support.annotation.NonNull;

import com.example.lounah.trains.model.datasource.Api;
import com.example.lounah.trains.model.datasource.BaseDao;
import com.example.lounah.trains.model.datasource.local.SomethingDao;
import com.example.lounah.trains.model.entity.Something;

import java.util.Collection;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;

public class SomethingRepository implements BaseRepository<Something> {

    private final Api api;
    private final SomethingDao dao;

    public SomethingRepository(@NonNull final Api api, @NonNull final SomethingDao dao) {
        this.api = api;
        this.dao = dao;
    }

    @Override
    public void insert(Something data) {

    }

    @Override
    public void insertAll(Collection<Something> data) {

    }

    @Override
    public void update() {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Completable save(Something data) {
        return null;
    }

    @Override
    public Completable saveAll(Collection<Something> data) {
        return null;
    }

    @Override
    public Single<Something> getByid(int id) {
        return null;
    }

    @Override
    public Observable<Collection<Something>> getAllById(int id) {
        return null;
    }

    @Override
    public Single<Something> getByIdFromLocal(int id) {
        return null;
    }

    @Override
    public Single<Something> getByIdFromRemote(int id) {
        return null;
    }

    @Override
    public Observable<Collection<Something>> getAllByIdFromLocal(int id) {
        return null;
    }

    @Override
    public Observable<Collection<Something>> getAllByIdFromRemote(int id) {
        return null;
    }
}
