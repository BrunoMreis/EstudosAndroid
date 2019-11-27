package com.brunoreis.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    private TextView textNome;
    private TextView textIdade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        Bundle dados = getIntent().getExtras();
        textIdade.setText(""+dados.getInt("idade"));
        textNome.setText(dados.getString("nome"));
    }
}
