package com.example.assignmenr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.editTextTextPersonName);
        EditText mssv = findViewById(R.id.editTextTextPersonName2);
        EditText birth = findViewById(R.id.editTextTextPersonName3);
        EditText sex = findViewById(R.id.editTextTextPersonName4);
        EditText address = findViewById(R.id.editTextTextPersonName5);
        EditText phone = findViewById(R.id.editTextNumber);
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        CheckBox thethao = findViewById(R.id.checkBox);
        CheckBox dulich = findViewById(R.id.checkBox2);
        CheckBox amnhac = findViewById(R.id.checkBox3);
        Button submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().length() == 0 || mssv.getText().toString().length() == 0 || birth.getText().toString().length() == 0 || email.getText().toString().length() == 0) {
                   Toast toast = Toast.makeText(MainActivity.this, "Thieu thong tin", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
}