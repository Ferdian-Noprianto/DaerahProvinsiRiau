package com.example.daerahprovinsiriau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaftarKabupaten extends AppCompatActivity {

    public Button btnkabupaten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_kabupaten);

        String namakabupaten = getIntent().getExtras().getString("namakabupaten");
        String namabupati = getIntent().getExtras().getString("namabupati");
        String luaswilayah = getIntent().getExtras().getString("luaswilayah");
        String tahunberdiri = getIntent().getExtras().getString("tahunberdiri");
        String jumlahpenduduk = getIntent().getExtras().getString("jumlahpenduduk");

        btnkabupaten = findViewById(R.id.btnkabupaten);
        btnkabupaten.setText(namakabupaten);

        btnkabupaten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarKabupaten.this, LihatKabupaten.class);
                intent.putExtra("namakabupaten",namakabupaten);
                intent.putExtra("namabupati",namabupati);
                intent.putExtra("luaswilayah",luaswilayah);
                intent.putExtra("tahunberdiri",tahunberdiri);
                intent.putExtra("jumlahpenduduk",jumlahpenduduk);
                startActivity(intent);
            }
        });
    }
}