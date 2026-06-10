package com.example.app_copa_do_mundo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SelecaoSelecoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_selecoes);

        LinearLayout btnAmericaNorte;
        LinearLayout btnEuropa;
        LinearLayout btnAfrica;
        LinearLayout btnAsia;
        LinearLayout btnLatam;
        LinearLayout btnOceania;


        btnAmericaNorte = findViewById(R.id.btn_america_norte_selec);
        btnEuropa = findViewById(R.id.btn_europa_selc);
        btnAfrica = findViewById(R.id.btn_africa_selc);
        btnAsia = findViewById(R.id.btn_asia_selc);
        btnLatam = findViewById(R.id.btn_latam_selec);
        btnOceania = findViewById(R.id.btn_oceania_selec);

        btnAmericaNorte.setOnClickListener(v -> {
            Intent intent = new Intent(SelecaoSelecoes.this, Selecoes.class);
            intent.putExtra("continente", "america_norte");
            startActivity(intent);
        });

        btnEuropa.setOnClickListener(v -> {
            Intent intent = new Intent(SelecaoSelecoes.this, Selecoes.class);
            intent.putExtra("continente", "europa");
            startActivity(intent);
        });

        btnAfrica.setOnClickListener(v -> {
            Intent intent = new Intent(SelecaoSelecoes.this, Selecoes.class);
            intent.putExtra("continente", "africa");
            startActivity(intent);
        });

        btnAsia.setOnClickListener(v -> {
            Intent intent = new Intent(SelecaoSelecoes.this, Selecoes.class);
            intent.putExtra("continente", "asia");
            startActivity(intent);
        });

        btnLatam.setOnClickListener(v -> {
            Intent intent = new Intent(SelecaoSelecoes.this, Selecoes.class);
            intent.putExtra("continente", "america_sul");
            startActivity(intent);
        });

        btnOceania.setOnClickListener(v -> {
            Intent intent = new Intent(SelecaoSelecoes.this, Selecoes.class);
            intent.putExtra("continente", "oceania");
            startActivity(intent);
        });






    }
}