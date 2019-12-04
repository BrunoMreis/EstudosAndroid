package com.brunoreis.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Cara extends AppCompatActivity {
    private Button btnVoltar;
    private Integer numero;
    private ImageView moeda;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara);

        moeda = findViewById(R.id.imgMoeda);

        btnVoltar = findViewById(R.id.btnVoltar);

        Bundle bundle = getIntent().getExtras();

        numero = bundle.getInt("numero");

        if(numero == 0){
            moeda.setImageResource(R.drawable.moeda_cara);
        }else
        {
            moeda.setImageResource(R.drawable.moeda_coroa);
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
