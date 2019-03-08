package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class creacioncuenta extends AppCompatActivity {
    Intent metodo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creacioncuenta);
    }
    public void metodoP(View v){
        metodo= new Intent(this,metodoDePago.class);
        startActivity(metodo);
    }
}
