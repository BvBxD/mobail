package com.tugaskelompok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button batenBeli, batenKasir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        batenBeli = (Button) findViewById(R.id.btnBeli);
        batenKasir = (Button) findViewById(R.id.btnKasir);

        batenBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainBeli = new Intent(MainActivity.this, beli.class);
                startActivity(mainBeli);
            }
        });
        batenKasir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainKasir = new Intent(MainActivity.this, kasir.class);
                startActivity(mainKasir);
            }
        });
    }
}