package com.example.app_copa_do_mundo;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class DetalheEstadio extends AppCompatActivity {

    ImageView imgEstadio;
    TextView txtNome, txtCidade, txtDescricao, txtCapacidade;

    @SuppressLint("DiscouragedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_estadio);

        // Inicializa componentes
        imgEstadio = findViewById(R.id.img_estadio_detalhe);
        txtNome = findViewById(R.id.txt_nome_estadio_detalhe);
        txtCidade = findViewById(R.id.txt_cidade_estadio_detalhe);
        txtDescricao = findViewById(R.id.txt_descricao_estadio);
        txtCapacidade = findViewById(R.id.txt_capacidade_estadio);

        // Arredondamento da imagem
        if (imgEstadio != null) {
            imgEstadio.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    float radius = 15 * getResources().getDisplayMetrics().density;
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), radius);
                }
            });
            imgEstadio.setClipToOutline(true);
        }

        // Pega o ID enviado
        int idEstadio = getIntent().getIntExtra("id_estadio", -1);

        if (idEstadio == -1) {
            Toast.makeText(this, "Erro: ID do estádio não recebido", Toast.LENGTH_SHORT).show();
            return;
        }

        EstadioModel estadioModel = new EstadioModel(this);
        EstadioPojo estadio = estadioModel.buscarPorId(idEstadio);

        if (estadio != null) {
            exibirDados(estadio);
        } else {
            Toast.makeText(this, "Erro: Estádio não encontrado no banco", Toast.LENGTH_SHORT).show();
        }
    }

    private void exibirDados(EstadioPojo estadio) {
        txtNome.setText(getTraducao(estadio.getNome()));
        txtCidade.setText(getTraducao(estadio.getLocal()));
        txtDescricao.setText(getTraducao(estadio.getDescricao()));

        // Formatação da capacidade
        NumberFormat formato = NumberFormat.getInstance();
        String capFormatada = formato.format(estadio.getCapacidade());
        
        try {
            String textoCompleto = getString(R.string.capacidade, capFormatada);
            SpannableString spannable = new SpannableString(textoCompleto);
            int inicio = textoCompleto.indexOf(capFormatada);
            if (inicio != -1) {
                spannable.setSpan(new StyleSpan(Typeface.BOLD), inicio, inicio + capFormatada.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
            txtCapacidade.setText(spannable);
        } catch (Exception e) {
            txtCapacidade.setText(capFormatada);
        }

        int idImg = getResources().getIdentifier(estadio.getImagem(), "drawable", getPackageName());
        if (idImg != 0) imgEstadio.setImageResource(idImg);
    }

    @SuppressLint("DiscouragedApi")
    private String getTraducao(String chave) {
        if (chave == null || chave.isEmpty()) return "";
        int resId = getResources().getIdentifier(chave, "string", getPackageName());
        return resId != 0 ? getString(resId) : chave;
    }
}
