package com.example.raftiana.studycase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class hasil extends AppCompatActivity {

    int uangosas = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Bundle bundle = getIntent().getExtras();

        String judull = bundle.getString("judul");
        String namaMakanan = bundle.getString("namaMakan");
        int jumlahPorsi = bundle.getInt("jumlahPorsi");
        int totalharga = bundle.getInt("totalharga");

        TextView nama, porsi, harga, judul;
        judul = (TextView) findViewById(R.id.judul);
        nama = (TextView) findViewById(R.id.namaMakanan);
        porsi =(TextView) findViewById(R.id.jumlahPorsi);
        harga = (TextView) findViewById(R.id.totalHarga);

        judul.setText(judull);
        nama.setText(namaMakanan);
        porsi.setText(String.valueOf(jumlahPorsi));
        harga.setText(String.valueOf(totalharga));

        String bisa = "Disini aja makan malamnya";
        String tidak ="Jangan disini makan malamnya, uangmu tidak cukup";
        if (uangosas>totalharga){
            Toast.makeText(hasil.this, bisa, Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(hasil.this, tidak, Toast.LENGTH_LONG).show();
        }

    }
}
