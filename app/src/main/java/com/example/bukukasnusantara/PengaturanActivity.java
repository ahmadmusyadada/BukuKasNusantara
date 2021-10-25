package com.example.bukukasnusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PengaturanActivity extends AppCompatActivity {
    Button simpan, kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);

        simpan = findViewById(R.id.btn_simpan_pengeluaran);
        kembali = findViewById(R.id.btn_kembali_pengaturan);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}