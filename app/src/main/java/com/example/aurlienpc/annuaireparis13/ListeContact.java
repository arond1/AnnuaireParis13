package com.example.aurlienpc.annuaireparis13;

/**
 * Created by AurélienPC on 20/07/2017.
 */

public class ListeContact {
    public static final Enseignant[] liste = new Enseignant[]{
            new Enseignant(1,"Khafif","Khafif@test.fr"),
            new Enseignant(2, "Hébert","Khafif@test.fr" ),
            new Enseignant(3,"Peker","Khafif@test.fr"),
            new Enseignant(4,"Kristikis","Khafif@test.fr"),
            new Enseignant(5,"Butelle","Khafif@test.fr"),
            new Enseignant(6,"Dubacq","Khafif@test.fr"),
            new Enseignant(7,"Deselligny","Khafif@test.fr"),
            new Enseignant(8,"Torti","Khafif@test.fr"),
            new Enseignant(9,"Gayral","Khafif@test.fr"),
            new Enseignant(10,"Henrio","Khafif@test.fr"),
            new Enseignant(11,"Roy","Khafif@test.fr"),
            new Enseignant(12,"Chuck Norris","Khafif@test.fr")
    };

    public static Enseignant getEnseignant(int position)
    {
        return ListeContact.liste[position];
    }
}
