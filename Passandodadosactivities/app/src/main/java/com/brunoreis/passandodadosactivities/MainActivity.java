package com.brunoreis.passandodadosactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEnviar = findViewById(R.id.btnEnviar);


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
                Usuario usuario = new Usuario("Bruno M. Reis",29);

                //passar dados
//                intent.putExtra("nome","Bruno M Reis");
//                intent.putExtra("idade",29);
                  intent.putExtra("usuario", usuario);

                startActivity(intent);

            }
        });

    }

}
