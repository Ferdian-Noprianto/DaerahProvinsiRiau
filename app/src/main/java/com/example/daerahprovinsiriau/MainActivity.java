package com.example.daerahprovinsiriau;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public Button btnsimpan;
    public EditText namakabupaten, namabupati, luaswilayah, tahunberdiri, jumlahpenduduk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsimpan = findViewById(R.id.btnsimpan);
        namakabupaten = findViewById(R.id.namakabupaten);
        namabupati = findViewById(R.id.namabupati);
        luaswilayah = findViewById(R.id.luaswilayah);
        tahunberdiri = findViewById(R.id.tahunberdiri);
        jumlahpenduduk = findViewById(R.id.jumlahpenduduk);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DaftarKabupaten.class);
                intent.putExtra("namakabupaten",namakabupaten.getText().toString());
                intent.putExtra("namabupati",namabupati.getText().toString());
                intent.putExtra("luaswilayah",luaswilayah.getText().toString());
                intent.putExtra("tahunberdiri",tahunberdiri.getText().toString());
                intent.putExtra("jumlahpenduduk",jumlahpenduduk.getText().toString());
                startActivity(intent);
            }
        });
    }
}