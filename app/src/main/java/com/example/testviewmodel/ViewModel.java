package com.example.testviewmodel;

public class ViewModel {
    private static int resultCountIncremented;

    public void increment(int i){
        resultCountIncremented = i+1;
    }

    public int getResultCountIncremented() {
        return resultCountIncremented;
    }
}
