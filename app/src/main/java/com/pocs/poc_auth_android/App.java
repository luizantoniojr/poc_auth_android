package com.pocs.poc_auth_android;

import android.app.Application;

import net.openid.appauth.AuthState;

public class App extends Application {

    public static String Token;

    private SharedPreferencesRepository mSharedPrefRep;

    @Override
    public void onCreate() {
        super.onCreate();

        mSharedPrefRep = new SharedPreferencesRepository(this);

        AuthState authState = mSharedPrefRep.getAuthState();
        if(authState != null)
            Token = authState.getIdToken();
    }
}
