package com.example.catatan_pengeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView tvNamaValue, tvJumlahValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        tvNamaValue = findViewById(R.id.tvName);
        tvJumlahValue = findViewById(R.id.tvJumlahPengeluaran);

        Bundle bundle = getIntent().getExtras();
        tvNamaValue.setText(bundle.getString("KeyNama"));
        tvJumlahValue.setText(bundle.getString("keyJumlah"));


    }
}