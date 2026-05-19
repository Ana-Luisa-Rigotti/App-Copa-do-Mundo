package com.example.app_copa_do_mundo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Tabelas extends AppCompatActivity {

    RecyclerView recyclerTabela;
    ArrayList<GrupoTabela> listaGrupos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabelas);

        recyclerTabela = findViewById(R.id.recyclerTabela);

        listaGrupos = new ArrayList<>();

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_a),
                getString(R.string.mexico), R.drawable.bandeira_mexico,
                getString(R.string.africa_sul), R.drawable.bandeira_africa_sul,
                getString(R.string.coreia_sul), R.drawable.bandeira_coreia_sul,
                getString(R.string.tchequia), R.drawable.bandeira_tchequia
        ));

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_b),
                getString(R.string.canada), R.drawable.bandeira_canada,
                getString(R.string.bosnia), R.drawable.bandeira_bosnia,
                getString(R.string.catar), R.drawable.bandeira_catar,
                getString(R.string.suica), R.drawable.bandeira_suica
        ));

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_c),
                getString(R.string.brasil), R.drawable.bandeira_brasil,
                getString(R.string.marrocos), R.drawable.bandeira_marrocos,
                getString(R.string.haiti), R.drawable.bandeira_haiti,
                getString(R.string.escocia), R.drawable.bandeira_escocia
        ));

        recyclerTabela.setLayoutManager(new LinearLayoutManager(this));
        recyclerTabela.setAdapter(new GrupoTabelaAdapter(listaGrupos));
    }
}