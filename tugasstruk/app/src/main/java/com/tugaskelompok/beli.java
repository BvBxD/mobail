package com.tugaskelompok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class beli extends AppCompatActivity {

    EditText beliMetode, beliNoHP, beliNominal;
    Button bliProses, bliHapus, bliKeluar, bliKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beli);

        beliMetode = (EditText) findViewById(R.id.eMetode);
        beliNoHP = (EditText) findViewById(R.id.eNoHP);
        beliNominal = (EditText) findViewById(R.id.eNominal);

        bliProses = (Button) findViewById(R.id.beliProses);
        bliHapus = (Button) findViewById(R.id.beliHapus);
        bliKeluar = (Button) findViewById(R.id.beliKeluar);
        bliKembali = (Button) findViewById(R.id.beliKembali);

        bliProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sMetode = beliMetode.getText().toString(),
                        sNoHP = beliNoHP.getText().toString(),
                        sNominal = beliNominal.getText().toString();
                Intent beliHasil = new Intent(beli.this, hasil.class);

                beliHasil.putExtra("metode", sMetode);
                beliHasil.putExtra("noHP", sNoHP);
                beliHasil.putExtra("nominal", sNominal);

                startActivity(beliHasil);
            }
        });
        bliHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beliMetode.setText("");
                beliNoHP.setText("");
                beliNominal.setText("");
            }
        });
        bliKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_MAIN);
//                intent.addCategory(Intent.CATEGORY_HOME);
//                startActivity(intent);
                finishAffinity();
            }
        });
        bliKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balik = new Intent(beli.this, MainActivity.class);
                startActivity(balik);
            }
        });
    }
}