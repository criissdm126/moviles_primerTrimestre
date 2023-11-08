package com.example.alarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Número de teléfono al que se realizará la llamada
                String phoneNumber = "123456789";

                // Crear un intent con ACTION_DIAL
                Intent intent = new Intent(Intent.ACTION_DIAL);

                // Establecer el número de teléfono en el URI
                intent.setData(Uri.parse("tel:" + phoneNumber));

                // Iniciar la actividad del marcador telefónico
                startActivity(intent);
            }
        });
    }
}