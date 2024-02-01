package com.example.latihanandroid10pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class KalkulatorAritmatik extends AppCompatActivity {
    //list widget
    EditText txtAngka1;
    EditText txtAngka2;
    Spinner spOperator;
    TextView tvHasil;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_aritmatik);
        //konek ke layout
        txtAngka1 = findViewById(R.id.txtAngkaSatu);
        txtAngka2 = findViewById(R.id.txtAngkaDua);
        tvHasil = findViewById(R.id.tvHasil);
        spOperator = findViewById(R.id.spOperator);
        btnHitung = findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //action kalkulasi angka1 dan 2
                int angka1 = Integer.parseInt(txtAngka1.getText().toString());
                int angka2 = Integer.parseInt(txtAngka2.getText().toString());
                int hasil = 0;
                String text = spOperator.getSelectedItem().toString();
                switch (text) {
                    case "Tambah":
                        hasil = angka1 + angka2;
                        tvHasil.setText(hasil + "");
                        break;

                    case "Kurang":
                        hasil = angka1 - angka2;
                        tvHasil.setText(hasil + "");
                        break;

                    case "Kali":
                        hasil = angka1 * angka2;
                        tvHasil.setText(hasil + "");
                        break;

                    case "Bagi":
                        double angka1double = Double.parseDouble(txtAngka1.getText().toString());
                        double angka2double = Double.parseDouble(txtAngka2.getText().toString());
                        double hasilDouble = angka1double/angka2double;
                        tvHasil.setText(hasilDouble+"");
                        break;


                }


            }
        });
    }
}