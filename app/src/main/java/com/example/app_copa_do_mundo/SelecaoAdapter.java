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

public class SelecaoAdapter extends RecyclerView.Adapter<SelecaoAdapter.SelecaoViewHolder> {

    private Context context;
    private ArrayList<Selecao> listaSelecoes;

    public SelecaoAdapter(Context context, ArrayList<Selecao> listaSelecoes) {
        this.context = context;
        this.listaSelecoes = listaSelecoes;
    }

    @NonNull
    @Override
    public SelecaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_selecao, parent, false);
        return new SelecaoViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull SelecaoViewHolder holder, int position) {
        Selecao selecao = listaSelecoes.get(position);

        holder.txtNome.setText(selecao.getNome());

        // CORREÇÃO: O clique deve ser no cardSelecao, pois ele tem clickable=true no XML
        holder.cardSelecao.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), DetalheSelecao.class);
            intent.putExtra("nome", selecao.getNome());
            intent.putExtra("continente", selecao.getContinente());
            intent.putExtra("descricao", selecao.getDescricao());
            intent.putExtra("imagem", selecao.getImagem());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listaSelecoes != null ? listaSelecoes.size() : 0;
    }

    public static class SelecaoViewHolder extends RecyclerView.ViewHolder {
        LinearLayout cardSelecao;
        TextView txtNome;

        public SelecaoViewHolder(@NonNull View itemView) {
            super(itemView);
            cardSelecao = itemView.findViewById(R.id.card_selecao);
            txtNome = itemView.findViewById(R.id.txt_nome_selecao_item);
        }
    }
}
