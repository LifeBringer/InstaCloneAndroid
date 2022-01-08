package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("57MIIuNRMagyir7rjh2iGFPbzrj8iQPJ2oqdGUGr")
                .clientKey("8puVyqUzFjA9ERKJVtMhBq1tbRs3BstytJRX3aXW")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}