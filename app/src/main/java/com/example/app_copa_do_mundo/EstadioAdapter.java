package com.example.app_copa_do_mundo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EstadioAdapter extends RecyclerView.Adapter<EstadioAdapter.EstadioViewHolder> {

    private Context context;
    private ArrayList<EstadioPojo> listaEstadios;

    public EstadioAdapter(Context context, ArrayList<EstadioPojo> listaEstadios) {
        this.context = context;
        this.listaEstadios = listaEstadios;
    }

    @NonNull
    @Override
    public EstadioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Este metodo cria a visualização de cada item da lista
        View item = LayoutInflater.from(context).inflate(R.layout.item_estadio, parent, false);
        return new EstadioViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull EstadioViewHolder holder, int position) {
        EstadioPojo estadio = listaEstadios.get(position);

        // Usa getTraducao para mostrar o nome e cidade traduzidos na lista
        holder.txtNome.setText(getTraducao(estadio.getNome()));
        holder.txtCidade.setText(getTraducao(estadio.getLocal()));

        holder.cardEstadio.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetalheEstadio.class);
            intent.putExtra("id_estadio", estadio.getId()); // Passa o ID para a tela de detalhe
            context.startActivity(intent);
        });
    }

    // Busca a tradução baseada na chave vinda do banco de dados
    private String getTraducao(String chave) {
        if (chave == null || chave.isEmpty()) return "";
        int resId = context.getResources().getIdentifier(chave, "string", context.getPackageName());
        return resId != 0 ? context.getString(resId) : chave;
    }

    @Override
    public int getItemCount() {
        return listaEstadios.size();
    }

    public static class EstadioViewHolder extends RecyclerView.ViewHolder {

        LinearLayout cardEstadio;
        TextView txtNome;
        TextView txtCidade;

        public EstadioViewHolder(@NonNull View itemView) {
            super(itemView);

            cardEstadio = itemView.findViewById(R.id.card_estadio);
            txtNome = itemView.findViewById(R.id.txt_nome_estadio_item);
            txtCidade = itemView.findViewById(R.id.txt_cidade_estadio_item);
        }
    }
}
