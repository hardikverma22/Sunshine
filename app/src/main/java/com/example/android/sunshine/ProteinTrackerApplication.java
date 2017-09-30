package com.example.android.sunshine;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by hp on 20-09-2017.
 */

public class ProteinTrackerApplication extends Application {
    @Override
    public void onCreate() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("username","Hardik");
        editor.commit();
        super.onCreate();
    }
}
