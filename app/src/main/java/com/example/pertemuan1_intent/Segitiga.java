package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    EditText alas, tinggi, hasil;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        alas = (EditText) findViewById(R.id.input_alas);
        tinggi = (EditText) findViewById(R.id.input_tinggi);
        hasil = (EditText) findViewById(R.id.output_luas);
        hitung = (Button) findViewById(R.id.btn_hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (alas.length() == 0 && tinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Alas dan Tinggi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else if (tinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else if (alas.length() == 0) {
                    Toast.makeText(getApplication(), "Alas tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    String alas1 = alas.getText().toString();
                    String tinggi1 =tinggi.getText().toString();
                    Double alas = Double.parseDouble(alas1);
                    Double tinggi = Double.parseDouble(tinggi1);
                    Double hs = LuasSegitiga(alas, tinggi);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double alas, double tinggi){return alas*tinggi/2;

    }

}
