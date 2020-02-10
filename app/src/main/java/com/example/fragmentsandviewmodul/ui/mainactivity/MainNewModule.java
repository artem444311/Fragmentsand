package com.example.fragmentsandviewmodul.ui.mainactivity;

import java.lang.invoke.MutableCallSite;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainNewModule extends ViewModel {
    public MutableLiveData<Integer> count = new MutableLiveData<>();

    public void getCount(String s) {
        count.postValue(s.length());
    }

}

