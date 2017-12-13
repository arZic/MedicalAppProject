package com.btssio.leroybenjamin.medicalappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);



        //List<Patient> patients = Patient.listAll(Patient.class);
        ArrayList<Patient> lesPatients = new ArrayList<Patient>();
        Iterator<Patient> iteratorPatient = Patient.findAll(Patient.class);

        while(iteratorPatient.hasNext())

        // (Iterator<Patient> i = lesPatients.iterator(); i.hasNext();)
        {
            Patient item = iteratorPatient.next();
            lesPatients.add(item);
        }

        /*ArrayList<Patient> lesPatients = new ArrayList<Patient>();
        Patient monPatient = Patient.last(Patient.class);
        lesPatients.add(monPatient);*/

        PatientAdapter adapterPatients = new PatientAdapter(this, lesPatients);
        ListView listViewPatients = (ListView) findViewById(R.id.listView_patients);
        listViewPatients.setAdapter(adapterPatients);

         listViewPatients.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Patient monPatient;
                monPatient = (Patient) adapterView.getItemAtPosition(i);
                Intent intent = new Intent(PatientActivity.this, DetailsActivity.class);
                intent.putExtra("Patient", (Serializable)monPatient);
                startActivity(intent);
            }
        });
    }
}
