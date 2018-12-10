package com.app.mvvmtestlist.modelview;

import android.databinding.BaseObservable;

import com.app.mvvmtestlist.R;
import com.app.mvvmtestlist.model.UserData;

public class UserModelView extends BaseObservable {

    public String username, password;
    public String username_hint, password_hint;
    UserData userData;
    /*public UserModelView(UserData userData) {
        this.username = userData.username;
    }
*/
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(R.id.ed_username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(R.id.ed_password);
    }

    public String getUsername_hint() {
        return username_hint;
    }

    public void setUsername_hint(String username_hint) {
        this.username_hint = username_hint;
    }

    public String getPassword_hint() {
        return password_hint;
    }

    public void setPassword_hint(String password_hint) {
        this.password_hint = password_hint;
    }
}
