package com.example.lasvocales;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp3a;
    ImageButton btna;

    ImageButton btne;
    MediaPlayer mp3e;

    ImageButton btni;
    MediaPlayer mp3i;

    ImageButton btno;
    MediaPlayer mp3o;

    ImageButton btnu;
    MediaPlayer mp3u;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btna = (ImageButton) findViewById(R.id.btna);

        mp3a = MediaPlayer.create(this, R.raw.vocal_a);
        btna.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mp3a.start();
            }
        });
            btne = (ImageButton) findViewById(R.id.btne);

            mp3e = MediaPlayer.create(this, R.raw.vocal_e);
            btne.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View view) {
                    mp3e.start();
                }
            });

            btni = (ImageButton) findViewById(R.id.btni);

            mp3i = MediaPlayer.create(this, R.raw.vocal_i);
            btni.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View view) {
                    mp3i.start();
                }
            });

            btno = (ImageButton) findViewById(R.id.btno);

            mp3o = MediaPlayer.create(this, R.raw.vocal_o);
            btno.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View view) {
                    mp3o.start();
                }
            });
            btnu = (ImageButton) findViewById(R.id.btnu);

            mp3u = MediaPlayer.create(this, R.raw.vocal_u);
            btnu.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View view) {
                    mp3u.start();
                }
            });
        }
    }
