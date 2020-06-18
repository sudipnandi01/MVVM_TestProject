package com.newsadda.mvvm_testproject.model;

import android.text.TextUtils;
import android.util.Patterns;

public class User {

    private String email;
    private String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValidEmail() {

        if (email != null && !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches() && email.length() > 5) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isValidPassword() {

        if (this.password != null&& !TextUtils.isEmpty(password) && password.length() > 4)
            return true;
        else
            return false;
    }
}
