package com.example.aurlienpc.annuaireparis13;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by AurélienPC on 20/07/2017.
 */

public class EnseignantAdapter extends Adapter <ContactViewHolder> {

    private Context context;
    private ArrayList<Enseignant> listeEnseignants;


    public EnseignantAdapter(Context contexte, ArrayList<Enseignant> enseignants){
        this.context = contexte;
        this.listeEnseignants = enseignants;
        notifyDataSetChanged();
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View cell = LayoutInflater.from(this.context).inflate(R.layout.content_cell,parent,false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(cell);
        cell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) v.findViewById(R.id.tv_nomEnseingant);
                Toast.makeText(context,""+tv.getText(),Toast.LENGTH_SHORT).show();
            }
        });
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
