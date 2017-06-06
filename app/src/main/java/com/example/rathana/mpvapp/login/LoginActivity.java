package com.example.rathana.mpvapp.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rathana.mpvapp.R;
import com.example.rathana.mpvapp.root.App;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View{

    @Inject
    LoginActivityMVP.Presenter presenter;

    @BindView(R.id.txtUserName)EditText txtUserName;
    @BindView(R.id.txtUserPassword)EditText txtUserPassword;

    @OnClick(R.id.btnLogin) void loginButtonClicked(){
        presenter.loginButtonClicked();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //inject dagger module
        ((App) getApplication()).getComponent().inject(this);

        //butterKnife
        ButterKnife.bind(this);

        /*txtUserName= (EditText) findViewById(R.id.txtUserName);
        txtUserPassword= (EditText) findViewById(R.id.txtUserPassword);*/


        /*btnLogin= (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginButtonClicked();
            }
        });*/

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();

    }

    @Override
    public void setUserName(String name) {
        this.txtUserName.setText(name);
    }

    @Override
    public void setUserPassword(String password) {
        this.txtUserPassword.setText(password);
    }

    @Override
    public String getUserName() {
        return this.txtUserName.getText().toString();
    }

    @Override
    public String getUserPassword() {
        return this.txtUserPassword.getText().toString();
    }

    @Override
    public void showLoginInputError() {
        Toast.makeText(this, "user and password is not allow empty.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage() {
        Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserIsNotAvailable() {
        Toast.makeText(this, "user and password is not allow empty.", Toast.LENGTH_SHORT).show();
    }
}
