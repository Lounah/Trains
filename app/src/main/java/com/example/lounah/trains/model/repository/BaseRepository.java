package com.example.lounah.trains.model.repository;

import java.util.Collection;

import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;


public interface BaseRepository<T> {

    void insert(T data);

    void insertAll(Collection<T> data);

    void update();

    void deleteById(final int id);

    void deleteAll();

    Completable save(T data);

    Completable saveAll(Collection<T> data);

    Single<T> getByid(final int id);

    Observable<Collection<T>> getAllById(final int id);

    Single<T> getByIdFromLocal(final int id);

    Single<T> getByIdFromRemote(final int id);

    Observable<Collection<T>> getAllByIdFromLocal(final int id);

    Observable<Collection<T>> getAllByIdFromRemote(final int id);

}
