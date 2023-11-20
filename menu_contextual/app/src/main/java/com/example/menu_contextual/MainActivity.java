package com.example.menu_contextual;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowMenu = findViewById(R.id.btnShowMenu);

        // Registra el botón para el menú contextual
        registerForContextMenu(btnShowMenu);

        btnShowMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre el menú contextual al hacer clic en el botón
                openContextMenu(view);
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if (v.getId() == R.id.btnShowMenu) {
            getMenuInflater().inflate(R.menu.menu_contextual, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.Barcelona ||
                itemId == R.id.Girona ||
                itemId == R.id.Lleida ||
                itemId == R.id.Tarragona ||
                itemId == R.id.Comunidad_Madrid ||
                itemId == R.id.Huesca ||
                itemId == R.id.Teruel ||
                itemId == R.id.Zaragoza) {

            mostrarPoblaciones(item.getTitle().toString());
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }

    private void mostrarPoblaciones(String provincia) {
        // Aquí puedes personalizar el mensaje con las poblaciones de la provincia
        String mensaje = "Poblaciones de " + provincia + ": Población1, Población2, Población3";
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
