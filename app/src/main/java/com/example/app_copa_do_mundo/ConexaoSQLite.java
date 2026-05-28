package com.example.app_copa_do_mundo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ConexaoSQLite extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "estadios.db";
    private static final int VERSAO_BANCO = 2;

    public ConexaoSQLite(Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS Estadios (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "codigo_estadio_enum INTEGER NOT NULL, " +
                "nome TEXT NOT NULL, " +
                "local TEXT NOT NULL, " +
                "descricao TEXT, " +
                "data_fundacao TEXT, " +
                "capacidade INTEGER, " +
                "imagem TEXT NOT NULL, " +
                "link_maps TEXT" +
                ");";

        db.execSQL(sql);

        inserirDadosIniciais(db);
    }

    private void inserirDadosIniciais(SQLiteDatabase db) {
        // --- ESTADOS UNIDOS (CÓDIGO 1) ---
        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_metlife', 'stadium_loc_metlife', 'stadium_desc_metlife', '2010', 82500, 'metlife_stadium', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_att', 'stadium_loc_att', 'stadium_desc_att', '2009', 80000, 'att_stadium', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_sofi', 'stadium_loc_sofi', 'stadium_desc_sofi', '2020', 70240, 'sofi_stadium', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_hard_rock', 'stadium_loc_hard_rock', 'stadium_desc_hard_rock', '1987', 64767, 'hard_rock_stadium', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_lumen_field', 'stadium_loc_lumen_field', 'stadium_desc_lumen_field', '2002', 68740, 'lumen_field', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_levis', 'stadium_loc_levis', 'stadium_desc_levis', '2014', 68500, 'levis_stadium', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_lincoln_financial', 'stadium_loc_lincoln_financial', 'stadium_desc_lincoln_financial', '2003', 69796, 'lincoln_financial_field', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_gillette', 'stadium_loc_gillette', 'stadium_desc_gillette', '2002', 65878, 'gillette_stadium', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_nrg', 'stadium_loc_nrg', 'stadium_desc_nrg', '2002', 72220, 'nrg_stadium', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_arrowhead', 'stadium_loc_arrowhead', 'stadium_desc_arrowhead', '1972', 76416, 'arrowhead_stadium', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(1, 'stadium_name_mercedes_benz', 'stadium_loc_mercedes_benz', 'stadium_desc_mercedes_benz', '2017', 71000, 'mercedes_benz_stadium', '');");

        // --- MÉXICO (CÓDIGO 2) ---
        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(2, 'stadium_name_azteca', 'stadium_loc_azteca', 'stadium_desc_azteca', '1966', 87523, 'estadio_azteca', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(2, 'stadium_name_akron', 'stadium_loc_akron', 'stadium_desc_akron', '2010', 49850, 'estadio_akron', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(2, 'stadium_name_bbva', 'stadium_loc_bbva', 'stadium_desc_bbva', '2015', 51000, 'estadio_bbva', '');");

        // --- CANADÁ (CÓDIGO 3) ---
        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(3, 'stadium_name_bmo_field', 'stadium_loc_bmo_field', 'stadium_desc_bmo_field', '2007', 30000, 'bmo_field', '');");

        db.execSQL("INSERT INTO Estadios (codigo_estadio_enum, nome, local, descricao, data_fundacao, capacidade, imagem, link_maps) VALUES " +
                "(3, 'stadium_name_bc_place', 'stadium_loc_bc_place', 'stadium_desc_bc_place', '1983', 54500, 'bc_place', '');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Estadios");
        onCreate(db);
    }
}
