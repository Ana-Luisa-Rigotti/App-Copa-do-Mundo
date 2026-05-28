package com.example.app_copa_do_mundo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SelecaoEstadios extends AppCompatActivity {

    LinearLayout btnEstadosUnidos;
    LinearLayout btnMexico;
    LinearLayout btnCanada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_estadios);

        btnEstadosUnidos = findViewById(R.id.btn_selec_eua);
        btnMexico = findViewById(R.id.btn_selec_mexico);
        btnCanada = findViewById(R.id.btn_selec_canada);

        btnEstadosUnidos.setOnClickListener(v -> {
            Intent intent = new Intent(SelecaoEstadios.this, Estadios.class);
            intent.putExtra("pais", "eua");
            startActivity(intent);
        });

        btnMexico.setOnClickListener(v -> {
            Intent intent = new Intent(SelecaoEstadios.this, Estadios.class);
            intent.putExtra("pais", "mexico");
            startActivity(intent);
        });

        btnCanada.setOnClickListener(v -> {
            Intent intent = new Intent(SelecaoEstadios.this, Estadios.class);
            intent.putExtra("pais", "canada");
            startActivity(intent);
        });
    }
}