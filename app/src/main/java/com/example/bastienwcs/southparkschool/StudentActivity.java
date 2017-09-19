package com.example.bastienwcs.southparkschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        String firstname = getIntent().getStringExtra("FIRSTNAME");
        String lastname = getIntent().getStringExtra("LASTNAME");

        TextView textViewFirstname = (TextView) findViewById(R.id.fiche_firstname);
        TextView textViewLastname = (TextView) findViewById(R.id.fiche_lastname);

        textViewFirstname.setText(firstname);
        textViewLastname.setText(lastname);
    }
}
