package com.example.examen_cristimademaria;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Alarma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma);
    }

    public void crearAlarma(View view) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);


        intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Prueba Primera Evaluación");


        intent.putExtra(AlarmClock.EXTRA_HOUR, 12);  // Hora en formato de 24 horas
        intent.putExtra(AlarmClock.EXTRA_MINUTES, 30);


        intent.putExtra(AlarmClock.EXTRA_VIBRATE, true);
        intent.putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast.makeText(this, "No se encontró una aplicación de alarma", Toast.LENGTH_SHORT).show();
        }
    }
}
