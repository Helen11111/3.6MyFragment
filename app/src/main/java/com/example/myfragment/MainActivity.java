package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    boolean status = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!status){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frame_layout, new FragmentA()).commit();
                    button.setText("Загрузка Фрагмент 2");
                    status = true;

                }
                else {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frame_layout, new FragmentB()).commit();
                    button.setText("Загрузка Фрагмент 1");
                    status = false;

                }
            }
        });
    }
}