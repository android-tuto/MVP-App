package com.example.rathana.mpvapp.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ratha on 06-Jun-17.
 */

@Module
public class LoginModule {


    @Provides
    public LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model provideLoginActivityModel(UserRepository repository){
        return new LoginActivityModel(repository);
    }

    @Provides
    public UserRepository provideUserRepository(){
        return new UserMemoryRepository();
    }


}
