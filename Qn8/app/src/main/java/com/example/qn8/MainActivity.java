package com.example.qn8;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.toast);

        button1.setOnClickListener(v->
        {
            Toast.makeText(this, "This is a toast alert", Toast.LENGTH_LONG).show();
        });

        Button button2 = findViewById(R.id.alert);

        button2.setOnClickListener(v->
        {
            new AlertDialog.Builder(this)
                    .setTitle("Alert")
                    .setMessage("This is a alert")
                    .setPositiveButton("Ok",(d,w)->{
                        Toast.makeText(this, "You Clicked Ok", Toast.LENGTH_SHORT).show();})
                    .setNegativeButton("Cancel",(d,w)->{
                        Toast.makeText(this, "You selected Cancel", Toast.LENGTH_SHORT).show();
                    }).show();
        });
    }
}