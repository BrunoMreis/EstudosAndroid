package com.brunoreis.componentesbsicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoProduto;
    private TextView campoResultado;
    private CheckBox cbBranca,cbPreta,cbAzul;
    private List<String> checkBox;
    private RadioGroup rbEstoque;
    private String disponivel;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoProduto = findViewById(R.id.txtInput);
        campoResultado = findViewById(R.id.txtResultado);
        checkBox  = new ArrayList<>();
        cbBranca = findViewById(R.id.cbBranca);
        cbPreta = findViewById(R.id.cbPreta);
        cbAzul = findViewById(R.id.cbAzul);
        rbEstoque = findViewById(R.id.rbEstoque);

        verificaRadioGroup();


    }

    public String verificaCheckBox(){
        checkBox.clear();
        if(cbBranca.isChecked()){
            checkBox.add(cbBranca.getText().toString());
        }
        if(cbPreta.isChecked()){
            checkBox.add(cbPreta.getText().toString());
        }
        if(cbAzul.isChecked()){
            checkBox.add(cbAzul.getText().toString());
        }
        return checkBox.toString();

        //campoResultado.setText(checkBox.toString());
    }

    public String verificaRadioGroup(){

        rbEstoque.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                if(checkedId == R.id.radioSim){
                    texto = findViewById(R.id.radioSim);
                    campoResultado.setText(texto.getText());
                }
                else if(checkedId == R.id.radioNao){
                     texto = findViewById(R.id.radioNao);
                    campoResultado.setText(texto.getText());
                }
            }
        });

        return texto.toString();
    }

    public void btnEnviar(View view){
        String nomeProduto = campoProduto.getText().toString();

        campoResultado.setText("{nomeProduto:"+nomeProduto +",cores: "+ verificaCheckBox()+",Disponivel:"+
                verificaRadioGroup()+"}");



    }

}
