package com.example.testviewmodel.mainActivity2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.testviewmodel.R;
import com.example.testviewmodel.mainActivity.MainActivity;
import com.example.testviewmodel.mainActivity3.MainActivity3;

public class MainActivity2 extends AppCompatActivity {
    MainActivity2ViewModel viewModel;
    TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        count = findViewById(R.id.count);
        viewModel = new ViewModelProvider(this).get(MainActivity2ViewModel.class);
    }

    public void onClickIncrementButton(View view) {
        viewModel.increment();
        count.setText(String.valueOf(viewModel.getResultCountIncremented()));
    }

    public void onClickStartAnotherActivity(View view) {
        Button button = (Button) view;
        Intent intent;
        switch (button.getId()){
            case R.id.button1 :
                intent = new Intent(this, MainActivity.class);
                break;
            case R.id.button3 :
                intent = new Intent(this, MainActivity3.class);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + button.getId());
        }
        startActivity(intent);
    }
}