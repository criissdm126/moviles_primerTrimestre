package com.example.listview_personalizado;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;


public class MiAdaptadorEjemplo extends ArrayAdapter<Ejemplo> {
    Context ctx;
    int layoutTemplate;

    List<Ejemplo> ejemploList;
    public MiAdaptadorEjemplo(@NonNull Context context, int resource, @NonNull Ejemplo[] objects) {
        super(context, resource, objects);

        this.ctx = context;
        this.layoutTemplate = resource;
        this.ejemploList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        return super.getView(position, convertView, parent);
    }

    // MiAdaptadorEjemplo adaptadorEjemplo = new MiAdaptadorEjemplo(this, R.layout.ejemplo_item, ejemplolist);
}
