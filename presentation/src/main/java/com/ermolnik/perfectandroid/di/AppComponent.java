package com.ermolnik.perfectandroid.di;


import android.content.Context;

import com.ermolnik.perfectandroid.di.modules.DataModule;
import com.ermolnik.perfectandroid.di.modules.DatabaseModule;
import com.ermolnik.perfectandroid.di.modules.NetworkModule;
import com.ermolnik.perfectandroid.ui.AppActivity;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        DataModule.class,
        DatabaseModule.class,
        NetworkModule.class})

public interface AppComponent {

    @Component.Builder
    interface Builder {

        AppComponent build();

        @BindsInstance
        Builder with(final Context context);
    }

    void inject(AppActivity activity);

}
