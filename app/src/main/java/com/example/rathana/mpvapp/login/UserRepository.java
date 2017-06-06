package com.example.rathana.mpvapp.login;

import com.example.rathana.mpvapp.entities.User;

/**
 * Created by ratha on 06-Jun-17.
 */

public interface UserRepository {

    void saveUser(User use);
    User getUser();
}
