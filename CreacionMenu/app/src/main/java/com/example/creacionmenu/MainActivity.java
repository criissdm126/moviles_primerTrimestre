package com.example.creacionmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu mimenu){
        getMenuInflater().inflate(R.menu.menu, mimenu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu){
        int id = opcion_menu.getItemId();
        if (id==R.id.Opcion_menu_1){
            Toast.makeText(this, "Opción menú 1", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id==R.id.Opcion_menu_2){
            Toast.makeText(this, "Opción menú 2", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id==R.id.Opcion_menu_3){
            Toast.makeText(this, "Opción menú 3", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(opcion_menu);
    }
}