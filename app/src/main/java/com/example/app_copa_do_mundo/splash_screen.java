package com.example.app_copa_do_mundo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        VideoView splashScreenVideo = findViewById(R.id.splash_screen_video);
        View tampaSplash = findViewById(R.id.tampa_splash);

        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash_video);
        
        splashScreenVideo.setVideoURI(videoUri);

        splashScreenVideo.setOnPreparedListener(mp -> {
            mp.setLooping(false);
            splashScreenVideo.start();

            // Hide the cover 200ms after the video starts
            new Handler(Looper.getMainLooper()).postDelayed(() -> {
                tampaSplash.animate()
                        .alpha(0f)
                        .setDuration(500)
                        .withEndAction(() -> tampaSplash.setVisibility(View.GONE))
                        .start();
            }, 600);
        });

        splashScreenVideo.setOnCompletionListener(mp -> {
            Intent intent = new Intent(splash_screen.this, welcome.class);
            startActivity(intent);
            finish();
        });

        View.OnClickListener pularSplash = v -> {
            splashScreenVideo.setVisibility(View.GONE);
            irParaTelaPrincipal();
        };

        splashScreenVideo.setOnClickListener(pularSplash);
        tampaSplash.setOnClickListener(pularSplash);

    }

    private boolean jaSaiuDaSplash = false;
    private void irParaTelaPrincipal() {
        if (jaSaiuDaSplash) return;

        jaSaiuDaSplash = true;

        Intent intent = new Intent(splash_screen.this, welcome.class);
        startActivity(intent);
        finish();
    }
}
