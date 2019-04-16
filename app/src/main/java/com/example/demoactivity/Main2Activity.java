package com.example.demoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = findViewById(R.id.textView1);

        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        tv1.setText("You are " + info[0] + " , age " + info[1]);
    }
}
