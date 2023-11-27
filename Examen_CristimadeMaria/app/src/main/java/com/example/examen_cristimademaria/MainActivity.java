package com.example.examen_cristimademaria;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar el botón para la opción de Cálculo de Nota
        Button calculateButton = findViewById(R.id.calculateButton);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, Calculadora.class));
                startActivity(new Intent(MainActivity.this, Alarma.class));
                startActivity(new Intent(MainActivity.this, Menu.class));
                startActivity(new Intent(MainActivity.this, AcercaDe.class));
            }
        });

        // Configurar el botón para la opción de Alarma
        Button alarmButton = findViewById(R.id.alarmButton);
        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Alarma.class));
            }
        });

        // Configurar el botón para la opción de Menú
        Button menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Menu.class));
            }
        });


        Button aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarDialogoAcercaDe();
            }
        });
    }

    private void mostrarDialogoAcercaDe() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Acerca de")
                .setMessage("Esta es la APP de (nombre completo del alumno)")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Puedes agregar lógica adicional al hacer clic en OK si es necesario
                    }
                })
                .show();
    }
}
