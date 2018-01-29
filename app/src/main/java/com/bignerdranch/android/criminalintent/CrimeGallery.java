package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import java.util.UUID;

public class CrimeGallery extends ActionBarActivity {


    UUID crimeId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_gallery);

        Bundle cid = getIntent().getExtras();
        crimeId = (UUID) cid.get("crimeId");
    }
}
