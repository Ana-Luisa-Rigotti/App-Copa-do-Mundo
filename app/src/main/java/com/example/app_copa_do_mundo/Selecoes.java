package com.example.app_copa_do_mundo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Selecoes extends AppCompatActivity {

    RecyclerView recyclerSelecoes;
    TextView txtTituloContinente;
    ArrayList<Selecao> listaSelecoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecoes);

        recyclerSelecoes = findViewById(R.id.recyclerSelecoes);
        txtTituloContinente = findViewById(R.id.txt_titulo_continente);

        listaSelecoes = new ArrayList<>();

        String continente = getIntent().getStringExtra("continente");

        if (continente == null) {
            continente = "america_sul";
        }

        switch (continente) {
            case "america_sul":
                txtTituloContinente.setText("América do Sul");
                carregarAmericaSul();
                break;
            case "america_norte":
                txtTituloContinente.setText("América do Norte");
                carregarAmericaNorte();
                break;
            case "europa":
                txtTituloContinente.setText("Europa");
                carregarEuropa();
                break;
            case "asia":
                txtTituloContinente.setText("Ásia");
                carregarAsia();
                break;
            case "africa":
                txtTituloContinente.setText("África");
                carregarAfrica();
                break;
            case "oceania":
                txtTituloContinente.setText("Oceania");
                carregarOceania();
                break;
            default:
                txtTituloContinente.setText("América do Sul");
                carregarAmericaSul();
                break;
        }

        SelecaoAdapter adapter = new SelecaoAdapter(this, listaSelecoes);

        recyclerSelecoes.setLayoutManager(new LinearLayoutManager(this));
        recyclerSelecoes.setAdapter(adapter);
    }

    private void carregarAmericaSul() {
        listaSelecoes.add(new Selecao("Brasil", "América do Sul", "Descrição da seleção brasileira.", R.drawable.bandeira_brasil));
        listaSelecoes.add(new Selecao("Argentina", "América do Sul", "Descrição da seleção argentina.", R.drawable.bandeira_argentina));
        listaSelecoes.add(new Selecao("Uruguai", "América do Sul", "Descrição da seleção uruguaia.", R.drawable.bandeira_uruguai));
        listaSelecoes.add(new Selecao("Colômbia", "América do Sul", "Descrição da seleção colombiana.", R.drawable.bandeira_colombia));
        listaSelecoes.add(new Selecao("Equador", "América do Sul", "Descrição da seleção equatoriana.", R.drawable.bandeira_equador));
        listaSelecoes.add(new Selecao("Paraguai", "América do Sul", "Descrição da seleção paraguaia.", R.drawable.bandeira_paraguai));
    }

    private void carregarAmericaNorte() {
        listaSelecoes.add(new Selecao("Canadá", "América do Norte", "Descrição da seleção canadense.", R.drawable.bandeira_canada));
        listaSelecoes.add(new Selecao("Estados Unidos", "América do Norte", "Descrição da seleção estadunidense.", R.drawable.bandeira_estados_unidos));
        listaSelecoes.add(new Selecao("México", "América do Norte", "Descrição da seleção mexicana.", R.drawable.bandeira_mexico));
        listaSelecoes.add(new Selecao("Panamá", "América do Norte", "Descrição da seleção panamenha.", R.drawable.bandeira_panama));
        listaSelecoes.add(new Selecao("Curaçao", "América do Norte", "Descrição da seleção de Curaçao.", R.drawable.bandeira_curacao));
        listaSelecoes.add(new Selecao("Haiti", "América do Norte", "Descrição da seleção haitiana.", R.drawable.bandeira_haiti));
    }

    private void carregarEuropa() {
        listaSelecoes.add(new Selecao("Alemanha", "Europa", "Descrição da seleção alemã.", R.drawable.bandeira_alemanha));
        listaSelecoes.add(new Selecao("França", "Europa", "Descrição da seleção francesa.", R.drawable.bandeira_franca));
        listaSelecoes.add(new Selecao("Espanha", "Europa", "Descrição da seleção espanhola.", R.drawable.bandeira_espanha));
        listaSelecoes.add(new Selecao("Inglaterra", "Europa", "Descrição da seleção inglesa.", R.drawable.bandeira_inglaterra));
        listaSelecoes.add(new Selecao("Portugal", "Europa", "Descrição da seleção portuguesa.", R.drawable.bandeira_portugal));
        listaSelecoes.add(new Selecao("Países Baixos", "Europa", "Descrição da seleção neerlandesa.", R.drawable.bandeira_holanda));
        listaSelecoes.add(new Selecao("Bélgica", "Europa", "Descrição da seleção belga.", R.drawable.bandeira_belgica));
        listaSelecoes.add(new Selecao("Croácia", "Europa", "Descrição da seleção croata.", R.drawable.bandeira_croacia));
        listaSelecoes.add(new Selecao("Suíça", "Europa", "Descrição da seleção suíça.", R.drawable.bandeira_suica));
        listaSelecoes.add(new Selecao("Áustria", "Europa", "Descrição da seleção austríaca.", R.drawable.bandeira_austria));
        listaSelecoes.add(new Selecao("Noruega", "Europa", "Descrição da seleção norueguesa.", R.drawable.bandeira_noruega));
        listaSelecoes.add(new Selecao("Escócia", "Europa", "Descrição da seleção escocesa.", R.drawable.bandeira_escocia));
        listaSelecoes.add(new Selecao("Turquia", "Europa", "Descrição da seleção turca.", R.drawable.bandeira_turquia));
        listaSelecoes.add(new Selecao("República Tcheca", "Europa", "Descrição da seleção tcheca.", R.drawable.bandeira_tchequia));
    }

    private void carregarAsia() {
        listaSelecoes.add(new Selecao("Japão", "Ásia", "Descrição da seleção japonesa.", R.drawable.bandeira_japao));
        listaSelecoes.add(new Selecao("Coreia do Sul", "Ásia", "Descrição da seleção sul-coreana.", R.drawable.bandeira_coreia_sul));
        listaSelecoes.add(new Selecao("Irã", "Ásia", "Descrição da seleção iraniana.", R.drawable.bandeira_ira));
        listaSelecoes.add(new Selecao("Austrália", "Ásia", "Descrição da seleção australiana.", R.drawable.bandeira_australia));
        listaSelecoes.add(new Selecao("Arábia Saudita", "Ásia", "Descrição da seleção saudita.", R.drawable.bandeira_arabia_saudita));
        listaSelecoes.add(new Selecao("Catar", "Ásia", "Descrição da seleção catariana.", R.drawable.bandeira_catar));
        listaSelecoes.add(new Selecao("Uzbequistão", "Ásia", "Descrição da seleção uzbeque.", R.drawable.bandeira_uzbequistao));
        listaSelecoes.add(new Selecao("Jordânia", "Ásia", "Descrição da seleção jordaniana.", R.drawable.bandeira_jordania));
        listaSelecoes.add(new Selecao("Iraque", "Ásia", "Descrição da seleção iraquiana.", R.drawable.bandeira_iraque));
    }

    private void carregarAfrica() {
        listaSelecoes.add(new Selecao("Marrocos", "África", "Descrição da seleção marroquina.", R.drawable.bandeira_marrocos));
        listaSelecoes.add(new Selecao("Tunísia", "África", "Descrição da seleção tunisiana.", R.drawable.bandeira_tunisia));
        listaSelecoes.add(new Selecao("Egito", "África", "Descrição da seleção egípcia.", R.drawable.bandeira_egito));
        listaSelecoes.add(new Selecao("Argélia", "África", "Descrição da seleção argelina.", R.drawable.bandeira_argelia));
        listaSelecoes.add(new Selecao("Costa do Marfim", "África", "Descrição da seleção marfinense.", R.drawable.bandeira_costa_marfim));
        listaSelecoes.add(new Selecao("África do Sul", "África", "Descrição da seleção sul-africana.", R.drawable.bandeira_africa_sul));
        listaSelecoes.add(new Selecao("Cabo Verde", "África", "Descrição da seleção cabo-verdiana.", R.drawable.bandeira_cabo_verde));
        listaSelecoes.add(new Selecao("Gana", "África", "Descrição da seleção ganesa.", R.drawable.bandeira_gana));
        listaSelecoes.add(new Selecao("Senegal", "África", "Descrição da seleção senegalesa.", R.drawable.bandeira_senegal));
    }

    private void carregarOceania() {
        listaSelecoes.add(new Selecao("Nova Zelândia", "Oceania", "Descrição da seleção neozelandesa.", R.drawable.bandeira_nova_zelandia));
    }
}
