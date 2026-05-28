package com.example.app_copa_do_mundo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalheEstadio extends AppCompatActivity {

    ImageView imgEstadio;
    TextView txtNome;
    TextView txtCidade;
    TextView txtDescricao;
    TextView txtCapacidade;

    @SuppressLint("DiscouragedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_estadio);

        imgEstadio = findViewById(R.id.img_estadio_detalhe);
        txtNome = findViewById(R.id.txt_nome_estadio_detalhe);
        txtCidade = findViewById(R.id.txt_cidade_estadio_detalhe);
        txtDescricao = findViewById(R.id.txt_descricao_estadio);
        txtCapacidade = findViewById(R.id.txt_capacidade_estadio);

        int idEstadio = getIntent().getIntExtra("id_estadio", -1);

        if (idEstadio == -1) {
            finish();
            return;
        }

        EstadioModel estadioModel = new EstadioModel(this);
        EstadioPojo estadio = estadioModel.buscarPorId(idEstadio);

        if (estadio == null) {
            finish();
            return;
        }

        // Traduzindo os textos do banco de dados
        txtNome.setText(getTraducao(estadio.getNome()));
        txtCidade.setText(getTraducao(estadio.getLocal()));
        txtDescricao.setText(getTraducao(estadio.getDescricao()));

        // Formatando a capacidade usando a string com placeholder %1$d
        txtCapacidade.setText(getString(R.string.capacidade, estadio.getCapacidade()));

        // Buscando a imagem
        int idImagem = getResources().getIdentifier(
                estadio.getImagem(),
                "drawable",
                getPackageName()
        );

        if (idImagem != 0) {
            imgEstadio.setImageResource(idImagem);
        }
    }

    /**
     * Busca a tradução no strings.xml baseada na chave salva no banco.
     */
    @SuppressLint("DiscouragedApi")
    private String getTraducao(String chave) {
        if (chave == null || chave.isEmpty()) return "";
        int resId = getResources().getIdentifier(chave, "string", getPackageName());
        return resId != 0 ? getString(resId) : chave;
    }
}
