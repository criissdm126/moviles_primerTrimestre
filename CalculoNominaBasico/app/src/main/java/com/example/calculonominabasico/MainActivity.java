package com.example.calculonominabasico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText txtdias, txthoras;
    private Button btnCalcular, btnBorrar;
    private TextView lblPago, lblDescuento;
    private CheckBox ckbPago, ckbDescuento;
    private RadioGroup rdbGroupRound;
    private RadioButton rdbRedondeo, rdbNoRedondeo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtdias = (EditText) findViewById(R.id.txtdias);
        txthoras = (EditText) findViewById(R.id.txtHoras);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        lblPago = (TextView) findViewById(R.id.lblpago);
        lblDescuento = (TextView) findViewById(R.id.lbldescuento);
        ckbPago = (CheckBox) findViewById(R.id.ckbPago);
        ckbDescuento = (CheckBox) findViewById(R.id.ckbDescuento);
        rdbGroupRound = (RadioGroup) findViewById(R.id.rdbgroupRound);
        rdbRedondeo = (RadioButton) findViewById(R.id.rdbRedondeo);
        rdbNoRedondeo = (RadioButton) findViewById(R.id.rdbNoredondeo);

    }
    public void Calcular (View view){
        int dias = Integer.parseInt(txtdias.getText().toString());
        int horas = Integer.parseInt(txthoras.getText().toString());
        int horas_mensuales = horas*dias;
        Double pago = horas_mensuales*13.75;
        lblPago.setText(pago+"");
        Double descuento = 0.00;
        Double sueldobase = 2200.00;

        if (ckbPago.isChecked()==true){
            lblPago.setText(String.valueOf(pago));
        }
        if (ckbDescuento.isChecked()==true && pago>2200){
            descuento = pago-(pago*0.1);
            lblDescuento.setText(String.valueOf(descuento));
        }
        if (rdbGroupRound.getCheckedRadioButtonId()==R.id.rdbRedondeo){
            int pago_redondeo =(int) Math.round(pago);
            lblPago.setText(String.valueOf(pago_redondeo));
            int descuento_redondeo = (int) Math.round(descuento);
            lblDescuento.setText(String.valueOf(descuento_redondeo));
        }


    }
    public void Borrar (View view){
        txtdias.setText("");
        txthoras.setText("");
        lblPago.setText("Pago");
        lblDescuento.setText("Con Descuento");
        ckbDescuento.setChecked(false);
        ckbPago.setChecked(false);
        rdbRedondeo.setChecked(false);
        rdbNoRedondeo.setChecked(false);
    }



}