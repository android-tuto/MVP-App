package com.example.rathana.mpvapp.home;

/**
 * Created by ratha on 06-Jun-17.
 */

public interface MainActivityMVP {

    interface View{
        void startLoginActivity();
    }

    interface Presenter{

        void setView(MainActivityMVP.View view);
        void goToLoginScreenClicked();
    }

    interface Model{

    }
}
