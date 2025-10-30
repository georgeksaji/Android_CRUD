package com.example.qn2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
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

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input1 = findViewById(R.id.editTextText1);
                EditText input2 = findViewById(R.id.editTextText2);
                TextView textView = findViewById(R.id.textView);
                int num1 = Integer.parseInt(input1.getText().toString());
                int num2 = Integer.parseInt(input2.getText().toString());
                int sum = num1 + num2;
                textView.setText(String.valueOf(sum));

            }
        });
    }
}