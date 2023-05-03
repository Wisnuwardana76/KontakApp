package com.example.catatan_pengeluaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    private String nama;
    private int jumlahPengeluaran;
    private int totalPengeluaran;
    private int hasilPengeluaran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        // Ambil Bundle dari Intent
        Bundle bundle = getIntent().getExtras();

        // Ambil nilai dari Bundle dan simpan ke dalam variabel-variabel yang telah dideklarasikan
        nama = bundle.getString("KeyNama");
        jumlahPengeluaran = bundle.getInt("keyJumlah");
        totalPengeluaran = bundle.getInt("keytotal");
        hasilPengeluaran = bundle.getInt("keyHasil");

        // Tampilkan nilai pada TextView di layout DataActivity
        TextView tvNama = findViewById(R.id.tvName);
        tvNama.setText(nama);

        TextView tvJumlah = findViewById(R.id.tvJumlahPengeluaran);
        tvJumlah.setText(Integer.toString(jumlahPengeluaran));

        TextView tvTotal = findViewById(R.id.tvTotalPengeluaran);
        tvTotal.setText(Integer.toString(totalPengeluaran));

        TextView tvHasil = findViewById(R.id.tv_hasil);
        tvHasil.setText(Integer.toString(hasilPengeluaran));



    }
}