package com.newsadda.mvvm_testproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import com.newsadda.mvvm_testproject.databinding.ActivityMainBinding;
import com.newsadda.mvvm_testproject.model.User;
import com.newsadda.mvvm_testproject.viewmodels.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.executePendingBindings();
        LoginViewModel loginViewModel = ViewModelProviders.of(this,new LoginViewModelFactory(this, new User())).get(LoginViewModel.class);
        binding.setViewModel(loginViewModel);
    }

}