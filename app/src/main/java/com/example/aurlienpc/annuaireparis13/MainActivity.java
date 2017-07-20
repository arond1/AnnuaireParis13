package com.example.aurlienpc.annuaireparis13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvListeEnseignants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.rvListeEnseignants = (RecyclerView) this.findViewById(R.id.rv_contacts);
        LinearLayoutManager l = new LinearLayoutManager(this);
        this.rvListeEnseignants.setLayoutManager(l);
        ArrayList<String> contacts = makeListContact(ListeContact.liste);
        EnseignantAdapter adapter = new EnseignantAdapter(this, contacts);
        this.rvListeEnseignants.setAdapter(adapter);
    }

    private ArrayList<String> makeListContact(String[] liste) {
        ArrayList<String> contacts = new ArrayList<String>();

            for(int i=0;i<liste.length;i++)
            {
                contacts.add(liste[i]);
            }
            return contacts;
    }
}
