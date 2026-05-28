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

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_d),
                getString(R.string.estados_unidos), R.drawable.bandeira_estados_unidos,
                getString(R.string.paraguai), R.drawable.bandeira_paraguai,
                getString(R.string.australia), R.drawable.bandeira_australia,
                getString(R.string.turquia), R.drawable.bandeira_turquia

        ));

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_e),
                getString(R.string.alemanha), R.drawable.bandeira_alemanha,
                getString(R.string.curacao), R.drawable.bandeira_curacao,
                getString(R.string.costa_marfim), R.drawable.bandeira_costa_marfim,
                getString(R.string.equador), R.drawable.bandeira_equador

        ));

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_f),
                getString(R.string.holanda), R.drawable.bandeira_holanda,
                getString(R.string.japao), R.drawable.bandeira_japao,
                getString(R.string.suecia), R.drawable.bandeira_suecia,
                getString(R.string.tunisia), R.drawable.bandeira_tunisia

        ));

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_g),
                getString(R.string.belgica), R.drawable.bandeira_belgica,
                getString(R.string.egito), R.drawable.bandeira_egito,
                getString(R.string.ira), R.drawable.bandeira_ira,
                getString(R.string.nova_zelandia), R.drawable.bandeira_nova_zelandia

        ));

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_h),
                getString(R.string.espanha), R.drawable.bandeira_espanha,
                getString(R.string.cabo_verde), R.drawable.bandeira_cabo_verde,
                getString(R.string.arabia_saudita), R.drawable.bandeira_arabia_saudita,
                getString(R.string.uruguai), R.drawable.bandeira_uruguai

        ));

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_i),
                getString(R.string.franca), R.drawable.bandeira_franca,
                getString(R.string.senegal), R.drawable.bandeira_senegal,
                getString(R.string.iraque), R.drawable.bandeira_iraque,
                getString(R.string.noruega), R.drawable.bandeira_noruega

        ));

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_j),
                getString(R.string.argentina), R.drawable.bandeira_argentina,
                getString(R.string.argelia), R.drawable.bandeira_argelia,
                getString(R.string.austria), R.drawable.bandeira_austria,
                getString(R.string.jordania), R.drawable.bandeira_jordania

        ));

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_k),
                getString(R.string.portugal), R.drawable.bandeira_portugal,
                getString(R.string.rd_congo), R.drawable.bandeira_rd_congo,
                getString(R.string.uzbequistao), R.drawable.bandeira_uzbequistao,
                getString(R.string.colombia), R.drawable.bandeira_colombia

        ));

        listaGrupos.add(new GrupoTabela(
                getString(R.string.grupo_l),
                getString(R.string.inglaterra), R.drawable.bandeira_inglaterra,
                getString(R.string.croacia), R.drawable.bandeira_croacia,
                getString(R.string.gana), R.drawable.bandeira_gana,
                getString(R.string.panama), R.drawable.bandeira_panama

        ));


        recyclerTabela.setLayoutManager(new LinearLayoutManager(this));
        recyclerTabela.setAdapter(new GrupoTabelaAdapter(listaGrupos));
    }
}