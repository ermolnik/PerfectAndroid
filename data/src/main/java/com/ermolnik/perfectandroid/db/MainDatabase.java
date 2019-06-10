package com.ermolnik.perfectandroid.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.ermolnik.perfectandroid.db.userinfo.UserDao;
import com.ermolnik.perfectandroid.db.userinfo.UserEntity;

@Database(entities = {UserEntity.class},
        version = 1,
        exportSchema = false)

public abstract class MainDatabase extends RoomDatabase {

    public abstract UserDao userDao();
}