package com.example.p4;



import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import DatosParce.DatosParce;


public class PrincipalActivity extends AppCompatActivity {


    Button btnab, btnap;
    EditText txtnombre, txtedad, txtcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtnombre = findViewById(R.id.p1txtnombre);
        txtcorreo = findViewById(R.id.p1txtcorreo);
        txtedad = findViewById(R.id.p1txtedad);

        btnab = findViewById(R.id.p1btnab);
        btnap = findViewById(R.id.p1btnap);
        btnab.setOnClickListener(view -> {
            Intent lanza = new Intent(PrincipalActivity.this, BasicaActivity.class);
            lanza.putExtra( "nombre", txtnombre.getText().toString());
            startActivity(lanza);
        });

        btnap.setOnClickListener(view -> {
            DatosParce datosParce = new DatosParce(txtnombre.getText().toString(), txtcorreo.getText().toString(), Integer.parseInt(txtedad.getText().toString()));
            Intent lanza = new Intent(PrincipalActivity.this, ParceActivity.class);
            lanza.putExtra("datosparcelables", datosParce);
            startActivity(lanza);
        });
    }


}
