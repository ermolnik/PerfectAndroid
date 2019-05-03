package com.ermolnik.perfectandroid.repository;

import com.ermolnik.perfectandroid.db.userinfo.UserDao;
import com.ermolnik.perfectandroid.mappers.UserModelToEntityMapper;
import com.ermolnik.perfectandroid.models.UserModel;
import com.ermolnik.perfectandroid.net.ApiService;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;

@Singleton
public final class MainRepositoryImpl implements MainRepository {

    private final UserDao userDao;
    private final ApiService apiService;
    private final UserModelToEntityMapper modelEntityMapper;

    @Inject
    public MainRepositoryImpl(UserDao userDao,
                              ApiService apiService,
                              UserModelToEntityMapper modelEntityMapper) {
        this.userDao = userDao;
        this.apiService = apiService;
        this.modelEntityMapper = modelEntityMapper;
    }

    @Override
    public UserModel getMockedUser() {
        return new UserModel(1, "Sergei", "Ermolaev");
    }

    @Override
    public Flowable<List<UserModel>> getUsers(int count) {
        return userDao.getAll().subscribeOn(Schedulers.io()).map(modelEntityMapper::reverseMap);
    }

}
