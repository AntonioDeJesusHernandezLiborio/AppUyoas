package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CorreoTerminosYCondiciones extends AppCompatActivity {
    Intent creacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo_terminos_ycondiciones);
    }

    public void pasar(View v)
    {
        creacion= new Intent(this,creacioncuenta.class);
        startActivity(creacion);
    }
}
