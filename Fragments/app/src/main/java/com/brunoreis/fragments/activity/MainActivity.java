package com.brunoreis.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.brunoreis.fragments.R;
import com.brunoreis.fragments.framents.ContatosFragment;
import com.brunoreis.fragments.framents.ConversasFragment;

public class MainActivity extends AppCompatActivity {
    private Button btnContatos, btnConversas;
    private Fragment fragmentConversas , fragmentContatos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConversas = findViewById(R.id.btnConversas);
        btnContatos = findViewById(R.id.btnContatos);


//      muda tamanho a sobra do actionBar
        getSupportActionBar().setElevation(0);

        fragmentConversas = new ConversasFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, fragmentConversas);
        transaction.commit();


        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentContatos = new ContatosFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, fragmentContatos);
                transaction.commit();
            }
        });


        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, fragmentConversas);
                transaction.commit();
            }
        });

    }
}
