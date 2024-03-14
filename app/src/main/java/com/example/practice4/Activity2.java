package com.example.practice4;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView act2_surname_name, act2_object;
    private Button act2_objectinf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        init();
        Bundle bundle = getIntent().getExtras();
        act2_surname_name.setText(bundle.get("surname").toString() + " " + bundle.get("name").toString());
        ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult
                (new ActivityResultContracts.StartActivityForResult(),
                        new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {
                        if(o.getResultCode() == Activity.RESULT_OK)
                        {
                            Intent intent = o.getData();
                            String accedMessage = intent.getStringExtra("object");
                            act2_object.setText(accedMessage);
                        }
                        else {
                            act2_object.setText("Ошибка");
                        }
                    }
                });
        act2_objectinf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, Activity3.class);
                mStartForResult.launch(intent);
            }
        });
    }
    private void init(){
        act2_surname_name = findViewById(R.id.act2_surname_name);
        act2_object = findViewById(R.id.act2_object);
        act2_objectinf = findViewById(R.id.act2_objectinf);
    }
}