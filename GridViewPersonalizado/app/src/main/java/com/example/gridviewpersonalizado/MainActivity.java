package com.example.gridviewpersonalizado;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView  view;
    List<Ejemplo> ejemploList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (GridView) findViewById(R.id.girdViewEjemplo);

        ejemploList.add(new Ejemplo("Titulo Ejemplo 1", "Subtitulo Ejemplo 1","", 1));
        ejemploList.add(new Ejemplo("Titulo Ejemplo 2", "Subtitulo Ejemplo 2","", 2));
        ejemploList.add(new Ejemplo("Titulo Ejemplo 3", "Subtitulo Ejemplo 3","", 3));
        ejemploList.add(new Ejemplo("Titulo Ejemplo 4", "Subtitulo Ejemplo 4","", 4));

        MiAdaptadorEjemplo adaptadorEjemplo = new MiAdaptadorEjemplo(
                this,
                R.layout.ejemplo_grid_item,
                ejemploList
        );

        // lista.setAdapter(adaptadorEjemplo);
    }
}