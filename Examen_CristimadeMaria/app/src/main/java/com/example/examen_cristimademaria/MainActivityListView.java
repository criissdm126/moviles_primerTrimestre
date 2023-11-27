package com.example.examen_cristimademaria;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityListView extends AppCompatActivity {

    private ListView lista;

    private List<Lista> ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lista = (ListView) findViewById(R.id.Listviewejemplo);
        ListView = new ArrayList<>();
        ListView.add(new Lista("Jose Julian Saavedra 1",2));


        // MiAdapatador adapatador = new MiAdapatador(this, R.layout.lista_item, ListView);

        //lista.setAdapter(adapatador);

    }
}