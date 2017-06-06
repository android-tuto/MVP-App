package com.example.rathana.mpvapp.root;

import com.example.rathana.mpvapp.home.MainActivity;
import com.example.rathana.mpvapp.home.MainActivityModule;
import com.example.rathana.mpvapp.login.LoginActivity;
import com.example.rathana.mpvapp.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ratha on 31-May-17.
 */

@Singleton
@Component(modules = {ApplicationModule.class, MainActivityModule.class, LoginModule.class})
public interface  ApplicationComponent {

    void inject(MainActivity target);
    void inject(LoginActivity target);

}
