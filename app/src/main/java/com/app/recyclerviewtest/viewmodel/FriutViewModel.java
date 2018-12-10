package com.app.recyclerviewtest.viewmodel;

import com.app.recyclerviewtest.model.FruitsData;

public class FriutViewModel {

    public String name, desc;

    public FriutViewModel(FruitsData fruitsData) {
        this.name = fruitsData.getName();
        this.desc = fruitsData.getDesc();
    }

    public FriutViewModel() {
    }
}
