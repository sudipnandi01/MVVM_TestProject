package com.newsadda.mvvm_testproject.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.newsadda.mvvm_testproject.R;
import com.newsadda.mvvm_testproject.adapter.RecyclerViewAdapter;
import com.newsadda.mvvm_testproject.model.AdapterUser;
import com.newsadda.mvvm_testproject.viewmodels.RecyclerViewModel;
import java.util.ArrayList;

public class RecyclerviewActivity extends AppCompatActivity implements LifecycleOwner {

    RecyclerviewActivity context;
    RecyclerViewModel viewModel;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recyclerview);

        context = this;
        recyclerView = findViewById(R.id.rv_main);
        viewModel = ViewModelProviders.of(context).get(RecyclerViewModel.class);
        viewModel.getUserMutableLiveData().observe(context, userListUpdateObserver);
    }

    Observer<ArrayList<AdapterUser>> userListUpdateObserver = new Observer<ArrayList<AdapterUser>>() {
        @Override
        public void onChanged(ArrayList<AdapterUser> userArrayList) {
            recyclerViewAdapter = new RecyclerViewAdapter(context,userArrayList);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(recyclerViewAdapter);
        }
    };
}