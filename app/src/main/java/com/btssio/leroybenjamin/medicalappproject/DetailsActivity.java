package com.btssio.leroybenjamin.medicalappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        /*List<Patient> patients = Patient.listAll(Patient.class);
        Patient.deleteAll(Patient.class);*/

        final List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("Cancer");
        spinnerArray.add("Mal à la tête");
        spinnerArray.add("Amputation");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner sItems = (Spinner) findViewById(R.id.spinner_motifDetails);
        sItems.setAdapter(adapter);

        final Patient monPatient = (Patient) getIntent().getSerializableExtra("Patient");

        TextView textViewNom = (TextView) findViewById(R.id.textview_nom);
        textViewNom.setText(monPatient.get_nom());

        TextView textViewPrenom = (TextView) findViewById(R.id.textview_prenom);
        textViewPrenom.setText(monPatient.get_prenom());

        TextView textViewNaissance = (TextView) findViewById(R.id.textview_naissance);
        textViewNaissance.setText(""+monPatient.get_dateNaissance());

        final TextView textViewMotif = (TextView) findViewById(R.id.textview_motif);
        textViewMotif.setText(monPatient.get_motif());

        Button btnEdit = (Button) findViewById(R.id.btn_edit);
        Button btnDelete = (Button) findViewById(R.id.btn_delete);

        Button buttonModifier = (Button) findViewById(R.id.btn_edit);
        Button buttonSupprimer = (Button) findViewById(R.id.btn_delete);

        buttonModifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<Patient> lesPatients = Patient.find(Patient.class, "_nom = ?", monPatient.get_nom());
                lesPatients.get(0).set_motif(sItems.getSelectedItem().toString());
                lesPatients.get(0).update(); // updates the previous entry with new values.
                textViewMotif.setText(lesPatients.get(0).get_motif().toString());

                /*monPatient.set_motif(monSpinner.getSelectedItem().toString());

                monPatient.update();*/

                Intent intent = new Intent(DetailsActivity.this, PatientActivity.class);
                startActivity(intent);
            }
        });

        buttonSupprimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Patient> lesPatients = Patient.find(Patient.class, "_nom = ?", monPatient.get_nom());
                //Toast.makeText(DetailsActivity.this, lesPatients.get(0).get_nom(), Toast.LENGTH_SHORT).show();
                lesPatients.get(0).delete();
                Intent intent = new Intent(DetailsActivity.this, PatientActivity.class);
                startActivity(intent);
            }
        });
    }
}
