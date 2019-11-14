package com.brunoreis.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import android.widget.Toast;

import com.brunoreis.recyclerview.R;
import com.brunoreis.recyclerview.activity.RecyclerItemClickListener;
import com.brunoreis.recyclerview.activity.adapter.Adapter;
import com.brunoreis.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<Filme>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //usar essa configuração melhara a performance.
        recyclerView.setHasFixedSize(true);


        //Adiciona fime
        this.criarFilme();

        //criando adapter
        Adapter adapter = new Adapter(listaFilmes);


        //configuranando lista
        RecyclerView.LayoutManager manager =
                new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(manager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter( adapter );

        //clicando no item da lista
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getBaseContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener(){

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }

                            @Override
                            public void onItemClick(View view, int position) {

                                Toast.makeText(
                                        getBaseContext(),
                                        "Item selecionado: " + listaFilmes.get(position).getTituloFilme(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Toast.makeText(
                                        getBaseContext(),
                                        "Item selecionado longo: " + listaFilmes.get(position).getTituloFilme(),
                                        Toast.LENGTH_LONG
                                ).show();

                            }
                        }
                )
        );

    }

    private void criarFilme() {
        listaFilmes.add(new Filme("Mulher Maravilha","Ação e Aventura","2017"));
        listaFilmes.add(new Filme("Mulher Gato","Ação e Aventura","2007"));
        listaFilmes.add(new Filme("Sexta Feira 13","Terro","1990"));
        listaFilmes.add(new Filme("Jason X","Terro","1999"));
        listaFilmes.add(new Filme("Todo Mundo em Pânico","Terro","2000"));
        listaFilmes.add(new Filme("Dragon Ball: O Primeiro Guerreiro","Luta","2020"));

    }
}
