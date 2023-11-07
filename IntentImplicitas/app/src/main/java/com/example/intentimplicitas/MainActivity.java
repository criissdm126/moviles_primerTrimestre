package com.example.intentimplicitas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  crearAlarma (View view){
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Ir al trabajo")
                .putExtra(AlarmClock.EXTRA_HOUR, 20)
                .putExtra(AlarmClock.EXTRA_MINUTES, 38);
        startActivity(intent);
    }
}