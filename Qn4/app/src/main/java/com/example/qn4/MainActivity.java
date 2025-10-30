package com.example.qn4;

import android.os.Bundle;
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

        Button add = findViewById(R.id.btnSum);
        Button sub =  findViewById(R.id.button2);
        Button mul =  findViewById(R.id.button3);
        Button div =  findViewById(R.id.button4);
        EditText num1 = findViewById(R.id.editTextText);
        EditText num2 = findViewById(R.id.editTextText2);
        TextView textView = findViewById(R.id.textView);

        add.setOnClickListener(v->{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            int c = n1+n2;
            textView.setText(String.valueOf(c));
        });
        sub.setOnClickListener(v->{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            int c = n1-n2;
            textView.setText(String.valueOf(c));
        });
        mul.setOnClickListener(v->{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            int c = n1*n2;
            textView.setText(String.valueOf(c));
        });
        div.setOnClickListener(v->{
            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());
            int c = n1/n2;
            textView.setText(String.valueOf(c));
        });
    }
}