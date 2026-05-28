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
    private ArrayList<Estadio> listaEstadios;

    public EstadioAdapter(Context context, ArrayList<Estadio> listaEstadios) {
        this.context = context;
        this.listaEstadios = listaEstadios;
    }

    @NonNull
    @Override
    public EstadioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(context).inflate(R.layout.item_estadio, parent, false);
        return new EstadioViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull EstadioViewHolder holder, int position) {
        Estadio estadio = listaEstadios.get(position);

        holder.txtNome.setText(estadio.getNome());
        holder.txtCidade.setText(estadio.getCidade());

        holder.cardEstadio.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetalheEstadio.class);

            intent.putExtra("nome", estadio.getNome());
            intent.putExtra("cidade", estadio.getCidade());
            intent.putExtra("imagem", estadio.getImagem());
            intent.putExtra("descricao", estadio.getDescricao());

            context.startActivity(intent);
        });
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