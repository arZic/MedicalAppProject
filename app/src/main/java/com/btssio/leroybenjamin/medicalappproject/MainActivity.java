package com.btssio.leroybenjamin.medicalappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewVoir = (TextView) findViewById((R.id.textviewVoir));
        TextView textViewCreer = (TextView) findViewById((R.id.textviewCreer));

        textViewVoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPatient = new Intent(MainActivity.this,PatientActivity.class);
                startActivity(intentPatient);

            }
        });

        textViewCreer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPatient = new Intent(MainActivity.this,CreateActivity.class);
                startActivity(intentPatient);

            }
        });
    }
}
