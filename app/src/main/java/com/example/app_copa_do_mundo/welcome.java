package com.example.app_copa_do_mundo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ImageView logoSplash = findViewById(R.id.img_logo_id);

        logoSplash.setAlpha(0f);
        logoSplash.setScaleX(0.8f);
        logoSplash.setScaleY(0.8f);

        logoSplash.animate()
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(800)
                .start();

        LinearLayout btnPortugues = findViewById(R.id.btn_portugues);
        LinearLayout btnIngles = findViewById(R.id.btn_ingles);
        LinearLayout btnAlemao = findViewById(R.id.btn_alemao);
        LinearLayout btnEspanhol = findViewById(R.id.btn_espanhol);
        LinearLayout btnItaliano = findViewById(R.id.btn_italiano);
        LinearLayout btnJapones = findViewById(R.id.btn_japones);
        LinearLayout btnFrances = findViewById(R.id.btn_frances);
        LinearLayout btnRusso = findViewById(R.id.btn_russo);

        btnPortugues.setOnClickListener(v -> escolherIdiomaEAbrir("pt-BR"));
        btnIngles.setOnClickListener(v -> escolherIdiomaEAbrir("en-US"));
        btnAlemao.setOnClickListener(v -> escolherIdiomaEAbrir("de-DE"));
        btnEspanhol.setOnClickListener(v -> escolherIdiomaEAbrir("es-ES"));
        btnItaliano.setOnClickListener(v -> escolherIdiomaEAbrir("it-IT"));
        btnJapones.setOnClickListener(v -> escolherIdiomaEAbrir("ja-JP"));
        btnFrances.setOnClickListener(v -> escolherIdiomaEAbrir("fr-FR"));
        btnRusso.setOnClickListener(v -> escolherIdiomaEAbrir("ru-RU"));
    }

    private void escolherIdiomaEAbrir(String idioma) {
        AppCompatDelegate.setApplicationLocales(
                LocaleListCompat.forLanguageTags(idioma)
        );

        Intent intent = new Intent(welcome.this, MainActivity.class);
        startActivity(intent);


    }
}
