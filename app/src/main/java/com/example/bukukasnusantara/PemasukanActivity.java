package com.example.bukukasnusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Calendar;

public class PemasukanActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    EditText tanggal, nominal, keterangan;
    ImageView tanggalButton;
    Button simpan, kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemasukan);
        tanggal = findViewById(R.id.et_date);
        nominal = findViewById(R.id.et_nominal);
        keterangan = findViewById(R.id.et_keterangan);
        tanggalButton = findViewById(R.id.iv_date);
        simpan = findViewById(R.id.btn_simpan);
        kembali = findViewById(R.id.btn_kembali);

        tanggalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });

        tanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth){
        String date = dayOfMonth + "/" + month + "/" + year;
        tanggal.setText(date);
    }
}