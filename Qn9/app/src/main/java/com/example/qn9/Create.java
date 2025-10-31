package com.example.qn9;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Create extends AppCompatActivity {
    Dbhelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.create);

        db = new Dbhelper(this);
        Button btn = findViewById(R.id.button3);
        EditText et1 = findViewById(R.id.editTextNumber);
        EditText et2 = findViewById(R.id.editTextText4);


        btn.setOnClickListener(v->{
            int id = Integer.parseInt(et1.getText().toString().trim());
            String name = et2.getText().toString();

            if(id <= 0 || name.isEmpty())
            {
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();
                return;
            }
            if(db.insertStudent(id,name))
            {
                Toast.makeText(this, "Inserted", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Failed Insertion", Toast.LENGTH_SHORT).show();
            }
        });

    }
}