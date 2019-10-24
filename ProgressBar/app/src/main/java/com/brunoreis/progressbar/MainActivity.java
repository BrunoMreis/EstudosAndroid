package com.brunoreis.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;



public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private ProgressBar progressBarCarregamento;
    private int progresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        progressBarCarregamento = findViewById(R.id.progressBarCarregamento);
        progressBarCarregamento.setVisibility(View.GONE);
     }


    public void carregar(final View view){

        progresso = 0;
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (progresso<=100){

                    System.out.println(progresso);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressBarCarregamento.setVisibility(View.VISIBLE);
                            progressBar.setProgress(progresso);

                            if (progresso == 100) {
                                progressBarCarregamento.setVisibility(View.GONE);

                            }
                        }
                    });

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    progresso++;
                }
            }
        }).start();


        }


    }

