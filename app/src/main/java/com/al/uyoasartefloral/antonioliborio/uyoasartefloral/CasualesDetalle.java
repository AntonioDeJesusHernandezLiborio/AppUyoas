package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CasualesDetalle extends AppCompatActivity {
    ImageView img;
    TextView titulo, descripcion, costo, id;
    Bundle datacasual;
    clsCasuales unCasual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casuales_detalle);
        img = findViewById(R.id.cd_imgFoto);
        titulo = findViewById(R.id.cd_lbltitulo);
        descripcion = findViewById(R.id.cd_lbldescripcion);
        costo = findViewById(R.id.cd_lblPrecio);
        id = findViewById(R.id.cd_lblid);

        datacasual = getIntent().getExtras();
        unCasual = null;

        if (datacasual!=null){
            unCasual = (clsCasuales) datacasual.getSerializable("casual");

            titulo.setText(unCasual.getNombre());
            descripcion.setText(unCasual.getDescripcion());
            costo.setText("$ "+unCasual.getPrecio());
            id.setText(unCasual.getId());
            img.setImageResource(unCasual.getImagen());
        }
    }
}
