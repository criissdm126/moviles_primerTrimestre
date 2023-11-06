package com.example.clase13_10_23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        public void  secondActivity(View view){
            Intent intent = new Intent(MainActivity.this, ActivitySecundario.class);
            startActivity(intent);
        }

        /*Log.i("TAG cicloVida ", "CicloVida: onStart");

        i = 0;*/
    }

        /*texto = (TextView) findViewById(R.id.txtEvento);
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Has hecho click en el escuchador", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    protected void  onStart(){
        super.onStart();
        Log.i("TAG cicloVida ", "CicloVida: onCreate");
        i++;
    }


    @Override
    protected void  onResume(){
        super.onResume();

        Log.i("TAG ciloVida" , "CicloVida: onResume");
        i++;
    }

    @Override
    public void  onPause(){
        super.onPause();
        Log.i("TAG cicloVida ", "CicloVida: onPause");
        i ++;
    }
    @Override
    public void  onStop(){
        super.onStop();
        Log.i("TAG cicloVida ", "CicloVida: onStop");
        i --;
    }
    @Override
    public void  onDestroy(){
        super.onDestroy();
        Log.i("TAG cicloVida ", "CicloVida: onDestroy");
        i--;
    }

    public void initSecActivity(View view){
        Toast.makeText(this, "has hecho click en el texto", Toast.LENGTH_LONG).show();
    }*/
    
    public void  secondActivity(View view){
        Intent intent = new Intent(MainActivity.this, ActivitySecundario.class);
        startActivity(intent);
    }
}