package com.btssio.leroybenjamin.medicalappproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        EditText editTextNom = (EditText) findViewById(R.id.editviewNomFormulaire);
        EditText editTextPrenom = (EditText) findViewById(R.id.editviewPrenomFormulaire);
        Spinner spinnerMotif = (Spinner) findViewById(R.id.spinnerMotifFormulaire);
        DatePicker datePickerNaissance = (DatePicker) findViewById(R.id.datepickerDateNaissancePatientFormulaire);
        Button buttonValider = (Button) findViewById(R.id.buttonValiderPatientFormulaire);

        public void valider (View view)
        {

        }
    }
}
