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


        registerForContextMenu(btnShowMenu);

        btnShowMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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

        int groupId = item.getGroupId();

        if (groupId == R.id.groupCataluna || groupId == R.id.groupMadrid || groupId == R.id.groupAragon) {
            mostrarPoblaciones(item.getTitle().toString());
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }


    private void mostrarPoblaciones(String provincia) {
        String mensaje = "Poblaciones de " + provincia + ": Población1, Población2, Población3";
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
