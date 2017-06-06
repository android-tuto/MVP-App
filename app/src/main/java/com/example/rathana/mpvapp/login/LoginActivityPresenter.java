package com.example.rathana.mpvapp.login;

import android.support.annotation.Nullable;

import com.example.rathana.mpvapp.entities.User;

/**
 * Created by ratha on 06-Jun-17.
 */

public class LoginActivityPresenter implements LoginActivityMVP.Presenter{

    @Nullable
    private LoginActivityMVP.View view;
    private LoginActivityMVP.Model model;


    public LoginActivityPresenter(LoginActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(LoginActivityMVP.View view) {
        this.view=view;
    }

    @Override
    public void loginButtonClicked() {
        if(this.view!=null){
            if(this.view.getUserName().trim().equals("") || this.view.getUserPassword().trim().equals("")){
                view.showLoginInputError();
            }else{
                User user=new User(view.getUserName(),view.getUserPassword());
                user.setUserId(2);
                model.saveUser(user);
                view.showMessage();
            }
        }
    }

    @Override
    public void getCurrentUser() {
        if(model.getUser()!=null){
            User user=model.getUser();
            if(view !=null){
                view.setUserName(user.getUserName());
                view.setUserPassword(user.getUserPassword());
            }else{

                if(view!=null){
                    view.showUserIsNotAvailable();
                }
            }

        }
    }
}
