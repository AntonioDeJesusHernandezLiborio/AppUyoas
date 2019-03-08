package com.al.uyoasartefloral.antonioliborio.uyoasartefloral;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Casuales extends AppCompatActivity {
    ListView lista;
    clsCasualesAdapter adapter;
    ArrayList<clsCasuales> casuales;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casuales);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lista = findViewById(R.id.lvListaCasuales);
        casuales = new ArrayList<clsCasuales>();
        casuales.add(new clsCasuales("1","Nombre 1","Descricion 1",150.00,R.drawable.logo));
        casuales.add(new clsCasuales("2","Nombre 2","Descricion 2",350.00,R.drawable.logo));
        casuales.add(new clsCasuales("3","Nombre 3","Descricion 3",250.00,R.drawable.logo));
        casuales.add(new clsCasuales("4","Nombre 4","Descricion 4",650.00,R.drawable.logo));
        casuales.add(new clsCasuales("5","Nombre 5","Descricion 5",550.00,R.drawable.logo));
        /*adapter = new clsCasualesAdapter(this,casuales);
        lista.setAdapter(adapter);*/
    }

}
