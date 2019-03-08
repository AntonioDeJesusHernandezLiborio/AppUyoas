package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class metodoDePago extends AppCompatActivity {

    Intent pago;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodo_de_pago);
    }
    public void pago(View v){
        pago = new Intent(this,Menu.class);
        startActivity(pago);
    }
}
