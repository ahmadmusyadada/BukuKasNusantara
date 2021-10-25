package com.example.bukukasnusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView pemasukan, pengeluaran, detail, pengaturan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pemasukan = findViewById(R.id.iv_pemasukan);
        pengeluaran = findViewById(R.id.iv_pengeluaran);
        detail = findViewById(R.id.iv_detail);
        pengaturan = findViewById(R.id.iv_pengaturan);

        pemasukan.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, PemasukanActivity.class);
                startActivity(mainIntent);
            }
        });

        pengeluaran.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, PengeluaranActivity.class);
                startActivity(mainIntent);
            }
        });

        detail.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(mainIntent);
            }
        });

        pengaturan.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, PengaturanActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}