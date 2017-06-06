package com.example.rathana.mpvapp.login;

import com.example.rathana.mpvapp.entities.User;

/**
 * Created by ratha on 06-Jun-17.
 */

public class UserMemoryRepository implements UserRepository {

    private  User user;
    @Override
    public void saveUser(User user) {
        if(user==null){
            this.user=new User("Mey","Mey");
            this.user.setUserId(1);
        }

        this.user=user;
    }

    @Override
    public User getUser() {

        if(this.user!=null){
            return this.user;

        }else{
            this.user=new User("Mey","Mey");
            this.user.setUserId(1);
            return this.user;
        }
    }
}
