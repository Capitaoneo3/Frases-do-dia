package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bnt_novaFrase =(Button) findViewById(R.id.bnt_novaFrase_id);

        bnt_novaFrase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gerarNovaFrase();
            }
        }
    }

    public void gerarNovaFrase(View view) {

        TextView texto = findViewById(R.id.conteudo_frase);
        texto.setText("joao");
    }


}