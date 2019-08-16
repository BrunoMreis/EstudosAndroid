package com.reis.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.reis.myapplication.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        this.opcaoSelecionada("pedra");
    }

    public void selecionarPapel(View view){

        this.opcaoSelecionada("papel");
    }

    public void selecionarTesoura(View view){

        this.opcaoSelecionada("tesoura");
    }

    void opcaoSelecionada(String selacaoUsuario){
            System.out.println(selacaoUsuario);

            int numero = new Random().nextInt(3);
            String ecolhaDoApp = ecolhaDoApp(numero);
            verificaGanhador(ecolhaDoApp,selacaoUsuario);

    }


    String ecolhaDoApp(int caso){
        ImageView imageView = findViewById(R.id.imageResultado);

        switch ((caso+1)){
            case 1:
                // código retorno pedra
                imageView.setImageResource(R.drawable.pedra);
                return "pedra";

            case 2:
                //código para papel
                imageView.setImageResource(R.drawable.papel);
                return "papel";

            case 3:
                //código para tesoura
                imageView.setImageResource(R.drawable.tesoura);
                return "tesoura";

        }
        return "";
    }

    void verificaGanhador(String escolhaDoApp, String escolhaDoUsuario){
        if(//Verifica se app Ganhou
                (escolhaDoApp=="pedra" && escolhaDoUsuario =="tesoura") ||
                (escolhaDoApp=="papel" && escolhaDoUsuario =="pedra") ||
                (escolhaDoApp=="tesoura" && escolhaDoUsuario =="papel")

        ){//Altera texto
            TextView texto = findViewById(R.id.txtTexto);
            texto.setText("Você PERDEU!!!!!! ");
        }else if(//Verifa se usuário Venceu
                escolhaDoApp != escolhaDoUsuario

        ){//Altera texto
            TextView texto = findViewById(R.id.txtTexto);
            texto.setText("Você GANHOU :-) ");

        }else{//Empate
            //Altera texto
            TextView texto = findViewById(R.id.txtTexto);
            texto.setText("Empate TENTE NOVAMENTE! ");

        }
    }

}