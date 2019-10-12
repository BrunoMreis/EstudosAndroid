package com.brunoreis.togglebuttonswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Switch aSwitch;
    private ToggleButton toggleButton;
    private CheckBox checkBox;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.swSalvaSenha);
        toggleButton = findViewById(R.id.toggleButton);
        checkBox = findViewById(R.id.checkSalvar);
        txtResultado = findViewById(R.id.txtResultado);
    }


    public void enviar(View view){
        if(toggleButton.getText().toString().equals("Ligado")){
            txtResultado.setText("Senha Salva!");
        }else if(checkBox.isChecked()){
            txtResultado.setText("Senha Salva!");
        }else if(aSwitch.isChecked()){
            txtResultado.setText("Senha Salva!");
        }else{
            txtResultado.setText("A senha não foi Salva!");
        }
    }
}
