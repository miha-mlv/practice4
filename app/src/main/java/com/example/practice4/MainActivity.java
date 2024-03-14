package com.example.practice4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText main_surname, main_name;
    private Button main_next_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        main_next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(main_surname.getText() == null || main_name.getText() == null)
                {
                    Toast.makeText(MainActivity.this, "Введите имя и фамилию", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("surname", main_surname.getText().toString());
                    intent.putExtra("name", main_name.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    private void init()
    {
        main_surname = findViewById(R.id.main_surname);
        main_name = findViewById(R.id.main_name);
        main_next_btn = findViewById(R.id.main_next_btn);
    }
}