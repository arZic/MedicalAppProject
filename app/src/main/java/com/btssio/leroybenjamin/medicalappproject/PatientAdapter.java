package com.btssio.leroybenjamin.medicalappproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dormoy.corentyn on 06/12/2017.
 */

public class PatientAdapter {
    public PatientAdapter(Activity context, ArrayList<Patient> mots) {
        super(context, 0, mots);
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
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.motEn);
        nameTextView.setText(patientSelectionne.get_motEn());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.motFr);
        numberTextView.setText(patientSelectionne.get_motFr());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.iconeItem);
        iconView.setImageResource(patientSelectionne.get_image());

        return listItemView;
    }
}
