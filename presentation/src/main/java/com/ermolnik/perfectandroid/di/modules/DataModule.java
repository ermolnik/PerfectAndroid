package com.ermolnik.perfectandroid.di.modules;

import com.ermolnik.perfectandroid.repository.MainRepository;
import com.ermolnik.perfectandroid.repository.MainRepositoryImpl;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public interface DataModule {

    @Singleton
    @Binds
    MainRepository provideMainRepository(final MainRepositoryImpl repository);

}
