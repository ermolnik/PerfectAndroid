package com.ermolnik.perfectandroid;

import android.app.Application;

import com.ermolnik.perfectandroid.di.AppComponent;
import com.ermolnik.perfectandroid.di.DaggerAppComponent;

public class App extends Application {
    private static App app;

    private AppComponent appComponent;

    public static App getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        appComponent = DaggerAppComponent.builder()
                .with(getApplicationContext())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
