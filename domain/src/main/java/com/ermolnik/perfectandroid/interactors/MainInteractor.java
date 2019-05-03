package com.ermolnik.perfectandroid.interactors;

import com.ermolnik.perfectandroid.models.UserModel;
import com.ermolnik.perfectandroid.repository.MainRepository;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MainInteractor {

    private final MainRepository mainRepository;

    @Inject
    public MainInteractor(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    public UserModel getMockedUser() {
        return mainRepository.getMockedUser();
    }
}
