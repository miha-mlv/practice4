package com.example.practice4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;
    private FragmentTransaction fragmentTransaction;
    FirstFragment fragment1;
    SecondFragment fragment2;
    ThirdFragment fragment3;
    private Button button_1, button_2, button_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
        fragment1 = new FirstFragment();
        fragment2 = new SecondFragment();
        fragment3 = new ThirdFragment();
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment1, "fragment1").commit();
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment2, "fragment2").commit();
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment3, "fragment3").commit();
            }
        });

//        manager = getSupportFragmentManager();
//        fragmentTransaction = manager.beginTransaction();
//        fragmentTransaction.add(R.id.frame_second_fragment, new SecondFragment(), null);
//        fragmentTransaction.commit();

    }
}