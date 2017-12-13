package com.btssio.leroybenjamin.medicalappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class PatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);

        ArrayList<Patient> lesPatients = new ArrayList<Patient>();
        /*lesPatients.add(new Patient("Dupuis", "Joseph", "20/12/1960", "1"));
        lesPatients.add(new Patient("Dupont", "Claire", "18/12/1997", "2"));
        //lesPatients.add(new Patient("Champs", "Olivier", new Date(02/03/1978, "C413", R.drawable.olivier));*/
        Patient monPatient = Patient.first(Patient.class);
        lesPatients.add(monPatient);
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
