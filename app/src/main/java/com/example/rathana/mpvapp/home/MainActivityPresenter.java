package com.example.rathana.mpvapp.home;

import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by ratha on 06-Jun-17.
 */

public class MainActivityPresenter implements MainActivityMVP.Presenter {

    @Nullable
    private  MainActivityMVP.View view;
    private MainActivityMVP.Model model;

    public MainActivityPresenter(MainActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void goToLoginScreenClicked() {
        if(this.view!=null){
           this.view.startLoginActivity();
        }

    }

    @Override
    public void setView(MainActivityMVP.View view) {
        this.view = view;
    }
}
