package com.brunoreis.calculagorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText inputValor;
    private SeekBar seekBar;
    private TextView textPorcentagem;
    private TextView textValorGorjeta;
    private TextView textTotal;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputValor = findViewById(R.id.inputValor);
        seekBar = findViewById(R.id.seekBar);
        textPorcentagem = findViewById(R.id.textPorcentagem);
        textValorGorjeta = findViewById(R.id.textValorGorjeta);
        textTotal = findViewById(R.id.textTotal);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textPorcentagem.setText(progress + "%");
                Double gorjeta = Double.parseDouble(inputValor.getText().toString());
                gorjeta = gorjeta * progress /100;
                textValorGorjeta.setText("R$ "+ gorjeta );
                Double total = Double.parseDouble(inputValor.getText().toString());
                total += gorjeta;
                textTotal.setText("R$ " + total);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
