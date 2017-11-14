package com.example.cristian.compraventa;

import android.location.Location;
import android.media.Image;

/**
 * Created by Cristian on 14/11/2017.
 */
 /* Un anuncio tiene que estar compuesto del usuario que vende el artículo, un título de entre 4 y 30 caracteres,
  entre 1 y 8 fotos, una descripción sin número máximo de caracteres, una ubicación aproximada y el precio del artículo /*
   */
public class Anuncio
{
    private Usuario user;
    private Image[] images;
    private String title;
    private String description;
    private Location location; //Leer como se usa.
    private float price;


    public Anuncio(String titulo)
    {
        title = titulo;
    }
    public Anuncio(Usuario u, Image[] im, String tit, float prec)
    {
        user = u;
        images = im; //comprobar que lo copie bien, es un array de fotos y seguramente hará falta sobreescribir el clone.
        title = tit;
        price = prec;
    }

    public Usuario getUser()
    {
        return this.user;
    }

    public Image getFirstImage()
    {
        return this.images[0];
    }

    public Image[] getAllImages()
    {
        return this.images;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getDescription()
    {
        return this.description;
    }

    public Location getLocation()
    {
        return this.location;
    }

    public float getPrice()
    {
        return this.price;
    }

    public void setDescription(String desc)
    {
        description = desc;
    }

    public void setLocation(Location loc)
    {
        location = loc;
    }

}
