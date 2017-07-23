package com.Pedrum.StoryFinderFinale.application;

import android.app.Application;
import android.content.Context;

/**
 *   Created by Pedrum Aghamir on 7/21/2017
 */
public class G extends Application {
    public static final String API_URL = "https://api.meetup.com/";
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
