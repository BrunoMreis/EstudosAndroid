package com.brunoreis.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;


import com.brunoreis.cardview.R;
import com.brunoreis.cardview.adapter.PostagemAdapter;
import com.brunoreis.cardview.model.Postagem;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);



        //Definir Layout
        // RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerPostagem.setLayoutManager(layoutManager);


        //Definir PostagemAdapter
        this.prepararPostagem();
        PostagemAdapter adapter = new PostagemAdapter( postagens);
        recyclerPostagem.setAdapter( adapter );
    }

    public void prepararPostagem(){
        postagens = new ArrayList<>();
        this.postagens.add(new Postagem("Bruno M Reis","Testestesteste", R.drawable.imagem1));
        this.postagens.add(new Postagem("Bruno M Reis","Testestesteste", R.drawable.imagem2));
        this.postagens.add(new Postagem("Bruno M Reis","Testestesteste", R.drawable.imagem3));
        this.postagens.add(new Postagem("Bruno M Reis","Testestesteste", R.drawable.imagem4));

    }
}
