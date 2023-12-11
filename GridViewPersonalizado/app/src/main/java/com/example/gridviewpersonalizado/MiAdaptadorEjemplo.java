package com.example.gridviewpersonalizado;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MiAdaptadorEjemplo  extends ArrayAdapter<Ejemplo> {

    //  DEFINICIÓN DE VARIABLES
    Context cxt;
    int layoutTemplate;
    List<Ejemplo> ejemploList;

    public MiAdaptadorEjemplo (@NonNull Context context, int  resource, @NonNull List<Ejemplo> objects){
        super(context, resource, objects);
        // A MEDIDA QUE RECIBO LOS PARÁMETROS, VAMOS A GUARDAS LAS VARIABLES
        this.cxt = context;
        this.layoutTemplate = resource;
        this.ejemploList = objects;
    }

    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View v = LayoutInflater.from(cxt).inflate(layoutTemplate, parent, false);
        // obtener la información del elemento de la lista que estamos recorriendo en ese momento
        Ejemplo elementoActual = ejemploList.get(position);

        // RESCATAR LOS ELEMENTOS DE LA INTERFAZ DE USUARIO DE LA TEMPLATE (PLANTILLA)
        TextView textViewTitulo = (TextView) v.findViewById(R.id.textViewTitulo);
        TextView textViewSubtitulo = (TextView) v.findViewById(R.id.textViewSubtitulo);
        TextView textViewNumero = (TextView) v.findViewById(R.id.textViewNumero);
        ImageView imageViewTitulo = (ImageView) v.findViewById(R.id.imageViewFoto);

        // HACER UN SET DE LA INFORMACIÓN DEL ELEMENTOACTUAL EN LOS ELEMENTOS DE LA INTERFAZ DEL USUARIO
        textViewTitulo.setText(elementoActual.getTitulo());
        textViewSubtitulo.setText(elementoActual.getSubtitulo());
        textViewNumero.setText(elementoActual.getNumeroEjemplo() + "");

        return v;
    }


}
