package com.ermolnik.perfectandroid.mappers;

import com.ermolnik.perfectandroid.db.userinfo.UserEntity;
import com.ermolnik.perfectandroid.models.UserModel;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class UserModelToEntityMapper extends Mapper<UserModel, UserEntity> {

    @Inject
    public UserModelToEntityMapper() {
    }

    @Override
    public UserEntity map(UserModel value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public UserModel reverseMap(UserEntity value) {
        UserModel user = new UserModel(1, "Sergei", "Ermolaev");
        return user;
    }
}
