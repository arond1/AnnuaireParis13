package com.example.aurlienpc.annuaireparis13;

/**
 * Created by user on 22/08/2017.
 */
import android.content.Context;
import android.content.res.Resources;

public class Load extends Thread {
    private Resources resources;
    public Load(Resources r)
    {
        this.resources = r;
    }
    public void run()
    {
        String[] splitArray = null;
        //Resources resources=context.getResources();
        String[] donnee = resources.getStringArray(R.array.DataProf);
        //String[] donnee = getResources().getStringArray(R.array.Test);
        MainActivity.test = donnee.length;
        for(int i=0;i<donnee.length;i++)
        {
            splitArray= donnee[i].split(",");
            MainActivity.contacts.add(new Enseignant(Integer.parseInt(splitArray[0]), splitArray[1], splitArray[2]));
            splitArray = null;
        }

    }

}