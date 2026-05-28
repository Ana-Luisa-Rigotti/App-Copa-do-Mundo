package com.example.app_copa_do_mundo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalheEstadio extends AppCompatActivity {

    ImageView imgEstadio;
    TextView txtNome;
    TextView txtCidade;
    TextView txtDescricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_estadio);

        imgEstadio = findViewById(R.id.img_estadio_detalhe);
        txtNome = findViewById(R.id.txt_nome_estadio_detalhe);
        txtCidade = findViewById(R.id.txt_cidade_estadio_detalhe);
        txtDescricao = findViewById(R.id.txt_descricao_estadio);

        String nome = getIntent().getStringExtra("nome");
        String cidade = getIntent().getStringExtra("cidade");
        int imagem = getIntent().getIntExtra("imagem", 0);
        String descricao = getIntent().getStringExtra("descricao");

        txtNome.setText(nome);
        txtCidade.setText(cidade);
        txtDescricao.setText(descricao);

        if (imagem != 0) {
            imgEstadio.setImageResource(imagem);
        }
    }
}