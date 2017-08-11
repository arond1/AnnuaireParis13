package com.example.aurlienpc.annuaireparis13;


import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;


/**
 * Created by AurélienPC on 20/07/2017.
 */

public class ContactViewHolder extends ViewHolder {

    private final TextView nomEnseingant;

    public ContactViewHolder(View itemView) {
        super(itemView);
        this.nomEnseingant = (TextView) itemView.findViewById(R.id.tv_nomEnseingant);
    }

    public void remplirCell(Enseignant enseignant){
        this.nomEnseingant.setText(enseignant.getNom());
    }

    public TextView getTextView()
    {
        return this.nomEnseingant;
    }
}
