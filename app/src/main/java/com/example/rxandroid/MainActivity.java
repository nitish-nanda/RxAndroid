package com.example.rxandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.tv_simple);
        TextView tv2 = findViewById(R.id.tv_multiple);
        TextView tv3 = findViewById(R.id.tv_single_with_custom);

        tv1.setOnClickListener(v -> startActivity(new Intent(this, SimpleObserver.class)));
        tv2.setOnClickListener(v -> startActivity(new Intent(this, MulitpleObservers.class)));
        tv3.setOnClickListener(v -> startActivity(new Intent(this, ObserverWithCustomType.class)));
    }
}