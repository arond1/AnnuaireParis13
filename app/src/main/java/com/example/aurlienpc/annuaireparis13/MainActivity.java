package com.example.aurlienpc.annuaireparis13;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    public static ArrayList<Enseignant> contacts = new ArrayList<>();
    private RecyclerView rvListeEnseignants;
    public static int test = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread T1 = new Load(getResources());
        T1.start();
        activerBouton();
        this.rvListeEnseignants = (RecyclerView) this.findViewById(R.id.rv_contacts);
        LinearLayoutManager l = new LinearLayoutManager(this);
        this.rvListeEnseignants.setLayoutManager(l);
        //ArrayList<Enseignant> contacts = makeListContact(ListeContact.liste);
        try {
            T1.join();
            Toast.makeText(this, "Wesh", Toast.LENGTH_LONG).show();
        }
    catch (InterruptedException e) {
        Toast.makeText(this, "coucou", Toast.LENGTH_LONG).show();
    }
        Toast.makeText(this, "Thread Finit" + test, Toast.LENGTH_LONG).show();
        EnseignantAdapter adapter = new EnseignantAdapter(this, contacts);
        this.rvListeEnseignants.setAdapter(adapter);
        rvListeEnseignants.setNestedScrollingEnabled(false);
    }

    public void activerBouton()
    {
        Button credit = (Button) findViewById(R.id.button_credit);
        credit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this,CreditActivity.class);
                        MainActivity.this.startActivity(intent);
                    }
                }
        );
    }

    private ArrayList<Enseignant> makeListContact(Enseignant[] liste) {
        ArrayList<Enseignant> contacts = new ArrayList<>();

            for(int i=0;i<liste.length;i++)
            {
                contacts.add(liste[i]);
            }
            return contacts;
    }
}
