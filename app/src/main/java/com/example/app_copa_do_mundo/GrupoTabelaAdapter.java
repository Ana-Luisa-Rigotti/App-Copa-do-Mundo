package com.example.app_copa_do_mundo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GrupoTabelaAdapter extends RecyclerView.Adapter<GrupoTabelaAdapter.ViewHolder> {

    ArrayList<GrupoTabela> listaGrupos;

    public GrupoTabelaAdapter(ArrayList<GrupoTabela> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtGrupo;

        TextView txtNomeTime1, txtNomeTime2, txtNomeTime3, txtNomeTime4;
        ImageView imgBandeiraTime1, imgBandeiraTime2, imgBandeiraTime3, imgBandeiraTime4;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtGrupo = itemView.findViewById(R.id.txtGrupo);

            txtNomeTime1 = itemView.findViewById(R.id.txtNomeTime1);
            txtNomeTime2 = itemView.findViewById(R.id.txtNomeTime2);
            txtNomeTime3 = itemView.findViewById(R.id.txtNomeTime3);
            txtNomeTime4 = itemView.findViewById(R.id.txtNomeTime4);

            imgBandeiraTime1 = itemView.findViewById(R.id.imgBandeiraTime1);
            imgBandeiraTime2 = itemView.findViewById(R.id.imgBandeiraTime2);
            imgBandeiraTime3 = itemView.findViewById(R.id.imgBandeiraTime3);
            imgBandeiraTime4 = itemView.findViewById(R.id.imgBandeiraTime4);
        }
    }

    @NonNull
    @Override
    public GrupoTabelaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_grupo_tabela, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GrupoTabelaAdapter.ViewHolder holder, int position) {
        GrupoTabela grupo = listaGrupos.get(position);

        holder.txtGrupo.setText(grupo.nomeGrupo);

        holder.txtNomeTime1.setText(grupo.nomeTime1);
        holder.imgBandeiraTime1.setImageResource(grupo.bandeiraTime1);

        holder.txtNomeTime2.setText(grupo.nomeTime2);
        holder.imgBandeiraTime2.setImageResource(grupo.bandeiraTime2);

        holder.txtNomeTime3.setText(grupo.nomeTime3);
        holder.imgBandeiraTime3.setImageResource(grupo.bandeiraTime3);

        holder.txtNomeTime4.setText(grupo.nomeTime4);
        holder.imgBandeiraTime4.setImageResource(grupo.bandeiraTime4);
    }

    @Override
    public int getItemCount() {
        return listaGrupos.size();
    }
}