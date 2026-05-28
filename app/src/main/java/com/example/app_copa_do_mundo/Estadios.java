package com.example.app_copa_do_mundo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Estadios extends AppCompatActivity {
    RecyclerView recyclerEstadios;
    TextView txtTituloPais;
    ArrayList<EstadioPojo> listaEstadios; // Mude de Estadio para EstadioPojo
    EstadioModel estadioModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadios);

        recyclerEstadios = findViewById(R.id.recyclerEstadios);
        txtTituloPais = findViewById(R.id.txt_titulo_pais);
        estadioModel = new EstadioModel(this);

        String pais = getIntent().getStringExtra("pais");
        if (pais == null) pais = "eua";

        // Busca do banco de dados usando os códigos que definimos (1=EUA, 2=MEX, 3=CAN)
        if (pais.equals("eua")) {
            txtTituloPais.setText(R.string.estados_unidos); // Tradução do Título
            listaEstadios = estadioModel.buscarPorPais(1);
        } else if (pais.equals("mexico")) {
            txtTituloPais.setText(R.string.mexico);
            listaEstadios = estadioModel.buscarPorPais(2);
        } else {
            txtTituloPais.setText(R.string.canada);
            listaEstadios = estadioModel.buscarPorPais(3);
        }

        EstadioAdapter adapter = new EstadioAdapter(this, listaEstadios);
        recyclerEstadios.setLayoutManager(new LinearLayoutManager(this));
        recyclerEstadios.setAdapter(adapter);
    }
}