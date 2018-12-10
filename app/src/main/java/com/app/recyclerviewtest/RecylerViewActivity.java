package com.app.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.app.mvvmtestlist.R;
import com.app.recyclerviewtest.adapter.CustomAdapter;
import com.app.recyclerviewtest.model.FruitsData;
import com.app.recyclerviewtest.viewmodel.FriutViewModel;

import java.util.ArrayList;
import java.util.List;

public class RecylerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    List<FriutViewModel> fruitsDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyler_view);

        for(int i = 0; i<20; i++){

            FruitsData data = new FruitsData();
            data.setName(i+". Title");
            data.setDesc(i+".Description");

            FriutViewModel friutViewModel = new FriutViewModel(data);
            //friutViewModel.name = (i+".Title");
            fruitsDataList.add(friutViewModel);

        }

        recyclerView = (RecyclerView)findViewById(R.id.recyler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new CustomAdapter(this,fruitsDataList);
        recyclerView.setAdapter(adapter);

    }


}
