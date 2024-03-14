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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
        FirstFragment fragment1 = new FirstFragment();
        fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment1, "fragment1");
        fragmentTransaction.commit();

//        manager = getSupportFragmentManager();
//        fragmentTransaction = manager.beginTransaction();
//        fragmentTransaction.add(R.id.frame_second_fragment, new SecondFragment(), null);
//        fragmentTransaction.commit();

    }
}