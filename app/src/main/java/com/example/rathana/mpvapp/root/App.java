package com.example.rathana.mpvapp.root;

import android.app.Application;

import com.example.rathana.mpvapp.home.MainActivityModule;
import com.example.rathana.mpvapp.login.LoginModule;

/**
 * Created by ratha on 31-May-17.
 */

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .mainActivityModule(new MainActivityModule())
                .loginModule(new LoginModule())
                .build();

    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
