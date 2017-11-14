package com.example.cristian.compraventa;

import android.media.Image;
import android.provider.ContactsContract;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.Phone;

import java.util.Date;

/**
 * Created by Cristian on 14/11/2017.
 */
/*La clase de usuario tiene que estar formada, como mínimo, por un nombre de usuario, un correo electrónico y una contraseña.
Además, podrá añadirse un nombre real, una fecha de nacimiento, y una foto de perfil. Podrá añadirse más cosa en el futuro.
 */
public class Usuario {
    private String username;
    private String password; //Buscar clase para manejar contraseñas.
    private Email email;
    private String name;
    private Image profilephoto;
    //private String genre;
    private Date birthdate;
    private Phone phone;

    public Usuario (String usern, String pass, Email mail)
    {
        username = usern;
        password = pass;
        email = mail;
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getPassword()
    {
        return this.password;
    }

    public Email getEmail()
    {
        return this.email;
    }

    public String getName()
    {
        return this.name;
    }

    public Image getProfilephoto()
    {
        return this.profilephoto;
    }

    public Date getBirthdate()
    {
        return this.birthdate;
    }

    public Phone getPhone()
    {
        return this.phone;
    }

    public void setName(String nam)
    {
        name = nam;
    }

    public void setProfilephoto(Image photo)
    {
        profilephoto = photo;
    }

    public void setBirthdate(Date date)
    {
        birthdate = date;
    }

    public void setPhone(Phone phon)
    {
        phone = phon;
    }

}
