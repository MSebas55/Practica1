package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.test.database.DatabaseAux;

public class Update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
    }

    void showElements() {
        SQLiteDatabase db = new DatabaseAux(this).getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM users", null);
        LinearLayout layout = findViewById(R.id.fillContentShow);

        if (cursor.moveToFirst()) {
            do {
                String name = cursor.getString(1);
                String email = cursor.getString(2);

                TextView data = new TextView(this);
                data.setText("Nombre: " + name + " Email: "+ email);
                layout.addView(data);

            }while(cursor.moveToNext());
        }

        db.close();
    }
    public void changeToMain(View view) {
        Intent nIntent = new Intent(Update.this, MainActivity.class);
        startActivity(nIntent);
    }
}