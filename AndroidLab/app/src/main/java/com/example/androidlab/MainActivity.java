package com.example.androidlab;

import android.content.Intent; // Import Intent class
import android.os.Bundle;
import android.view.View; // Import View class
import android.widget.Button; // Import Button class

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find the button by its ID
        Button goToMessageButton = findViewById(R.id.button_go_to_message);

        // Set an OnClickListener for the button
        goToMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to start DisplayMessageActivity
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                startActivity(intent); // Start the new activity
            }
        });
    }
}