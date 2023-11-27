package com.example.examen_cristimademaria;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculadora extends AppCompatActivity {

    private EditText numero1, numero2;
    private TextView resultado;
    private CheckBox redondearCheckbox;
    private RadioGroup showOptionRadioGroup;
    private RadioButton practicasRadioButton, conExamenRadioButton;
    private Button calcularNotaButton, borrarDatosButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        numero1 = findViewById(R.id.tvnum1);
        numero2 = findViewById(R.id.tvnum2);
        resultado = findViewById(R.id.result);
        redondearCheckbox = findViewById(R.id.redondearCheckbox);
        showOptionRadioGroup = findViewById(R.id.showOptionRadioGroup);
        practicasRadioButton = findViewById(R.id.practicasRadioButton);
        conExamenRadioButton = findViewById(R.id.conExamenRadioButton);
        calcularNotaButton = findViewById(R.id.calcularNotaButton);
        borrarDatosButton = findViewById(R.id.borrarDatosButton);


        calcularNotaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularNota();
            }
        });

        // Listener para el botón de borrar datos
        borrarDatosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borrarDatos();
            }
        });
    }

    public void calcularNota() {
        try {
            double num1 = Double.parseDouble(numero1.getText().toString());
            double num2 = Double.parseDouble(numero2.getText().toString());
            double notaMedia;

            if (practicasRadioButton.isChecked()) {
                notaMedia = (num1 + num2) / 2;
            } else if (conExamenRadioButton.isChecked()) {
                double notaExamen = 0;
                notaMedia = (num1 + num2 + notaExamen) / 3;
            } else {
                notaMedia = 0;
            }


            if (redondearCheckbox.isChecked()) {
                resultado.setText(String.valueOf(Math.round(notaMedia)));
            } else {
                resultado.setText(String.valueOf(notaMedia));
            }
        } catch (NumberFormatException e) {
            resultado.setText("Números incorrectos");
        }
    }

    public void borrarDatos() {
        numero1.setText("");
        numero2.setText("");
        resultado.setText("");
    }

}
