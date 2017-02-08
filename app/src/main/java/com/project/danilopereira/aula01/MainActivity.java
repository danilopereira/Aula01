package com.project.danilopereira.aula01;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tilValor1;
    private TextInputLayout tilValor2;
    private EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilValor1 = (TextInputLayout) findViewById(R.id.tilValor1);
        tilValor2 = (TextInputLayout) findViewById(R.id.tilValor2);
        resultado = (EditText) findViewById(R.id.resultado);
    }

    public void somar(View view) {
        int valor1 = Integer.parseInt(tilValor1.getEditText().getText().toString());
        int valor2 = Integer.parseInt(tilValor2.getEditText().getText().toString());
        int resultadoConta = valor1+valor2;

        resultado.setText(String.valueOf(resultadoConta));



    }
}
