package com.example.testviewmodel.mainActivity;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int resultCountIncremented;

    public void increment(){
        resultCountIncremented++;
    }

    public int getResultCountIncremented() {
        return resultCountIncremented;
    }
}
