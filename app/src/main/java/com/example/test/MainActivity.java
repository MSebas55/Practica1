package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonTest = findViewById(R.id.buttonTest);
        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Iepale", Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonNoAnom = findViewById(R.id.buttonNoAnom);
    }
    public void diceAdios(View view) {
        Toast.makeText(view.getContext(), "Adios", Toast.LENGTH_SHORT).show();
    }

    public void changeToInsert(View view) {
        Intent nIntent = new Intent(MainActivity.this, InsertToDB.class);
        startActivity(nIntent);
    }
}

