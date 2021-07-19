package com.example.testviewmodel.mainActivity3;

import androidx.lifecycle.ViewModel;

public class MainActivity3ViewModel extends ViewModel {
    private int resultCountIncremented;

    public void increment(){
        resultCountIncremented++;
    }

    public int getResultCountIncremented() {
        return resultCountIncremented;
    }
}