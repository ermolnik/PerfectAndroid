package com.ermolnik.perfectandroid.db.userinfo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

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