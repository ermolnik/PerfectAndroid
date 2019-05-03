package com.ermolnik.perfectandroid.di.modules;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.ermolnik.perfectandroid.db.MainDatabase;
import com.ermolnik.perfectandroid.db.userinfo.UserDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public final class DatabaseModule {

    private static final String DB_NAME = "user_db";

    @Singleton
    @Provides
    MainDatabase provideMovieDatabase(final Context context) {
        return Room.databaseBuilder(context, MainDatabase.class, DB_NAME).build();
    }


    @Singleton
    @Provides
    UserDao provideMoviesDao(final MainDatabase database) {
        return database.userDao();
    }

}
