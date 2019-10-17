package com.brunoreis.alertdialog;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlertDialog(View view){

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        //cria titulo
        alertDialog.setTitle("Titulo");

        //cria mensagens do alerta
        alertDialog.setMessage("alertdialog teste");

        //desativa o cancelamento do alerta clicando fora
        alertDialog.setCancelable(false);

        alertDialog.setIcon(R.drawable.ic_warning_black_24dp);

        //evento ao clicar em sim
        alertDialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Sim foi clicado",Toast.LENGTH_LONG).show();
            }
        });
        //evento ao clicar em não
        alertDialog.setNegativeButton("não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Não foi clicado",Toast.LENGTH_LONG).show();
            }
        });
        //criar o alerta
        alertDialog.create();

        //mostra o alerta
        alertDialog.show();

    }
}
