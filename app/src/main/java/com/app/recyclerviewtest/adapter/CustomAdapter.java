package com.app.recyclerviewtest.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.app.mvvmtestlist.R;
import com.app.mvvmtestlist.databinding.FruitBinding;
import com.app.recyclerviewtest.command.ClickEventListner;
import com.app.recyclerviewtest.model.FruitsData;
import com.app.recyclerviewtest.viewmodel.FriutViewModel;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomView> {

    List<FriutViewModel> fruitsDataList;

    LayoutInflater layoutInflater;
    Activity activity;

    public CustomAdapter(Activity activity, List<FriutViewModel> fruitsDataList){
        this.fruitsDataList = fruitsDataList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public CustomView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_recylerview,viewGroup, false);

        if(layoutInflater == null){
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }

        final FruitBinding fruitBinding = FruitBinding.inflate(layoutInflater);

        fruitBinding.setClickOnItem(new ClickEventListner() {
            @Override
            public void onListItemtClick() {
                Toast.makeText(activity,"=="+fruitBinding.getFruitview().name,Toast.LENGTH_SHORT).show();
            }
        });

        return new CustomView(fruitBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomView customView, int i) {

        /*FruitsData fruitsData = fruitsDataList.get(i);
        customView.tv_title.setText(fruitsData.getName());*/

        FriutViewModel friutViewModel = fruitsDataList.get(i);
        customView.bind(friutViewModel);




    }

    @Override
    public int getItemCount() {
        return fruitsDataList.size();
    }

    public class CustomView extends RecyclerView.ViewHolder{


        FruitBinding fruitBinding;
       // TextView tv_title, tv_desc;

        public CustomView(FruitBinding fruitBinding) {
            super(fruitBinding.getRoot());
            /*tv_desc = (TextView)itemView.findViewById(R.id.tv_desc);
            tv_title = (TextView)itemView.findViewById(R.id.tv_title);*/

            this.fruitBinding = fruitBinding;

        }


        public void bind(FriutViewModel friutViewModel){

            this.fruitBinding.setFruitview(friutViewModel);


        }

        public FruitBinding getFruitBinding(){

            return fruitBinding;
        }
    }
}
