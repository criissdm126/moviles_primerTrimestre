package com.example.menu_contextual;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_contextual, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.Barcelona) {
            showToast("Castellet i la Gornal, Bagà, Olivella");
            return true;
        } else if (id == R.id.Girona) {
            showToast("Cadaqués, Calella de Palafrugell, Castellfollit de la Roca");
            return true;
        } else if (id == R.id.Lleida) {
            showToast("Taüll, Guimerà, Vielha");
            return true;
        } else if (id == R.id.Tarragona) {
            showToast("Montblanc, Altafulla, Tortosa");
            return true;
        } else if (id == R.id.Madrid) {
            showToast("Buitrago de Lozoya, Patones de Arriba, San Lorenzo de El Escorial");
            return true;
        } else if (id == R.id.Huesca) {
            showToast("Aínsa, Alquézar, Ansó");
            return true;
        } else if (id == R.id.Teruel) {
            showToast("Albarracín, Valderrobres, Calaceite");
            return true;
        } else if (id == R.id.Zaragoza) {
            showToast("Sos del Rey Católico, Uncastillo, Anento");
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }


    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
