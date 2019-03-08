package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class clsCasualesAdapter extends BaseAdapter {
    Fragment activity;
    ArrayList<clsCasuales> datos;

    public clsCasualesAdapter(Fragment contexto, ArrayList fuente){
        activity=contexto;
        datos=fuente;
    }

    @Override
    public int getCount() {
        return datos.size();
    }

    @Override
    public Object getItem(int position) {
        return datos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) activity.getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.registrocasuales,null);
        }
        clsCasuales casuales = datos.get(position);

        TextView titulo = v.findViewById(R.id.lblTituloCasuales);
        TextView descripcion = v.findViewById(R.id.lblDescripcionCasuales);
        TextView precio = v.findViewById(R.id.lblPrecioCasuales);
        TextView id = v.findViewById(R.id.lblIdCasuales);
        ImageView imagen = v.findViewById(R.id.imagenCasuales);


        titulo.setText(casuales.getNombre());
        descripcion.setText(casuales.getDescripcion());
        precio.setText("$ "+ casuales.getPrecio());
        id.setText(casuales.getId());
        imagen.setImageResource(casuales.getImagen());

        return v;
    }
}
