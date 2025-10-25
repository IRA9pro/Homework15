package com.example.homework15;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MapKitFactory.setApiKey("7d90e4db-2e4d-4e64-ad3e-c2ad2052b6ce");
        MapKitFactory.initialize(this);
    }
}
