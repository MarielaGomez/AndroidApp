package com.marugocode.operadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvresultado = findViewById(R.id.tvResultado);
        Bundle datos = getIntent().getExtras();
        int numero1 = datos.getInt("numero1");
        int numero2 = datos.getInt("numero2");
        String operaciones = datos.getString("operacion");

        switch (operaciones){
            case "SUMA":
                int suma = numero1 + numero2;
                tvresultado.setText(numero1+ " + " + numero2 + " = " + suma);
                break;
            case "RESTA":
                int resta = numero1 - numero2;
                tvresultado.setText(numero1+ " - " + numero2 + " = " + resta);
                break;
            case "MULTIPLICACION":
                int multi = numero1 * numero2;
                tvresultado.setText(numero1+ " x " + numero2 + " = " + multi);
                break;
            case "DIVISION":
                int division = numero1 * numero2;
                tvresultado.setText(numero1+ " / " + numero2 + " = " + division);
                break;


        }
    }
    public void volver(View v){
        finish();
    }
}