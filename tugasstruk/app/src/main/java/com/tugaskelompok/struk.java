package com.tugaskelompok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class struk extends AppCompatActivity {
    TextView coba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);
        coba = (TextView) findViewById(R.id.date);

        SimpleDateFormat date = new SimpleDateFormat("dd-MMMM-yyyy HH:mm", Locale.getDefault());
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, 1);
        String newDate = date.format(c.getTime());
        coba.setText(newDate);
        
    }
}