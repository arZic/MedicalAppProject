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

        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("1");
        spinnerArray.add("2");
        spinnerArray.add("3");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.spinner_motifDetails);
        sItems.setAdapter(adapter);

        final Patient monPatient = (Patient) getIntent().getSerializableExtra("Patient");
        final Spinner monSpinner = (Spinner) findViewById(R.id.spinner_motifDetails);

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
                //Toast.makeText(DetailsActivity.this, monPatient.get_motif().toString(), Toast.LENGTH_SHORT).show();
                //monPatient.set_motif(""+monSpinner);
                //textViewMotif.setText(""+monSpinner.toString());
                //monPatient.update();
            }
        });

        buttonSupprimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                monPatient.delete();
                Intent intent = new Intent(DetailsActivity.this, PatientActivity.class);
                startActivity(intent);
            }
        });
    }
}
