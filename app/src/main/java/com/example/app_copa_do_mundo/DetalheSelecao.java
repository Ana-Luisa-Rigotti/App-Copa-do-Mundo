package com.example.app_copa_do_mundo;

import android.graphics.Outline;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalheSelecao extends AppCompatActivity {

    ImageView imgSelecao;
    TextView txtNome;
    TextView txtContinente;
    TextView txtDescricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_selecao);

        imgSelecao = findViewById(R.id.img_selecao_detalhe);
        txtNome = findViewById(R.id.txt_nome_selecao_detalhe);
        txtContinente = findViewById(R.id.txt_continente_selecao_detalhe);
        txtDescricao = findViewById(R.id.txt_descricao_selecao);

        // Recebendo dados da Intent
        String nome = getIntent().getStringExtra("nome");
        String continente = getIntent().getStringExtra("continente");
        String descricao = getIntent().getStringExtra("descricao");
        int imagem = getIntent().getIntExtra("imagem", 0);

        // Preenchendo com segurança (evita crash se for null)
        if (txtNome != null) txtNome.setText(nome != null ? nome : "");
        if (txtContinente != null) txtContinente.setText(continente != null ? continente : "");
        if (txtDescricao != null) txtDescricao.setText(descricao != null ? descricao : "");

        if (imgSelecao != null && imagem != 0) {
            imgSelecao.setImageResource(imagem);
        }
    }
}
