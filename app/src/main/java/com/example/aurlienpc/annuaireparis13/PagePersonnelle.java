package com.example.aurlienpc.annuaireparis13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class PagePersonnelle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_personnelle);
        Intent enseignant = this.getIntent();
        String nom = enseignant.getStringExtra("enseignantCible");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recupRessources(nom);
    }

    public void recupRessources(String nom)
    {
        TextView tv_nom = (TextView) findViewById(R.id.enseignant_cible);
        TextView tv_mail = (TextView) findViewById(R.id.mail);
        tv_nom.setText(nom);
        int i = 0;
        while(!(nom.equals(ListeContact.liste[i].getNom())))
        {
            i++;
        }
        Enseignant cible = ListeContact.getEnseignant(i);
        tv_mail.setText(cible.getMail());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
