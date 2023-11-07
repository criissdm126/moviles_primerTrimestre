package com.example.clase_06_11_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IniciarActivity(View view){
        Intent intentDatos = new Intent(this, DatosActivity.class);
        intentDatos.putExtra("numero", 1);
        intentDatos.putExtra("nombre", "Laura");

        startActivity(intentDatos);
    }
}