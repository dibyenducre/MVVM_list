package com.app.mvvmtestlist.model;

public class UserData {

    public String username, password;
    public String username_hint, password_hint;

    public UserData(String username_hint, String password_hint) {
        this.username_hint = username_hint;
        this.password_hint = password_hint;
    }

}
