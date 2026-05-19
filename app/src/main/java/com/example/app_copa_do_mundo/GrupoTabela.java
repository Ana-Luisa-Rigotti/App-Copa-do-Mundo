package com.example.app_copa_do_mundo;

public class GrupoTabela {

    String nomeGrupo;

    String nomeTime1;
    String nomeTime2;
    String nomeTime3;
    String nomeTime4;

    int bandeiraTime1;
    int bandeiraTime2;
    int bandeiraTime3;
    int bandeiraTime4;

    public GrupoTabela(
            String nomeGrupo,
            String nomeTime1, int bandeiraTime1,
            String nomeTime2, int bandeiraTime2,
            String nomeTime3, int bandeiraTime3,
            String nomeTime4, int bandeiraTime4
    ) {
        this.nomeGrupo = nomeGrupo;

        this.nomeTime1 = nomeTime1;
        this.bandeiraTime1 = bandeiraTime1;

        this.nomeTime2 = nomeTime2;
        this.bandeiraTime2 = bandeiraTime2;

        this.nomeTime3 = nomeTime3;
        this.bandeiraTime3 = bandeiraTime3;

        this.nomeTime4 = nomeTime4;
        this.bandeiraTime4 = bandeiraTime4;
    }
}