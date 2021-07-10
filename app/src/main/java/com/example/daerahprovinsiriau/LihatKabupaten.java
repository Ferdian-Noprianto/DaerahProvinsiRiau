package com.example.daerahprovinsiriau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LihatKabupaten extends AppCompatActivity {

    public Button btnedit, btnhapus;
    public EditText namakabupaten1, namabupati1, luaswilayah1, tahunberdiri1, jumlahpenduduk1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_kabupaten);

        String kabupaten = getIntent().getExtras().getString("namakabupaten");
        String bupati = getIntent().getExtras().getString("namabupati");
        String luas = getIntent().getExtras().getString("luaswilayah");
        String tahun = getIntent().getExtras().getString("tahunberdiri");
        String penduduk = getIntent().getExtras().getString("jumlahpenduduk");

        btnedit = findViewById(R.id.btnedit);
        btnhapus = findViewById(R.id.btnhapus);
        namakabupaten1 = findViewById(R.id.namakabupaten1);
        namabupati1 = findViewById(R.id.namabupati1);
        luaswilayah1 = findViewById(R.id.luaswilayah1);
        tahunberdiri1 = findViewById(R.id.tahunberdiri1);
        jumlahpenduduk1 = findViewById(R.id.jumlahpenduduk1);

        namakabupaten1.setText(kabupaten);
        namabupati1.setText(bupati);
        luaswilayah1.setText(luas);
        tahunberdiri1.setText(tahun);
        jumlahpenduduk1.setText(penduduk);

        btnedit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LihatKabupaten.this, DaftarKabupaten.class);
                intent.putExtra("namakabupaten",namakabupaten1.getText().toString());
                intent.putExtra("namabupati",namabupati1.getText().toString());
                intent.putExtra("luaswilayah",luaswilayah1.getText().toString());
                intent.putExtra("tahunberdiri",tahunberdiri1.getText().toString());
                intent.putExtra("jumlahpenduduk",jumlahpenduduk1.getText().toString());
                startActivity(intent);
            }
        });

        btnhapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateUpTo(new Intent(getBaseContext(), MainActivity.class));
            }
        });

    }
}