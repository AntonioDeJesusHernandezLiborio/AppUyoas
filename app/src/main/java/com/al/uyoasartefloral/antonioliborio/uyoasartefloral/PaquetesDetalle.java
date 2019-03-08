package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PaquetesDetalle extends AppCompatActivity {

    ImageView img;
    TextView titulo, descripcion, costo, id;
    Bundle datapaquete;
    clsPaquete unPaquete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paquetes_detalle);

        img = findViewById(R.id.paqd_imgFoto);
        titulo = findViewById(R.id.paqd_lbltitulo);
        descripcion = findViewById(R.id.paqd_lbldescripcion);
        costo = findViewById(R.id.paqd_lblPrecio);
        id = findViewById(R.id.paqd_lblid);

        datapaquete = getIntent().getExtras();
        unPaquete = null;

        if (datapaquete!=null){
            unPaquete = (clsPaquete) datapaquete.getSerializable("paquete");

            titulo.setText(unPaquete.getPaq_nombre());
            descripcion.setText(unPaquete.getPaq_descripcion());
            costo.setText("$ "+unPaquete.getPaq_precio());
            id.setText(unPaquete.getPaq_id());
            img.setImageResource(unPaquete.getPaq_imagen());
        }
    }
}
