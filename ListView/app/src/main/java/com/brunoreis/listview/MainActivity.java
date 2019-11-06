package com.brunoreis.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listLocal;
    private String[] itens = {"Fernando de Noronha","São Paulo","Santos", "Maresias","Paris","Bertioga",
    "Mogi das Cruzes", "Ferraz de Vasconcelos", "Tokyo", "Rio de Janeiro", "Noroega","Turquia",
    "Berlim","Hellsink", "Amazonas", "Bonito", "Florianópolis", "Fortaleza","Vitória","Acre"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocal = findViewById(R.id.listLocais);

        //criar adaptador

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //adiciona adaptador para a lista
        listLocal.setAdapter( adapter );

        //adiciona clique na lista
        listLocal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String valorSelecionado = listLocal.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),valorSelecionado,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
