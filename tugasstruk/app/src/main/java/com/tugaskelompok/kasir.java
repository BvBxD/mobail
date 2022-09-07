package com.tugaskelompok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kasir extends AppCompatActivity {

    Button ksrProses, balik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kasir);

        ksrProses = (Button) findViewById(R.id.kasirProses);
        balik = (Button) findViewById(R.id.kasirKembali);

        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(kasir.this, MainActivity.class);
                startActivity(pindah);
            }
        });
        ksrProses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(kasir.this, struk.class);
                startActivity(pindah);
            }
        });
    }
}