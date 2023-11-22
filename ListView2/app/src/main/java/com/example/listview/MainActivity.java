package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lista;
    private List<String> ejemploslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=(ListView) findViewById(R.id.Listviewejemplo);
        ejemploslist = new ArrayList<>();
        ejemploslist.add("Ejemplo 1");
        ejemploslist.add("Ejemplo 2");
        ejemploslist.add("Ejemplo 3");
        ejemploslist.add("Ejemplo 4");

        ArrayAdapter<String> adaptadorEjemplo = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                ejemploslist
        );

        lista.setAdapter(adaptadorEjemplo);
        
        // EVENTO CLICK SOBRE CADA ELEMENTO DE LA LISTA
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"El ejemplo seleccionado es: " + ejemploslist.get(position), Toast.LENGTH_SHORT).show();
    }
}