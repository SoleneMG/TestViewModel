package com.example.testviewmodel.mainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.testviewmodel.R;
import com.example.testviewmodel.mainActivity2.MainActivity2;
import com.example.testviewmodel.mainActivity3.MainActivity3;

public class MainActivity extends AppCompatActivity {
    private TextView count;
    private MainActivityViewModel viewModel;
    //todo jaune // pas tapay

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        count = findViewById(R.id.count);
        count.setText(String.valueOf(viewModel.getResultCountIncremented()));
    }

    public void onClickIncrementButton(View view) {
        //todo plutot que de récupérer la valeur de l'affichage, créé une variable dans ton viewmodel, c'est elle qui sera envoyée à l'affichage
        viewModel.increment();
        count.setText(String.valueOf(viewModel.getResultCountIncremented()));

    }

    public void onClickStartAnotherActivity(View view) {
        Button button = (Button) view;
        Intent intent;
        switch (button.getId()) {
            case R.id.button2:
                intent = new Intent(this, MainActivity2.class);
                break;
            case R.id.button3:
                intent = new Intent(this, MainActivity3.class);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + button.getId());
        }
        startActivity(intent);
    }
}