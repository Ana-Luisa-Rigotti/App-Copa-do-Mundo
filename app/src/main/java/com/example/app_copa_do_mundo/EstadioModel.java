package com.example.app_copa_do_mundo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class EstadioModel {

    private ConexaoSQLite conexaoSQLite;

    public EstadioModel(Context context) {
        conexaoSQLite = new ConexaoSQLite(context);
    }

    public ArrayList<EstadioPojo> buscarPorPais(int codigoPais) {
        ArrayList<EstadioPojo> lista = new ArrayList<>();

        SQLiteDatabase db = conexaoSQLite.getReadableDatabase();

        String sql = "SELECT * FROM Estadios WHERE codigo_estadio_enum = ? ORDER BY nome";

        Cursor cursor = db.rawQuery(sql, new String[]{String.valueOf(codigoPais)});

        if (cursor.moveToFirst()) {
            do {
                EstadioPojo estadio = cursorParaEstadio(cursor);
                lista.add(estadio);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return lista;
    }

    public EstadioPojo buscarPorId(int id) {
        SQLiteDatabase db = conexaoSQLite.getReadableDatabase();

        String sql = "SELECT * FROM Estadios WHERE id = ?";

        Cursor cursor = db.rawQuery(sql, new String[]{String.valueOf(id)});

        EstadioPojo estadio = null;

        if (cursor.moveToFirst()) {
            estadio = cursorParaEstadio(cursor);
        }

        cursor.close();
        db.close();

        return estadio;
    }

    private EstadioPojo cursorParaEstadio(Cursor cursor) {
        EstadioPojo estadio = new EstadioPojo();

        estadio.setId(cursor.getInt(cursor.getColumnIndexOrThrow("id")));
        estadio.setCodigoEstadioEnum(cursor.getInt(cursor.getColumnIndexOrThrow("codigo_estadio_enum")));
        estadio.setNome(cursor.getString(cursor.getColumnIndexOrThrow("nome")));
        estadio.setLocal(cursor.getString(cursor.getColumnIndexOrThrow("local")));
        estadio.setDescricao(cursor.getString(cursor.getColumnIndexOrThrow("descricao")));
        estadio.setDataFundacao(cursor.getString(cursor.getColumnIndexOrThrow("data_fundacao")));
        estadio.setCapacidade(cursor.getInt(cursor.getColumnIndexOrThrow("capacidade")));
        estadio.setImagem(cursor.getString(cursor.getColumnIndexOrThrow("imagem")));
        estadio.setLinkMaps(cursor.getString(cursor.getColumnIndexOrThrow("link_maps")));

        return estadio;
    }
}