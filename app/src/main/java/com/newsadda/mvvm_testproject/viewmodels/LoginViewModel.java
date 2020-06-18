package com.newsadda.mvvm_testproject.viewmodels;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Toast;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.newsadda.mvvm_testproject.model.User;

public class LoginViewModel extends ViewModel {

    public MutableLiveData<String> email = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    private User user;
    private Context context;

    public LoginViewModel(User user, Context context) {
        this.user = user;
        this.context = context;
    }

    public void onSubmitClick() {

        user.setEmail(email.getValue());
        user.setPassword(password.getValue());

        if (user.isValidEmail()) {
            Toast.makeText(context,user.getEmail(),Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context,"Please enter valid email",Toast.LENGTH_SHORT).show();
        }

        if (user.isValidPassword()) {
            Toast.makeText(context,user.getPassword(),Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context,"Please enter valid email",Toast.LENGTH_SHORT).show();
        }
    }

}

