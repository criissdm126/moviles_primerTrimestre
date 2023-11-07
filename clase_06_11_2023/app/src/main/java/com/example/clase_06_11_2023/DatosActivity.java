package com.example.clase_06_11_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        Bundle extras = getIntent().getExtras();
        int n = extras.getInt("numero");
        String s = extras.getString("nombre");
        Toast.makeText(this, "Numero " + n  + " y nombre "+ s, Toast.LENGTH_LONG).show();
    }
}