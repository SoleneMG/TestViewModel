package com.example.testviewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView count;
    private ViewModel viewModel = new ViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.count);
    }

    public void onClickIncrementButton(View view) {
        int countInt = Integer.parseInt((String) count.getText());
        int result = viewModel.increment(countInt);
        count.setText(String.valueOf(result));

    }
}