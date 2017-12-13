package com.btssio.leroybenjamin.medicalappproject;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
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
        final DatePicker calendarDate = (DatePicker) findViewById(R.id.calendarDate);
        final Button buttonValider = (Button) findViewById(R.id.buttonValiderPatientFormulaire);

        List<String> spinnerArray =  new ArrayList<String>();
        spinnerArray.add("Cancer");
        spinnerArray.add("Mal à la tête");
        spinnerArray.add("Amputation");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.spinnerMotifFormulaire);
        sItems.setAdapter(adapter);

        buttonValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = calendarDate.getYear();
                int month = calendarDate.getMonth();
                int day = calendarDate.getDayOfMonth();
                Patient monPatient = new Patient(editTextNom.getText().toString(), editTextPrenom.getText().toString(), new Date(year, month, day), spinnerMotif.getSelectedItem().toString());
                monPatient.save();
                Intent intent = new Intent(CreateActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
