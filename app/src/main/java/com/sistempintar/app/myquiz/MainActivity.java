package com.sistempintar.app.myquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button play;
    Button about;
    Button exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button) findViewById(R.id.btn_play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
            }
        });

        about = (Button) findViewById(R.id.btn_about);
        about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                about();
            }
        });

        exit = (Button) findViewById(R.id.btn_exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit();
            }
        });
    }

    public void play() {
        Intent pindah = new Intent(this, play.class);
        MainActivity.this.finish();
        startActivity(pindah);
    }

    public void about() {
        Intent pindah = new Intent(this, about.class);
        MainActivity.this.finish();
        startActivity(pindah);
    }

    

}
