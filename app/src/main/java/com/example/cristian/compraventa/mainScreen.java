package com.example.cristian.compraventa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class mainScreen extends AppCompatActivity {

    private ArrayList<Anuncio> listaAnuncios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        listaAnuncios = new ArrayList<Anuncio>();
        listaAnuncios.add(new Anuncio("Gafas de sol"));
        listaAnuncios.add(new Anuncio("Samsung S6 64 Gb"));
        listaAnuncios.add(new Anuncio("Vasos de diseño"));
        listaAnuncios.add(new Anuncio("Pendrive 128ggb)"));
        listaAnuncios.add(new Anuncio("Portatil i7 6500U 4 GB RAM DDR4"));
        listaAnuncios.add(new Anuncio("Cargador de movil"));
        listaAnuncios.add(new Anuncio("Ropa vintage, todas las tallas"));
        listaAnuncios.add(new Anuncio("Mochila de diseño"));
        listaAnuncios.add(new Anuncio("Zapatillas de corer, nuevas"));
        listaAnuncios.add(new Anuncio("Raton gamer"));
        listaAnuncios.add(new Anuncio("autografo Marcelo"));
        listaAnuncios.add(new Anuncio("Discografía completa The Beattles"));
        listaAnuncios.add(new Anuncio("Telefono chino, 16 gb y 1 ram"));
        listaAnuncios.add(new Anuncio("Libros Segundo Bachiller ciencias con ISBN"));

        AdaptadorAnuncios adaptador = new AdaptadorAnuncios(this);
        ListView lv1 = (ListView)findViewById(R.id.list1);
        lv1.setAdapter(adaptador);
    }

    class AdaptadorAnuncios extends ArrayAdapter<Anuncio>
    {
        AppCompatActivity appCompatActivity;
        AdaptadorAnuncios(AppCompatActivity context)
        {
            super(context, R.layout.anuncio, listaAnuncios);
            appCompatActivity = context;
        }

        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.anuncio, null);

            TextView textView1 = (TextView)item.findViewById(R.id.textView);
            textView1.setText(listaAnuncios.get(position).getTitle());
            textView1.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    Intent intent = new Intent(this, anuncio_extended.class);
                    Toast.makeText(getContext(), "Prueba", Toast.LENGTH_SHORT).show();
                }
            });

            return(item);
        }
    }
}
