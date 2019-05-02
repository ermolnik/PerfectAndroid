package com.ermolnik.perfectandroid.db.userinfo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Maybe;

@Dao
public interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserEntity userInfoEntity);

    @Update
    void update(UserEntity userInfoEntity);

    @Query("DELETE FROM users")
    void deleteAllUsers();

    @Query("SELECT * FROM users")
    Flowable<List<UserEntity>> getAll();


    @Query("SELECT * FROM users WHERE id = :id")
    Maybe<UserEntity> getUserInfoById(int id);
}