package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class clsPaqueteAdapter extends BaseAdapter {
    Fragment paq_activity;
    ArrayList<clsPaquete> paq_datos;

    public clsPaqueteAdapter(Fragment contexto, ArrayList fuente){
        paq_activity=contexto;
        paq_datos=fuente;
    }

    @Override
    public int getCount() {
        return paq_datos.size();
    }

    @Override
    public Object getItem(int position) {
        return paq_datos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) paq_activity.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.registropaquete,null);
        }
        clsPaquete paquete = paq_datos.get(position);

        TextView titulo = v.findViewById(R.id.lblTituloPaquete);
        TextView descripcion = v.findViewById(R.id.lblDescripcionPaquete);
        TextView precio = v.findViewById(R.id.lblPrecioPaquete);
        TextView id = v.findViewById(R.id.lblIdPaquete);
        ImageView imagen = v.findViewById(R.id.imagenPaquete);


        titulo.setText(paquete.getPaq_nombre());
        descripcion.setText(paquete.getPaq_descripcion());
        precio.setText("$ "+ paquete.getPaq_precio());
        id.setText(paquete.getPaq_id());
        imagen.setImageResource(paquete.getPaq_imagen());

        return v;
    }
}
