package com.ermolnik.perfectandroid.repository;

import com.ermolnik.perfectandroid.models.UserModel;

import java.util.List;

import io.reactivex.Flowable;

public interface MainRepository {

    UserModel getMockedUser();

    Flowable<List<UserModel>> getUsers(int count);

}
