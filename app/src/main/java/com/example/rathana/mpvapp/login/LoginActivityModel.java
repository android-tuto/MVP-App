package com.example.rathana.mpvapp.login;

import com.example.rathana.mpvapp.entities.User;

/**
 * Created by ratha on 06-Jun-17.
 */

public class LoginActivityModel implements  LoginActivityMVP.Model{

    private UserRepository repositoty;

    public LoginActivityModel(UserRepository repositoty) {
        this.repositoty = repositoty;
    }

    @Override
    public void saveUser(User user) {
        repositoty.saveUser(user);
    }

    @Override
    public User getUser() {
        return repositoty.getUser();
    }
}
