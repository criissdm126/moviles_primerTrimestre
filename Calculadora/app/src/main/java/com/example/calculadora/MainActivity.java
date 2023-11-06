package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText numero1, numero2;
    private TextView resultado;
    private Button suma, resta, mult, division, borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.tvnum1);
        numero2 = (EditText)  findViewById(R.id.tvnum2);
        resultado = (TextView)  findViewById(R.id.tvresult);
        suma = (Button) findViewById(R.id.suma);
        resta = (Button) findViewById(R.id.resta);
        mult = (Button) findViewById(R.id.mult);
        division = (Button) findViewById(R.id.division);
        borrar = (Button) findViewById(R.id.borrar);
    }

    public void sumar(View view) {
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        double sum = num1 + num2;
        resultado.setText(String.valueOf(sum));
    }

    public void restar(View view) {
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        double resta;
        if (num1 > num2){
            resta = num1-num2;
        } else if (num2 > num1) {
            resta = num1 - num2;
            resta *=-1;
        }
        else {
            resta = 0;
        }
        resultado.setText(String.valueOf(resta));
    }

    public void multiplicar(View view) {
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        double producto = num1 * num2;
        resultado.setText(String.valueOf(producto));
    }

    public void dividir(View view) {
        double num1 = Double.parseDouble(numero1.getText().toString());
        double num2 = Double.parseDouble(numero2.getText().toString());
        if (num2 != 0) {
            double division = num1 / num2;
            resultado.setText(String.valueOf(division));
        } else {
            resultado.setText("Error: División por cero");
        }
    }

    public void borrar(View view) {
        numero1.setText("");
        numero2.setText("");
        resultado.setText("");
    }
}