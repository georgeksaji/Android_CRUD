package com.example.qn9;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.home_activity);

        Button btninsert = findViewById(R.id.button2);
        Button btnupdate = findViewById(R.id.button4);

        btninsert.setOnClickListener(v->
        {
            Intent int1 = new Intent(HomeActivity.this, Create.class);
            startActivity(int1);
        });

        btnupdate.setOnClickListener(v->{
            Intent int2 = new Intent(HomeActivity.this,Update.class);
            startActivity(int2);
        });
    }
}
