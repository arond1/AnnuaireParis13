package com.example.aurlienpc.annuaireparis13;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by AurélienPC on 20/07/2017.
 */

public class EnseignantAdapter extends Adapter <ContactViewHolder> {

    private Context context;

    private ArrayList<String> listeEnseignants;

    public EnseignantAdapter(Context contexte, ArrayList<String> enseignants){
        this.context = contexte;
        this.listeEnseignants = enseignants;
        notifyDataSetChanged();
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View cell = LayoutInflater.from(this.context).inflate(R.layout.content_cell,parent,false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(cell);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.remplirCell(this.listeEnseignants.get(position));
    }

    @Override
    public int getItemCount() {
        int item = 0;
        if(this.listeEnseignants != null)
        {
            item = listeEnseignants.size();
        }
        return item;
    }
}
