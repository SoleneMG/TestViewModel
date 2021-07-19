package com.example.testviewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView count;
    //todo jaune // pas tapay
    private final ViewModel viewModel = new ViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.count);
        count.setText(String.valueOf(viewModel.getResultCountIncremented()));
    }

    public void onClickIncrementButton(View view) {
        //todo plutot que de récupérer la valeur de l'affichage, créé une variable dans ton viewmodel, c'est elle qui sera envoyée à l'affichage
        viewModel.increment();
        count.setText(String.valueOf(viewModel.getResultCountIncremented()));

    }
}