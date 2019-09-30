package com.brunoreis.lcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText txtAlcool;
    private TextInputEditText txtGasolina;
    private double alcool;
    private double gasolina;

    TextView txtvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calcula(View view){
         txtAlcool= findViewById(R.id.inputAlcool);
         txtGasolina = findViewById(R.id.inputGasolina);

         alcool = Double.parseDouble(txtAlcool.getText().toString());
         gasolina = Double.parseDouble(txtGasolina.getText().toString());

        txtvResultado = findViewById(R.id.txtvResultado);

        if(alcool <= (gasolina*0.7) ){
            txtvResultado.setText("Melhor usar o álcool!!!");
        }
        else{
            txtvResultado.setText("Melhor usar a Gasolina!!!");
        }

    }
}
