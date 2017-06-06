package com.example.rathana.mpvapp.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rathana.mpvapp.R;
import com.example.rathana.mpvapp.login.LoginActivity;
import com.example.rathana.mpvapp.root.App;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainActivityMVP.View{

    @Inject
    MainActivityMVP.Presenter presenter;

    @BindView(R.id.btn_go_to_login)
    Button btnGoToLoginScreen;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);

        //btnGoToLoginScreen= (Button) findViewById(R.id.btn_go_to_login);
       ButterKnife.bind(this);
        btnGoToLoginScreen.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               presenter.goToLoginScreenClicked();
            }
        });
    }


    /*
     * Start MVP View
     */

    @Override
    public void startLoginActivity() {
        Intent intent=new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    /*
    * End MVP View
    */


    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
    }
}
