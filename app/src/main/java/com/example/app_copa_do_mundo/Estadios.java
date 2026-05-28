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
    ArrayList<Estadio> listaEstadios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadios);

        recyclerEstadios = findViewById(R.id.recyclerEstadios);
        txtTituloPais = findViewById(R.id.txt_titulo_pais);

        listaEstadios = new ArrayList<>();


        String pais = getIntent().getStringExtra("pais");

        if (pais == null) {
            pais = "eua";
        }

        if (pais.equals("eua")) {
            carregarEstadiosEua();
        } else if (pais.equals("mexico")) {
            carregarEstadiosMexico();
        } else if (pais.equals("canada")) {
            carregarEstadiosCanada();
        }

        EstadioAdapter adapter = new EstadioAdapter(this, listaEstadios);

        recyclerEstadios.setLayoutManager(new LinearLayoutManager(this));
        recyclerEstadios.setAdapter(adapter);
    }

    private void carregarEstadiosEua() {
        txtTituloPais.setText("Estados Unidos");

        listaEstadios.add(new Estadio(
                "MetLife Stadium",
                "East Rutherford",
                R.drawable.metlife_stadium,
                "Aqui entra a descrição grande do MetLife Stadium. Você pode colocar um texto maior sobre a história, localização, capacidade, eventos importantes e participação na Copa do Mundo."
        ));

        listaEstadios.add(new Estadio(
                "AT&T Stadium",
                "Arlington",
                R.drawable.att_stadium,
                "Aqui entra a descrição grande do AT&T Stadium."
        ));

        listaEstadios.add(new Estadio(
                "SoFi Stadium",
                "Inglewood",
                R.drawable.sofi_stadium,
                "Aqui entra a descrição grande do SoFi Stadium."
        ));

        listaEstadios.add(new Estadio(
                "Hard Rock Stadium",
                "Miami Gardens",
                R.drawable.hard_rock_stadium,
                "Aqui entra a descrição grande do Hard Rock Stadium."
        ));

        listaEstadios.add(new Estadio(
                "Lumen Field",
                "Seattle",
                R.drawable.lumen_field,
                "Aqui entra a descrição grande do Lumen Field."
        ));

        listaEstadios.add(new Estadio(
                "Levi's Stadium",
                "Santa Clara",
                R.drawable.levis_stadium,
                "Aqui entra a descrição grande do Levi's Stadium."
        ));

        listaEstadios.add(new Estadio(
                "Lincoln Financial Field",
                "Filadélfia",
                R.drawable.lincoln_financial_field,
                "Aqui entra a descrição grande do Lincoln Financial Field."
        ));

        listaEstadios.add(new Estadio(
                "Gillette Stadium",
                "Foxborough",
                R.drawable.gillette_stadium,
                "Aqui entra a descrição grande do Gillette Stadium."
        ));

        listaEstadios.add(new Estadio(
                "NRG Stadium",
                "Houston",
                R.drawable.nrg_stadium,
                "Aqui entra a descrição grande do NRG Stadium."
        ));

        listaEstadios.add(new Estadio(
                "GEHA Field at Arrowhead Stadium",
                "Kansas City",
                R.drawable.arrowhead_stadium,
                "Aqui entra a descrição grande do Arrowhead Stadium."
        ));

        listaEstadios.add(new Estadio(
                "Mercedes-Benz Stadium",
                "Atlanta",
                R.drawable.mercedes_benz_stadium,
                "Aqui entra a descrição grande do Mercedes-Benz Stadium."
        ));
    }

    private void carregarEstadiosMexico() {
        txtTituloPais.setText("México");

        listaEstadios.add(new Estadio(
                "Estadio Azteca",
                "Cidade do México",
                R.drawable.estadio_azteca,
                "Aqui entra a descrição grande do Estadio Azteca."
        ));

        listaEstadios.add(new Estadio(
                "Estadio Akron",
                "Guadalajara",
                R.drawable.estadio_akron,
                "Aqui entra a descrição grande do Estadio Akron."
        ));

        listaEstadios.add(new Estadio(
                "Estadio BBVA",
                "Monterrey",
                R.drawable.estadio_bbva,
                "Aqui entra a descrição grande do Estadio BBVA."
        ));
    }

    private void carregarEstadiosCanada() {
        txtTituloPais.setText("Canadá");

        listaEstadios.add(new Estadio(
                "BMO Field",
                "Toronto",
                R.drawable.bmo_field,
                "Aqui entra a descrição grande do BMO Field."
        ));

        listaEstadios.add(new Estadio(
                "BC Place",
                "Vancouver",
                R.drawable.bc_place,
                "Aqui entra a descrição grande do BC Place."
        ));
    }
}