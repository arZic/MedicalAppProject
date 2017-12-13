package com.btssio.leroybenjamin.medicalappproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.orm.SugarRecord;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        final EditText editTextNom = (EditText) findViewById(R.id.editviewNomFormulaire);
        final EditText editTextPrenom = (EditText) findViewById(R.id.editviewPrenomFormulaire);
        final Spinner spinnerMotif = (Spinner) findViewById(R.id.spinnerMotifFormulaire);
        //final DatePicker datePickerNaissance = (DatePicker) findViewById(R.id.datepickerDateNaissancePatientFormulaire);
        final EditText editTextDate = (EditText) findViewById((R.id.edittextDate));
        final Button buttonValider = (Button) findViewById(R.id.buttonValiderPatientFormulaire);

        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("1");
        spinnerArray.add("2");
        spinnerArray.add("3");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.spinnerMotifFormulaire);
        sItems.setAdapter(adapter);

        buttonValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Patient monPatient = new Patient("Dupuis", "Joseph", new Date(20/12/1960), "C410", R.drawable.joseph);
                Patient monPatient = new Patient(""+editTextNom, ""+editTextPrenom, ""+editTextDate, ""+spinnerMotif);
                monPatient.save();
                //Patient patientbdd = Patient.first(Patient.class);
                //Toast.makeText(CreateActivity.this, patientbdd.get_nom(), Toast.LENGTH_SHORT).show();
            }
        });

        /*final Button buttonVoir = (Button) findViewById(R.id.buttonVoirPatientFormulaire);


        buttonVoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Patient> patients = Patient.listAll(Patient.class);
                Toast.makeText(CreateActivity.this, "", Toast.LENGTH_LONG).show();
            }
        });*/
    }

}
