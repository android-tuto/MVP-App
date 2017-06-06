package com.example.rathana.mpvapp.login;

import com.example.rathana.mpvapp.entities.User;

/**
 * Created by ratha on 06-Jun-17.
 */

public interface LoginActivityMVP {

    interface View{

        void setUserName(String name);
        void setUserPassword(String password);

        String getUserName();
        String getUserPassword();

        void showLoginInputError();
        void showMessage();
        void showUserIsNotAvailable();
    }

    interface Presenter{

        void setView(LoginActivityMVP.View view);
        void loginButtonClicked();
        void getCurrentUser();
    }

    interface Model{

        void saveUser(User user);
        User getUser();

    }
}
