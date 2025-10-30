package com.example.qn6;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    boolean isBlue = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        ConstraintLayout layout   = findViewById(R.id.main);

        btn.setOnClickListener(v->
        {
            if(isBlue)
            {
                layout.setBackgroundColor(Color.BLUE);
                isBlue = false;
            }
            else
            {
                layout.setBackgroundColor(Color.YELLOW);
                isBlue = true;
            }
        });




    }
}