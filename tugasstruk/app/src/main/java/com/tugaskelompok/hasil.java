package com.tugaskelompok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    TextView metoode, kode;
    static String randomChar(int length) {
        String semuaChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789";
        StringBuilder sb = new StringBuilder(length);
        for(int i = 0; i < length; i++) {
            int index = (int) (semuaChar.length() * Math.random());
            sb.append(semuaChar.charAt(index));
        }
        return sb.toString();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        metoode = (TextView) findViewById(R.id.metode2);
        kode = (TextView) findViewById(R.id.kodepembayaran);

        String kodes = randomChar(12);
        String data = getIntent().getExtras().getString("metode");
        //Toast.makeText(getApplicationContext(), "Terima Kasih Sudah pesan", Toast.LENGTH_LONG).show();
        metoode.setText(data);
        kode.setText(kodes);
    }
}