package com.ermolnik.perfectandroid.mappers;

import com.ermolnik.perfectandroid.db.userinfo.UserEntity;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import javax.inject.Inject;

public class UserEntityJsonMapper {

    private final Gson gson;

    @Inject
    public UserEntityJsonMapper() {
        gson = new Gson();
    }

    public UserEntity transformUserEntity(String teamJsonResponse) throws JsonSyntaxException {
        UserEntity teamEntity;
        try {
            Type typeTeamEntity = new TypeToken<UserEntity>() {
            }.getType();
            teamEntity = this.gson.fromJson(teamJsonResponse, typeTeamEntity);
            return teamEntity;
        } catch (JsonSyntaxException exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    public List<UserEntity> transformUserEntityCollection(String userListJsonResponse)
            throws JsonSyntaxException {
        List<UserEntity> teamEntityList;
        try {
            Type typeTeamEntityList = new TypeToken<List<UserEntity>>() {
            }.getType();
            teamEntityList = this.gson.fromJson(userListJsonResponse, typeTeamEntityList);
            return teamEntityList;
        } catch (JsonSyntaxException exception) {
            exception.printStackTrace();
            throw exception;
        }
    }
}
