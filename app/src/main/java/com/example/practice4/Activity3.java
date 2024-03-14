package com.example.practice4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    private EditText act3_day, act3_time, act3_com;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        init();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(act3_time.getText()== null || act3_day.getText() == null)
                {
                    Toast.makeText(Activity3.this, "Введите день и время", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent();
                    intent.putExtra("object", act3_day.getText().toString()+ " " + act3_time.getText().toString() + " '" + act3_com.getText().toString()+"'");
                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });
    }
    private void init()
    {
        act3_day = findViewById(R.id.act3_day);
        act3_time = findViewById(R.id.act3_time);
        act3_com = findViewById(R.id.act3_com);
        button = findViewById(R.id.button);
    }
}