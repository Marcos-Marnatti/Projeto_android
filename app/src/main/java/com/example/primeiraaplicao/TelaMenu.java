package com.example.primeiraaplicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaMenu extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);

        Button btn1 = findViewById(R.id.botao2);
        Button btn2 = findViewById(R.id.favoritos);
        Button btn3 = findViewById(R.id.config);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    public void onClick(View v){
            switch (v.getId()) {
                case R.id.botao2:
                    Intent add = new Intent(TelaMenu.this, adicionar_audio.class);
                    startActivity(add);
                    break;
                case R.id.favoritos:
                    Intent fav = new Intent(TelaMenu.this,  audios_favoritos.class);
                    startActivity(fav);
                    break;
                case R.id.config:
                    Intent conf = new Intent(TelaMenu.this,  configuracoes.class);
                    startActivity(conf);
                    break;
            }


        }

    }
