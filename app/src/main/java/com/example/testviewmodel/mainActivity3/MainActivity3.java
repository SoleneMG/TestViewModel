package com.example.testviewmodel.mainActivity3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.testviewmodel.R;
import com.example.testviewmodel.mainActivity.MainActivity;
import com.example.testviewmodel.mainActivity.MainActivityViewModel;
import com.example.testviewmodel.mainActivity2.MainActivity2;
import com.example.testviewmodel.mainActivity2.MainActivity2ViewModel;

public class MainActivity3 extends AppCompatActivity {
    MainActivity3ViewModel viewModel;
    TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        count = findViewById(R.id.count);
        viewModel = new ViewModelProvider(this).get(MainActivity3ViewModel.class);
    }

    public void onClickStartAnotherActivity(View view) {
        Button button = (Button) view;
        Intent intent;
        switch (button.getId()) {
            case R.id.button1:
                intent = new Intent(this, MainActivity.class);
                break;
            case R.id.button2:
                intent = new Intent(this, MainActivity2.class);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + button.getId());
        }
        startActivity(intent);
    }

    public void onClickIncrementButton(View view) {
        viewModel.increment();
        count.setText(String.valueOf(viewModel.getResultCountIncremented()));
    }

}