package com.newsadda.mvvm_testproject.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.newsadda.mvvm_testproject.model.AdapterUser;

import java.util.ArrayList;

public class RecyclerViewModel extends ViewModel {

    MutableLiveData<ArrayList<AdapterUser>> userLiveData;
    ArrayList<AdapterUser> userArrayList;

    public RecyclerViewModel() {
        userLiveData = new MutableLiveData<>();

        // call your Rest API in init method
        init();
    }

    public MutableLiveData<ArrayList<AdapterUser>> getUserMutableLiveData() {
        return userLiveData;
    }

    public void init(){
        populateList();
        userLiveData.setValue(userArrayList);
    }

    public void populateList(){

        AdapterUser user = new AdapterUser();
        user.setTitle("Darknight");
        user.setDescription("Best rating movie");

        userArrayList = new ArrayList<>();
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
        userArrayList.add(user);
    }
}
