package com.example.testviewmodel;

public class ViewModel {
    private static int resultCountIncremented;

    public void increment(){
        resultCountIncremented++;
    }

    public int getResultCountIncremented() {
        return resultCountIncremented;
    }
}
