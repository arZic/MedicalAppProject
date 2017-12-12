package com.btssio.leroybenjamin.medicalappproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by dormoy.corentyn on 06/12/2017.
 */

public class PatientAdapter extends ArrayAdapter<Patient> {
    public PatientAdapter(Activity context, ArrayList<Patient> patients) {
        super(context, 0, patients);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.liste_patients, parent, false);
        }

        Patient patientSelectionne = getItem(position);

        TextView nomTextView = (TextView) listItemView.findViewById(R.id.nom);
        nomTextView.setText("Nom : " + patientSelectionne.get_libelle());

        TextView naissanceTextView = (TextView) listItemView.findViewById(R.id.naissance);
        naissanceTextView.setText("Naissance : " + patientSelectionne.get_dateNaissance());

        TextView motifTextView = (TextView) listItemView.findViewById(R.id.chambre);
        motifTextView.setText("Chambre : " + patientSelectionne.get_chambre());

        ImageView iconeImageView = (ImageView) listItemView.findViewById(R.id.icone);
        iconeImageView.setImageResource(patientSelectionne.get_image());

        return listItemView;
    }
}
