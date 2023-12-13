package com.example.pruebafragmentodinamico;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaction;
    FragmentoInicio fragmentInicio;
    FragmentoRojo fragmentRojo;
    FragmentoVerda fragmentVerde;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        fragmentInicio = new FragmentoInicio();
        fragmentRojo = new FragmentoRojo();
        fragmentVerde = new FragmentoVerda();
    }

    public void onClick(View view){
        transaction = getSupportFragmentManager().beginTransaction();
        switch(view.getId()){
            case R.id.btnRojo:
                transaction.replace(R.id.contenedeorFragmentos,fragmentRojo).commit();
                transaction.addToBackStack(null);
                break;
            case R.id.btnVerde:
                transaction.replace(R.id.contenedeorFragmentos,fragmentVerde).commit();
                transaction.addToBackStack(null);
                break;
        }
        transaction.commit();
    }
}