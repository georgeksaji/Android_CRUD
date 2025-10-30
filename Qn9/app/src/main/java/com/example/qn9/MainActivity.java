package com.example.qn9;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.editTextText);
        EditText editText2 = findViewById(R.id.editTextText2);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(v->
        {
            try {
                int e1 = Integer.parseInt(editText1.getText().toString());
                String e2 = editText2.getText().toString();

                Intent intent  = new Intent(MainActivity.this,HomeActivity.class);
//                intent.putExtra("AGE", e1);
//                intent.putExtra("NAME", e2);
                startActivity(intent);
            } catch (NumberFormatException e) {
                Toast.makeText(MainActivity.this, "Please enter a valid age", Toast.LENGTH_SHORT).show();
            }
        });

    }
}