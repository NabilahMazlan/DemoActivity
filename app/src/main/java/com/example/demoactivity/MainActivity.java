package com.example.demoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText etName, etAge;
    Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.editTextName);
        etAge = findViewById(R.id.editTextAge);
        btnDone = findViewById(R.id.buttonDone);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringEtName = etName.getText().toString();
                String stringEtAge = etAge.getText().toString();

                String[] info = {stringEtName, stringEtAge};

                Intent intent = new Intent(MainActivity.this, Main2Activity.class );

                intent.putExtra("info", info);

                startActivity(intent);
            }
        });
    }
}
