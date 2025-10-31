package com.example.qn9;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class List extends AppCompatActivity {
    Dbhelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.list);

        db = new Dbhelper(this);

        TextView text = findViewById(R.id.textView3);
        Button btn = findViewById(R.id.button6);
        btn.setOnClickListener(v->
        {
            String data = db.readData();
            text.setText(data);
        });

    }
}