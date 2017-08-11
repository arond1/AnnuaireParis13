package com.example.aurlienpc.annuaireparis13;

/**
 * Created by AurélienPC on 07/08/2017.
 */

public class Enseignant {
    private long id;
    private String nom;
    private String mail;

    public Enseignant(long id,String nom, String mail)
    {
        this.id = id;
        this.nom = nom;
        this.mail = mail;
    }

    public long getId()
    {
        return this.id;
    }

    public String getNom()
    {
        return this.nom;
    }

    public String getMail()
    {
        return this.mail;
    }

}
