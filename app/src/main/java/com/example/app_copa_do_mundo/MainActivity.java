package com.example.app_copa_do_mundo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout btnTabelas = findViewById(R.id.btn_tabelas);
        LinearLayout btnEstadios = findViewById(R.id.btnEstadios);


        btnTabelas.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Tabelas.class);
            startActivity(intent);
        });

        btnEstadios.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SelecaoEstadios.class);
            startActivity(intent);
        });

    }

}
