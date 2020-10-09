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
    }

    public void gerarNovaFrase(View view){
        Button bnt_NovaFrase = findViewById(R.id.bnt_novaFrase_id);

        TextView texto=findViewById(R.id.conteudo_frase);


         String[] frases = {
                "Frase 1",
                "Frase 2",
                "Frase 3",
                "Frase 4",
        };
         texto.setText( frases[0]);
        Random r = new Random();
         int i = r.nextInt(3);
    }
}