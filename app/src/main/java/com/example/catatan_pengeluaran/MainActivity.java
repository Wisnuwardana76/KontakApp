package com.example.catatan_pengeluaran;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Deklarasi Variable
    TextView tvNama;
    EditText etJumlah;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi variable
        tvNama = findViewById(R.id.tvNama);
        etJumlah = findViewById(R.id.etJumlah);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder( MainActivity.this);

                //membuat judul alert dialog
                alertDialogBuilder.setTitle("Konfirmasi");

                // membuat pesan alert dialog
                alertDialogBuilder.setMessage("Apakah Anda yakin akan menyimpan data?")
                        .setIcon(R.drawable.ic_avatar)
                        .setCancelable(false)
                        .setPositiveButton("ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String nama = tvNama.getText().toString();
                                String jumlah = etJumlah.getText().toString();

                                // Pengecekan jumlah harus diisi
                                if (jumlah.isEmpty()){
                                    Toast.makeText(MainActivity.this, "Jumlah pengeluaran harus diisi", Toast.LENGTH_SHORT).show();
                                }else {
                                    //Opsi 1: Passing data via extras
                                    Bundle bundle = new Bundle();
                                    bundle.putString("KeyNama", nama);
                                    bundle.putString("keyJumlah", jumlah);
                                    Intent intent = new Intent(MainActivity.this, DataActivity.class);
                                    intent.putExtras(bundle);
                                    startActivity(intent);

                                }

                            }
                        })

                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                // membuat dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                //menampilkan dialog
                alertDialog.show();
            }
        });
    }
}