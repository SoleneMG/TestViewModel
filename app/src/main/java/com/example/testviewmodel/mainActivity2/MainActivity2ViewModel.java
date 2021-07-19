package com.example.testviewmodel.mainActivity2;

import androidx.lifecycle.ViewModel;

public class MainActivity2ViewModel extends ViewModel {
    private int resultCountIncremented;

    public void increment(){
        resultCountIncremented++;
    }

    public int getResultCountIncremented() {
        return resultCountIncremented;
    }
}