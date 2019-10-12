package com.brunoreis.lcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtAlcool;
    private EditText txtGasolina;
    private double alcool;
    private double gasolina;
    private String stringAlcool;
    private String stringGasolina;

    private TextView txtvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAlcool= findViewById(R.id.inputAlcool);
        txtGasolina = findViewById(R.id.inputGasolina);
    }



    public void calcula(View view){

         stringAlcool = txtAlcool.getText().toString();
         stringGasolina = txtGasolina.getText().toString();


         validaCampos(stringAlcool,stringGasolina);
    }

    public void validaCampos(String stringAlcool,String stringGasolina){
        txtvResultado = findViewById(R.id.txtvResultado);
        if(stringAlcool == null || stringAlcool.equals("")){
            txtvResultado.setText("Preencha os Campos corretamente!!!");
        }
        else if(stringGasolina == null || stringGasolina.equals("")){
            txtvResultado.setText("Preencha os Campos corretamente!!!");
        } else {
            alcool = Double.parseDouble(stringAlcool);
            gasolina = Double.parseDouble(stringGasolina);


            if (alcool <= (gasolina * 0.7)) {
                txtvResultado.setText("Melhor usar o álcool!!!");
            } else {
                txtvResultado.setText("Melhor usar a Gasolina!!!");
            }
        }
    }
}
