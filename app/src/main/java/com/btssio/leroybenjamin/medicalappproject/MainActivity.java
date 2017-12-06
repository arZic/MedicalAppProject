package com.btssio.leroybenjamin.medicalappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textviewCreer = (TextView) findViewById(R.id.textviewCreer);
        TextView textviewVoir = (TextView) findViewById(R.id.textviewVoir);

        textviewCreer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentPatient = new Intent(MainActivity.this, PatientActivity.class);
                startActivity(intentPatient);
            }
        });
    }
}
