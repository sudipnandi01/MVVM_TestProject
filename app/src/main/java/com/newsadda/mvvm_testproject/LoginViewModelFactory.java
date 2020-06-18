package com.newsadda.mvvm_testproject;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.newsadda.mvvm_testproject.model.User;
import com.newsadda.mvvm_testproject.viewmodels.LoginViewModel;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory{

    private Context context;
    private User user;

    public LoginViewModelFactory(Context context, User user) {

        this.context = context;
        this.user = user;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new LoginViewModel(user,context);
    }
}
