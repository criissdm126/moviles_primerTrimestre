package com.example.eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int i;
TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAG: cicloVida", "Ciclovida: onCreate");
        i = 0;
        texto = (TextView) findViewById(R.id.txtEvento);
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Has hecho click en el botón", Toast.LENGTH_LONG).show();
            }
        });
    }

    /*public void initSecActivity(View view){
    Toast.makeText(this, "Has hecho clic en el texto", Toast.LENGTH_LONG).show();
 }*/

    /*public void onClick (View view){
        Toast.makeText(this, "Has hecho clic en el texto", Toast.LENGTH_LONG).show();
    }*/
}