package com.example.qn7;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    boolean trigger = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView2);

        btn.setOnClickListener(v->{
            if(trigger)
            {
                textView.setTextColor(Color.BLUE);
                trigger = false;
            }
            else
            {
                textView.setTextColor(Color.GREEN);
                trigger = true;
        });
    }
}