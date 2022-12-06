package com.example.quranfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Ayat;
    EditText ParahNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ayat=findViewById(R.id.ayatText);
        ParahNum=findViewById(R.id.parahTextfield);

    }
}