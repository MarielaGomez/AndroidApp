package com.marugocode.operadores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText etnumero1, etnumero2; //declaro mis controles, es decir mis variables que voy a utilizar
    Spinner spoperaciones;
    Button btncalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnumero1 = findViewById(R.id.etNumero1); // acá capturo lo que se va a alojar en la variable
        etnumero2 = findViewById(R.id.etNumero2);
        spoperaciones = findViewById(R.id.spOperaciones);
     //DECLARO VARIABLE DE TIPO ARRAY STRING[]
        String[] operaciones = {"SUMA","RESTA","MULTIPLICACION","DIVISION"};
        //UNA VEZ HECHO EL ARRAY TENEMOS QUE MANDARLO PARA QUE SE MUESTRE CON ARRAYADAPTER,
        // ES UN CONTROL QUE ME PERMITE CARGAR TODO MI ARRAY HACIA UN CONTROL QUE YO QUIERA, EN ESTE
        //CASO SERIA CON SPOPERACIONES

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, operaciones);
        spoperaciones.setAdapter(adaptador);
    }

    public void mostrarResultado(View v){
        Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
        int numero1 = Integer.parseInt(etnumero1.getText().toString()); // aca de almacena
        int numero2 = Integer.parseInt(etnumero2.getText().toString());
        String operaciones = spoperaciones.getSelectedItem().toString();
        intent.putExtra("numero1",numero1);// acá se manda
        intent.putExtra("numero2",numero2);
        intent.putExtra("operacion", operaciones);

        startActivity(intent);


    }
}