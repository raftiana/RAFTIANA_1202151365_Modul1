package com.example.raftiana.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int harganasiabnormal = 30000;
    int harganasieatbus = 50000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEatbus(View view) {
        final EditText inmakan, inporsi;
        inmakan = (EditText) findViewById(R.id.inputMakan);
        inporsi = (EditText) findViewById(R.id.inputPorsi);

        String judul = "Makan Malam EATBUS";
        String namaMakan = inmakan.getText().toString();
        int jumlahPorsi = Integer.parseInt(inporsi.getText().toString());
        int totalhargaeatbus = harganasieatbus * jumlahPorsi;

        Intent intentEatbus = new Intent(getApplicationContext(), hasil.class);

        intentEatbus.putExtra("judul", judul);
        intentEatbus.putExtra("namaMakan", namaMakan);
        intentEatbus.putExtra("jumlahPorsi", jumlahPorsi);
        intentEatbus.putExtra("totalharga", totalhargaeatbus);
        startActivity(intentEatbus);
    }

    public void clickAbnormal(View view) {
        final EditText inmakan, inporsi;
        inmakan = (EditText) findViewById(R.id.inputMakan);
        inporsi = (EditText) findViewById(R.id.inputPorsi);

        String judul = "Makan Malam ABNORMAL";
        String namaMakan = inmakan.getText().toString();
        int jumlahPorsi = Integer.parseInt(inporsi.getText().toString());
        int totalhargaabnormal = harganasiabnormal * jumlahPorsi;

        Intent intentAbnormal = new Intent(getApplicationContext(), hasil.class);

        intentAbnormal.putExtra("judul", judul);
        intentAbnormal.putExtra("namaMakan", namaMakan);
        intentAbnormal.putExtra("jumlahPorsi", jumlahPorsi);
        intentAbnormal.putExtra("totalharga", totalhargaabnormal);
        startActivity(intentAbnormal);
    }
}
