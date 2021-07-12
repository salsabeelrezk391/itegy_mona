package com.example.confirmorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      Button placed = findViewById(R.id.placed_order);
      placed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, order_placed.class);
                startActivity(intent);
            }
    });
}
public void OnClicked(View view) {
        Intent intent = new Intent(MainActivity.this, order_placed.class);
        startActivity(intent);
        finish();
    }
}