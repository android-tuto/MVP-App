package com.example.rathana.mpvapp.home;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ratha on 06-Jun-17.
 */

@Module
public class MainActivityModule {


    @Provides
    public MainActivityMVP.Presenter provideMainActivityPresenter(MainActivityMVP.Model model){
        return new MainActivityPresenter(model);
    }


    @Provides
    MainActivityMVP.Model provideMainActivityModel(){
        return new MainActivityModel();
    }
}
